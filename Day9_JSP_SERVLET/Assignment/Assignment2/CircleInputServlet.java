package com.coforge.Assignment2;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CircleInputServlet")
public class CircleInputServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String radius = request.getParameter("radius");

        request.setAttribute("radius", radius);

        RequestDispatcher rd =
                request.getRequestDispatcher("AreaServlet");

        rd.forward(request, response);
    }
}
