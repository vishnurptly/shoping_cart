package Login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class profilservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		System.out.println("success1");
		String name=request.getParameter("Name");
		String email=request.getParameter("Email");
		String address=request.getParameter("Addresss");
		String address2=request.getParameter("Address2");
		String City=request.getParameter("City");
		String state=request.getParameter("State");
		String pin=request.getParameter("Pin");
		
		profilebm pro =new profilebm();
		
		
		pro.setName(name);
		pro.setEmail(email);
		pro.setAddresss(address);
		pro.setAddress2(address2);
		pro.setCity(City);
		pro.setState(state);
		pro.setPin(pin);
		
		int Status= profileDao.save(pro);
		if (Status>0) {
			out.print("<p>Record saved successfully!</p>");
			request.getRequestDispatcher("index.html").include(request, response);
		}else{
			out.println("Sorry! unable to save record");
		}
		request.getRequestDispatcher("Addservlet.java").forward(request, response);
			out.close();
	}

	

}
