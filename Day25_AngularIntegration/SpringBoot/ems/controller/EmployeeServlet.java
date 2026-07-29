package com.coforge.ems.controller;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;
import com.coforge.ems.service.EmployeeService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private EmployeeService service = new EmployeeService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("emsbutton");
        String message = "";

        try {

            switch (action) {

            case "Insert": {

                int eid = Integer.parseInt(request.getParameter("eid"));
                String ename = request.getParameter("ename");
                int esalary = Integer.parseInt(request.getParameter("esalary"));
                int dno = Integer.parseInt(request.getParameter("dno"));

                Employee employee = new Employee(eid, ename, esalary, dno);

                int rows = service.createEmployee(employee);

                if (rows > 0)
                    message = "SUCCESS : Employee Record Inserted";
                else
                    message = "FAILED : Could not insert employee";

                break;
            }

            case "Update": {

                int eid = Integer.parseInt(request.getParameter("eid"));
                String ename = request.getParameter("ename");
                int esalary = Integer.parseInt(request.getParameter("esalary"));
                int dno = Integer.parseInt(request.getParameter("dno"));

                Employee employee = new Employee(eid, ename, esalary, dno);

                int rows = service.updateEmployee(employee);

                if (rows > 0)
                    message = "SUCCESS : Employee Record Updated";
                else
                    message = "FAILED : Employee ID not found";

                break;
            }

            case "Delete": {

                int eid = Integer.parseInt(request.getParameter("eid"));

                int rows = service.deleteEmployee(eid);

                if (rows > 0)
                    message = "SUCCESS : Employee Record Deleted";
                else
                    message = "FAILED : Employee ID not found";

                break;
            }

            case "Find": {

                int eid = Integer.parseInt(request.getParameter("eid"));

                Employee employee = service.findEmployee(eid);

                if (employee != null) {
                    request.setAttribute("employee", employee);
                    message = "SUCCESS : Employee Found";
                } else {
                    message = "FAILED : Employee ID not found";
                }

                break;
            }

            case "FindAll": {

                List<Employee> employeeList = service.findAllEmployee();

                request.setAttribute("employeeList", employeeList);

                message = "SUCCESS : " + employeeList.size() + " Employee(s) Found";

                break;
            }

            default:
                message = "FAILED : Unknown Action";
            }

        } catch (NumberFormatException e) {

            message = "FAILED : Employee ID, Salary and Department Number must be numeric";

        } catch (InvalidEmployeeObjectException e) {

            message = e.getMessage();

        } catch (ClassNotFoundException | SQLException e) {

            message = "FAILED : Database Error - " + e.getMessage();
        }

        request.setAttribute("message", message);

        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
    }
}