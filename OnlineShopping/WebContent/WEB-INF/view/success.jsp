<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
</head>
<body>
<!-- <form action="viewInd" modelAttribute="users"> -->
<h1>success</h1>

<h3>Your Information</h3>
    <table border="1" width="80%">
<tr>
<th>Username</th>
<th>Password</th>
<th>Gender</th>
<th>Country</th> 




<tr>
<td>${users.username}</td>
<td>${users.password}</td>
<td>${users.gender}</td>
<td>${users.country}</td> 



</table>

<br><br>
<a href = "login"><h2>Click here to login</h2></a>
</body>
</html>