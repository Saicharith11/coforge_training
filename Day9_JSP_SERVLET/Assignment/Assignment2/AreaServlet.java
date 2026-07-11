package com.coforge.Assignment2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AreaServlet")
public class AreaServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        double radius =
            Double.parseDouble((String) request.getAttribute("radius"));

        double area = Math.PI * radius * radius;

        out.println("<h2>Area of Circle</h2>");

        out.println("Radius : " + radius + "<br><br>");

        out.println("Area : " + area);
    }
}