package ilp1.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ilp1.dao.UserDAO;
import ilp1.bean.User;


public class ResetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uId=request.getParameter("emailId");
		User usr = new User(uId, null);
		UserDAO dao = new UserDAO();
				
		if(dao.resetUser(usr))
			response.sendRedirect("resetSuccess.jsp");
		else
			response.sendRedirect("resetFail.jsp");
		
	}

}
