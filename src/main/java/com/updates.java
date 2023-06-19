package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBService.DBService;
import DTO.Student;
@WebServlet("/update")
public class updates extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   	 String Name=request.getParameter("name");
		 String userId=request.getParameter("uname");
		 String email=request.getParameter("email");
		 String phone=request.getParameter("phone");
		 String pass=request.getParameter("pass");
		 
		 String address=request.getParameter("address");


		Student s1 =new Student();
		s1.setName(Name);
		s1.setUserId(userId);
		s1.setPhone(phone);
		
		s1.setAddress(address);
		s1.setPass(pass);
		s1.setEmail(email);

		boolean res =DBService.update(s1);
		String target ="index.jsp";
		if(res) {
			target="Main.jsp";
		}else {
		 target ="index.jsp";
		}
	      
	RequestDispatcher rd =request.getRequestDispatcher("/"+target);
	rd.forward(request, response);

	
   	
   	}

}
