<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management System</title>
<link href="EmpStyle.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<div class="header">
		<h1>Employee Mangement System</h1>

	</div>
	<br />
	<form action="employee" method="post">
		<div class="content">
			<table class="LoginDiv">
				<tr>
					<td>Id</td>
					<td>:</td>
					<td><input type="number" name="eid"></td>
				</tr>

				<tr>
					<td>Name</td>
					<td>:</td>
					<td><input type="text" name="ename"></td>
				</tr>

				<tr>
					<td>Salary</td>
					<td>:</td>
					<td><input type="number" name="esalary"></td>
				</tr>

				<tr>
					<td>DeptNo</td>
					<td>:</td>
					<td><input type="number" name="dno"></td>
				</tr>
			</table>

			<br> <input type="submit" name="Insert" value="Insert" class="btn-primary"></input>
			&nbsp; &nbsp; <input type="submit" name="Update" value="Update" class="btn-danger"></input>
			&nbsp; &nbsp; <input type="submit" value="Delete" class="btn-info"></input>
			&nbsp; &nbsp; <input type="submit" value="Find" class="btn-success"></input>
			&nbsp; &nbsp; <input type="submit" value="FindAll"
				class="btn-warning"></input> &nbsp; &nbsp; <br> <br>
			<br />
		</div>
		</form>
		<br />
		<div>
		<!-- expression language -->
			<b>${result}</b>
		</div>
</body>
</html>