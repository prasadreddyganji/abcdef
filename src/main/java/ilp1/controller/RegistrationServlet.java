package ilp1.controller;

import java.io.IOException;
import ilp1.bean.User;
import ilp1.dao.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String pass=request.getParameter("psw");
		String confirmPass=request.getParameter("psw-repeat");
		if(pass.equals(confirmPass)) {
			User u = new User(email,pass);
			UserDAO dao = new UserDAO();
				
			if(dao.addUser(u))
				response.sendRedirect("userRegistrationSuccess.jsp");
			else
				response.sendRedirect("userRegistrationFail.jsp");
		}
		else {
			response.sendRedirect("userRegistrationFail.jsp");
		}
	}

}
