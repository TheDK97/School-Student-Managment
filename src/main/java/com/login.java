package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DBService.DBService;

@WebServlet("/log")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
   	 String userId=request.getParameter("uname");
   	 String pass=request.getParameter("pass");
   	 
   	 boolean ragi = DBService.login(userId,pass);
   	String target;
	if(ragi) {

	  target ="Main.jsp";
	  HttpSession session =request.getSession(false);
	  if(session!=null) {
		  session.invalidate();
	  }
	 session =request.getSession(true);
	 session.setAttribute("session",userId);
		request.setAttribute("msg", "User Login successfully");

	}else {
		 target ="Login.jsp";
		request.setAttribute("msg", "UserId and Password Wroung");
	}

	RequestDispatcher rd =request.getRequestDispatcher("/"+target);
	rd.forward(request, response);
}

   	
   	
   	
}
