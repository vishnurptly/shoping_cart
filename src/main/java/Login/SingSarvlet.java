package Login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SingSarvlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("work1");
		
		
		String username=request.getParameter("Login-username");
		String password=request.getParameter("Login-password");
		RequestDispatcher dispatcher=null;

		System.out.println("work2");
		
		
		 try {
	         
			 // loading drivers for mysql
	            Class.forName("com.mysql.jdbc.Driver");
	             
	            //creating connection with the database 
	            Connection con = DriverManager.getConnection
	                        ("jdbc:mysql://localhost:3306/logDao","root","root");
	            System.out.println("work3");
	            PreparedStatement ps = con.prepareStatement
	                        ("insert into log(username,password) values(?,?)");
	 
	            ps.setString(1, username);
	            ps.setString(2, password);
	            System.out.println("work4");
	            int i = ps.executeUpdate();
	             dispatcher=request.getRequestDispatcher(password);
	            if(i > 0) {
	            	
	            	 request.getRequestDispatcher("login.jsp").forward(request, response);
	                System.out.println("work5");
	            }
	         
	        }
	        catch(Exception se) {
	            se.printStackTrace();
	        }
		
	     
	    }
		}
	


