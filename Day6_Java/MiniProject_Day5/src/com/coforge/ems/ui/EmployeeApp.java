package com.coforge.ems.ui;

import java.util.List;
import java.util.Scanner;

import com.coforge.ems.controller.EmployeeController;
import com.coforge.ems.model.Employee;

public class EmployeeApp {

	// Creating controller object
	private static final EmployeeController controller = new EmployeeController();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String choice = " ";
		String message = "";

		do {
			// Displaying employee menu
			System.out.println("\n===== EMPLOYEE MANAGEMENT MENU =====");
			System.out.println("1. Add Employee");
			System.out.println("2. Modify Employee");
			System.out.println("3. Remove Employee");
			System.out.println("4. Search Employee");
			System.out.println("5. View All Employees");
			System.out.println("6. Exit");
			System.out.print("Choose an option: ");

			int option = sc.nextInt();

			switch (option) {

			case 1:
				System.out.println("Enter ID, Name, Salary and Department Number:");

				Employee emp = new Employee(sc.nextInt(), sc.next(), sc.nextInt(),
						sc.nextInt());

				message = controller.createEmployee(emp);
				System.out.println(message);
				break;

			case 2:
				System.out.println("Enter ID and the updated Name, Salary and Department Number:");

				emp = new Employee(sc.nextInt(), sc.next(), sc.nextInt(),
						sc.nextInt());

				message = controller.updateEmployee(emp);
				System.out.println(message);
				break;

			case 3:
				System.out.print("Enter the Employee ID to remove: ");

				int empId = sc.nextInt();

				message = controller.deleteEmployee(empId);
				System.out.println(message);
				break;

			case 4:
				System.out.print("Enter the Employee ID to search: ");

				empId = sc.nextInt();

				Employee empDetails = controller.findEmployee(empId);

				// Checking whether employee exists
				if (empDetails != null)
					System.out.println("Employee Found: " + empDetails);
				else
					System.out.println("No employee found with this ID.");

				break;

			case 5:
				System.out.println("\nAll Employee Records:");

				List<Employee> empList = controller.findAllEmployees();

				// Displaying all employee records
				if (empList != null && !empList.isEmpty()) {

					for (Employee empRecord : empList) {
						System.out.println(empRecord);
					}

				} else {
					System.out.println("Employee list is empty.");
				}

				break;

			case 6:
				System.out.println("Closing Employee Management System...");
				System.exit(0);
				break;

			default:
				System.out.println("Please enter a valid menu option.");
				break;
			}

			System.out.print("\nWould you like to continue? (Yes / No): ");
			choice = sc.next();

		} while (choice.equalsIgnoreCase("Yes"));
	}
}