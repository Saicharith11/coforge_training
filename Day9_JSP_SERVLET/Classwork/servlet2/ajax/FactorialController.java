package com.coforge.servlet2.ajax;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/FactorialController")
public class FactorialController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n = Integer.parseInt(request.getParameter("n"));
		int fact = 1;
		for(int i = 1 ; i <= n ; i++) {
			fact = fact * i;
		}
		response.sendRedirect("FactorialOutput.jsp?n="+n+"&fact="+fact);
		
	}

}
