package Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class logDao  {
	public static String authenticateUser(User Us) {
	
	String username = Us.getusername();
    String password = Us.getPassword();
 
    Connection con = null;
    Statement statement = null;
    ResultSet resultSet = null;
 
    String usernamedata = "";
    String passworddata = "";
    
    
 
    try
    {
        con = dataConnection.createConnection();
        statement = con.createStatement();
        resultSet = statement.executeQuery("select username,password from log");
 
        while(resultSet.next())
        {
            usernamedata = resultSet.getString("username");
            passworddata = resultSet.getString("password");
           
 
            if(username.equals(usernamedata) && password.equals(passworddata))
            return "Admin_Role";
            
        }
    }
    catch(SQLException e)
    {
        e.printStackTrace();
    }
    return "Invalid user credentials";


	}

	public PreparedStatement prepareStatement(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	
	


	
}
