<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Success</title>
</head>
<body>

	Cookie[] cookies = request.getCookies();
    <h2 style="color:green;">Login Successful!</h2>
    <p>Welcome, <%= session.getAttribute("username") %> 🎉</p>
    
    <p>You have successfully logged in.</p>
    <a href="home.jsp">Go to Home Page</a>
</body>
</html>