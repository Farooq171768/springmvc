<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success View</title>
</head>
<body>
<h1 class="text-center">${Header}</h1>
<p class="text-center">${Desc}</p>
<h1 style="color:green">${msg}</h1>
<hr>
<h1>Welcome, ${user.username}</h1>
<h1>Your email address is ${user.email}</h1>
<h1>Your password is ${user.password}</h1>
</body>
</html>