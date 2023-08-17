<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List,java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>This is Home Page</h1>
	<h2>Called by home controller</h2>
	<h2>url /home</h2>
	<h2>Hello URL</h2>
	<%
	String name=(String)request.getAttribute("name");
	int id=(int)request.getAttribute("id");
	List<String> friends=(List<String>)request.getAttribute("friends");
	%>
	<h1>My name is <%= name %> and id is: <%= id %></h1>
	
	<%
	for(String s:friends){
	%>
	<h2 style="color:blue">
		<%=s %>
	</h2>
		<%
		}%>
	
</body>
</html>