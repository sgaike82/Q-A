package org.Intutech.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.Intutech.bean.Contact;
import org.Intutech.model.QAModel;

/**
 * Servlet implementation class loginValidation
 */
@WebServlet("/login-validation")
public class loginValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Contact co=new Contact();
		co.setName(request.getParameter("name"));
		co.setPass(request.getParameter("pass"));
			
		QAModel model=new QAModel();
		boolean result = model.validate(co);
		
		if(result== true) {
			response.sendRedirect("view.jsp");
	
			
			
		}
		
		else {
			response.sendRedirect("login.jsp?code=202");
		}
			
	}

}
