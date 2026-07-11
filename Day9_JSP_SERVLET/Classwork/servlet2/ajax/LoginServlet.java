package com.coforge.servlet2.ajax;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "1234".equals(password)) {
            // Create session
            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            // Create cookie
            Cookie cookie = new Cookie("Username", username);
            response.addCookie(cookie);

            // Forward to JSP (choose forward OR redirect)
            RequestDispatcher dispatcher = request.getRequestDispatcher("loginSuccess.jsp");
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect("loginFailure.jsp");
        }
    }
}

