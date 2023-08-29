<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Image uploaded</title>
</head>
<body>
 <h1>${msg}</h1>
 <h1>${filename}</h1>
 <img alt="my_image" src="<c:url value="/resources/images/${filename}"/>"/>
 <h1></h1>
</body>
</html>