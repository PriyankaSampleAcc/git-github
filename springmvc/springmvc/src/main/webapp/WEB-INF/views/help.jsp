<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Wecome</title>
</head>
<body>
	<h3>This is help page of our site!</h3>
	<%
		String name = (String) request.getAttribute("name");
		LocalDateTime time = (LocalDateTime) request.getAttribute("time");
	%>
	<h3>
		Hello , my name is :
		<%=name%>
		and current time is :
		<%=time%>
	</h3>

</body>
</html>