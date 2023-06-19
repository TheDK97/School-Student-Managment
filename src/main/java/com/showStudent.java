package com;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBService.DBService;

/**
 * Servlet implementation class showStudent
 */
@WebServlet("/all")
public class showStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Vector v1 = DBService.display();
    request.setAttribute("data", v1);
	RequestDispatcher rd = getServletContext().getRequestDispatcher("/Cdisplay.jsp");
	rd.include(request, response);

   	
   	}

}
