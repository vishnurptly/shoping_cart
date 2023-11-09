package Login;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String username = request.getParameter("Login-username");
		    String password = request.getParameter("Login-password");
		    
		    User Us = new User();
		 
		    Us.setusername(username);
		    Us.setPassword(password);
		 
		    @SuppressWarnings("unused")
			logDao logdao = new logDao();
		 
		    try
		    {
		        String userValidate = logDao.authenticateUser(Us);
		 
		        if(userValidate.equals("Admin_Role"))
		        {
		            
		 
		            HttpSession session = request.getSession(); //Creating a session
		            session.setAttribute("Admin", username); //setting session attribute
		            request.setAttribute("username", username);
		 
		            request.getRequestDispatcher("index.jsp").forward(request, response);
		        }
		        
		        else
		        {
		            System.out.println("Error message = "+userValidate);
		            request.setAttribute("errMessage", userValidate);
		 
		            request.getRequestDispatcher("login.jsp").forward(request, response);
		        }
		    }
		    catch (IOException e1)
		    {
		        e1.printStackTrace();
		    }
		    catch (Exception e2)
		    {
		        e2.printStackTrace();
		    }
		
	}

}
