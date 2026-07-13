<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Management System</title>

<link rel="stylesheet" href="EMSStyle.css">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
	rel="stylesheet">

<script src="AjaxScript.js"></script>

</head>

<body>

	<div class="header">
		<h1>Employee Management System</h1>
	</div>

	<br>

	<form action="EmployeeServlet" method="post">

		<div class="content">

			<table>

				<tr>
					<td>Employee ID</td>
					<td>
						<input type="text"
							name="eid"
							id="eid"
							onblur="getEmployeeDetails()">
					</td>
				</tr>

				<tr>
					<td>Employee Name</td>
					<td>
						<input type="text"
							name="ename"
							id="ename">
					</td>
				</tr>

				<tr>
					<td>Employee Salary</td>
					<td>
						<input type="text"
							name="esalary"
							id="esalary">
					</td>
				</tr>

				<tr>
					<td>Department Number</td>
					<td>
						<input type="text"
							name="dno"
							id="dno">
					</td>
				</tr>

			</table>

			<br>

			<input type="submit" value="Insert"
				name="emsButton"
				class="btn btn-primary">

			<input type="submit" value="Update"
				name="emsButton"
				class="btn btn-warning">

			<input type="submit" value="Delete"
				name="emsButton"
				class="btn btn-danger">

			<input type="submit" value="Find"
				name="emsButton"
				class="btn btn-success">

			<input type="submit" value="FindAll"
				name="emsButton"
				class="btn btn-info">

		</div>

	</form>

	<br>

	<%
	String result = request.getParameter("result");

	if(result != null){
	%>

	<div class="alert alert-primary">
		<center>
			<b><%=result%></b>
		</center>
	</div>

	<%
	}
	%>

</body>
</html>