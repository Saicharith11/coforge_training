<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.Date" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Assignment</title>
</head>
<body>

<h1>1. Welcome to JSP</h1>

<h2>2. Current Date and Time</h2>

<%= new Date() %>

<hr>

<h2>3. JSP Scripting Elements</h2>

<%!
int number = 10;

public int square(int x){
    return x * x;
}
%>

<%
out.println("Value of number : " + number + "<br>");
%>

Square of 10 is :

<%= square(number) %>

<hr>

<h2>4. Multiplication Table of 5</h2>

<%
for(int i=1;i<=10;i++){
    out.println("5 x " + i + " = " + (5*i) + "<br>");
}
%>

</body>
</html>