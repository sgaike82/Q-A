package org.Intutech.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.Intutech.bean.Contact;
import org.Intutech.model.QAModel;

@WebServlet("/save-details")
public class SaveRegistrationDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id = 0;
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String pass = request.getParameter("Password");
		
		Contact co = new Contact();
		co.setId(id);
		co.setName(name);
		co.setCity(city);
		co.setPass(pass);
		
		
		QAModel model=new QAModel();
		boolean result = model.create(co);
		
		if(result) {
			response.sendRedirect("login.jsp?code=101");
		}else {
			response.sendRedirect("NewRegistration.jsp?code=102");
		}
	}

}
