package Login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Addservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("sucess ok");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		
		List<profilebm> list=profileDao.allid();
		
		System.out.println("sucess ok2");
		 out.print("<form >");
		out.print("<div >");
		System.out.println("sucess ok2.1");
		for(profilebm e:list){
			System.out.println("sucess add");
			out.print("<tr><th>Id</th><th>"+e.getId()+"</th></tr>");
				out.print("<tr><th>Name</th><th>"+e.getName()+"</th></tr>");
		 
				out.print("</div>");
				out.print(" <div >");
					out.print(" <tr><th>Email</th><th>"+e.getEmail()+"</th></tr>");
		  
						out.print(" </div>");
					out.print("<div >");
					out.print("<tr><th>Address</th><th>"+e.getAddresss()+" </th></tr>");
		    
					out.print("</div>");
				out.print(" <div >");
					out.print(" <tr><th>Address 2</th><th>"+e.getAddress2()+"</th></tr>");
					System.out.println("sucess ok3");
							out.print(" </div>");
						out.print(" <div >");
							out.print(" <tr><th>City</th><th>"+e.getCity()+" </th></tr>");
		   
								out.print("</div>");
								out.print(" <div >");
							out.print(" <tr><th>State</th><th>"+e.getState()+"</th></tr>");
		   
						out.print("</div>");
						out.print("<div >");
						out.print(" <tr><th>Pin</th><th>"+e.getPin()+" </th></tr>");
		   
						out.print(" </div>");
						
						
						System.out.println("sucess add4");
		}
	}
	}


