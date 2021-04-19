package ilp1.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ilp1.bean.User;
import ilp1.dao.UserDAO;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uId=request.getParameter("userId");
		String pass=request.getParameter("password");
		User usr = new User(uId, pass);
		UserDAO dao = new UserDAO();
				
		if(dao.validate(usr))
			response.sendRedirect("success.jsp");
		else
			response.sendRedirect("fail.jsp");
	}

}
