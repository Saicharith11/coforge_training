CREATE DATABASE EmployeeManagement;
USE EmployeeManagement;

CREATE TABLE Department (
   DeptID INT PRIMARY KEY,
   DeptName VARCHAR(50),
   Location VARCHAR(50)
);

INSERT INTO Department VALUES
(101,'HR','Hyderabad'),
(102,'Finance','Mumbai'),
(103,'IT','Bangalore'),
(104,'Sales','Chennai');

CREATE TABLE Employee (
   EmpID INT PRIMARY KEY,
   EmpName VARCHAR(50),
   Gender VARCHAR(10),
   Age INT,
   Salary DECIMAL(10,2),
   Designation VARCHAR(50),
   DeptID INT,
   HireDate DATE,
   FOREIGN KEY (DeptID) REFERENCES Department(DeptID)
);


INSERT INTO Employee VALUES
(1,'Amit','Male',28,45000,'Software Engineer',103,'2022-05-10'),
(2,'Priya','Female',30,55000,'HR Manager',101,'2021-03-15'),
(3,'Rahul','Male',27,50000,'Accountant',102,'2023-01-20'),
(4,'Sneha','Female',25,42000,'Sales Executive',104,'2022-09-12'),
(5,'Kiran','Male',31,60000,'Team Lead',103,'2020-11-18');

CREATE TABLE Attendance (
   AttendanceID INT PRIMARY KEY,
   EmpID INT,
   AttendanceDate DATE,
   Status VARCHAR(10),
   FOREIGN KEY (EmpID) REFERENCES Employee(EmpID)
);

INSERT INTO Attendance VALUES
(1,1,'2026-07-01','Present'),
(2,2,'2026-07-01','Present'),
(3,3,'2026-07-01','Absent'),
(4,4,'2026-07-01','Present'),
(5,5,'2026-07-01','Present');

# Basic Queries
#1. Display all employees.

select * from employee;
#2. Display employee names and salaries.
select EmpName , Salary from employee;

#3. Display employees whose salary is greater than 50,000.
select EmpName from employee where Salary > 50000;

#4. Display employees older than 30 years.
select EmpName from employee where Salary > 30;

select * from department
# WHERE Clause
#5. Display employees from the IT department.
select * from employee where DeptID IN ( select DeptID from department where DeptName =  'IT' );

#6. Display female employees.
select * from employee where Gender = 'Female';

#7. Display employees hired after 2022-01-01.
select * from employee where HireDate > '2022-01-01'

#ORDER BY
#8. Sort employees by salary (highest first).
select * from employee order by Salary Desc;

#9. Sort employees by name.
select * from employee order by EmpName;

#Aggregate Functions

#10. Count total employees.
select count(*) from employee;

#11. Find the highest salary.
select max(Salary) from employee;

#12. Find the lowest salary.
select min(Salary) from employee;

#13. Find the average salary.
select avg(Salary) from employee;

#14. Find the total salary paid.
select sum(Salary) from employee;

#GROUP BY
#15. Count employees in each department.
select DeptID , count(*) from employee group by DeptID;

#16. Find the average salary by department.
select DeptID , avg(Salary) from employee group by DeptID;

#17. Find the highest salary in each department.
select DeptID , max(Salary) from employee group by DeptID;

#JOIN Queries
#18. Display employee names with their department names.
SELECT e.EmpName, d.DeptName
FROM Employee e
JOIN Department d
ON e.DeptID = d.DeptID;
#19. Display employee names, department names, and locations.
SELECT e.EmpName, d.DeptName, d.Location
FROM Employee e
JOIN Department d
ON e.DeptID = d.DeptID;
#20. Display attendance details along with employee names.
SELECT e.EmpName,
       a.AttendanceID,
       a.AttendanceDate,
       a.Status
FROM Employee e
JOIN Attendance a
ON e.EmpID = a.EmpID;

#UPDATE
#21. Increase salary by 10% for IT employees.
UPDATE Employee
SET Salary = Salary * 1.10
WHERE DeptID = (
    SELECT DeptID
    FROM Department
    WHERE DeptName = 'IT'
);
#22. Change the designation of an employee.
UPDATE Employee
SET Designation = 'Senior Software Engineer'
WHERE EmpName = 'Amit';
#23. Update the department of an employee.
UPDATE Employee
SET DeptID = 103
WHERE EmpName = 'Rahul';

DELETE
#24. Delete employees with salary less than 40,000.
DELETE FROM Employee
WHERE Salary < 40000;
#25. Delete attendance records for a specific date.
DELETE FROM Attendance
WHERE AttendanceDate = '2026-07-01';

#26. View
select * from employee;
create view my_veiw as select * from employee where deptid = 103;
select * from my_veiw;
update my_veiw set age = 30 where empname = "Amit";
drop view my_veiw;

# Stored Procedure
DELIMITER //

CREATE PROCEDURE GetEmployees()
BEGIN
   SELECT * FROM Employee;
END //

CALL GetEmployees();

