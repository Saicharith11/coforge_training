package com.coforge.servlet1.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmailCheckServlet
 */
@WebServlet("/EmailCheckServlet")
public class EmailCheckServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email1");
		
		if(email != null && email.equals("saicharith11@gmail.com")) {
			out.println("<b><font color='green'>Valid</font></b>");
		}
		else {
			out.println("<b><font color='red'>Invalid</font></b>");
		}
	}

}
