	package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class dataConnection  {
	  public static Connection createConnection()
	    {
	    	Connection con = null;
		    String url = "jdbc:mysql://localhost:3306/logDao?useSSL=false";
		    String username = "root";
		    String password = "root";
	 
	    try
	    {
	    	try {
	    	    Class.forName("com.mysql.cj.jdbc.Driver");
	    	} catch (ClassNotFoundException e1) {
	    	    e1.printStackTrace();
	    	}
	        
	        con = DriverManager.getConnection(url, username, password);
	        System.out.println("SQLConncetion success");
	    }
	    catch (SQLException e)
	    {
	    	 System.out.println("An error occurred. Maybe username/password is invalid");
	         e.printStackTrace();
	    }
	    
		return con;
	    }

}
