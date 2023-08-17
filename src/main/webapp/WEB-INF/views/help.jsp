<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.time.LocalDateTime" 
    isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
	<h1>This is help page</h1>
	<%-- <%
	String name=(String)request.getAttribute("name");
	int rollNo=(int)request.getAttribute("rollNo");
	LocalDateTime now=(LocalDateTime)request.getAttribute("time");
	%> --%>
	<h1>Hello, my name is <%-- <%=name %> --%> ${name}</h1>
	<h1>My roll number is <%-- <%=rollNo %> --%> ${rollNo}</h1>
	<h2>Today's Date and time <%-- <%=now %> --%> ${time}</h2>
	<hr>
	<p>${marks}</p>
	<c:forEach var="item" items="${marks}">
		<%-- <h2>${item}</h2> --%>
		<h1><c:out value="${item}"></c:out></h1>
	
	</c:forEach>
	
	
</body>
</html>