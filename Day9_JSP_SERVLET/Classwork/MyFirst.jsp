<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- Declaration tag --%>
	<%! 
		String name = "Sai";
		int a = 10 , b = 20;
	
	%>
	<%-- JSP Scriptlet tag --%>
	
	<%
	
		out.println(" <br> Welcome : " + name);
		if( a > b) 
			out.println(" <br> a ia Big");
		else 
			out.println(" <br> b ia Big");
		
		
		int sum = a + b;
	
	%>
	<br>
		<%-- JSP Expression tag --%>
		sum = <%=sum %>
</body>
</html>