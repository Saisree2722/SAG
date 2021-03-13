<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignIn</title>
<script>
function validation()
{
	if(document.contact_form.username.value=="")
		{
			alert("Please enter username");
			return false;
		}
	if(document.contact_form.password.value=="")
	{
		alert("Please enter password");
		return false;
	}
	}
</script>

</head>
<body>
<br>
<h1>Sign In</h1><hr><hr><br>
<form:form action="signIn" onsubmit="return validation()" name="contact_form" method="POST"  modelAttribute="users">
<table>
<tbody>
<tr>
<td><label>Username </label></td>
<td><form:input path="username"/></td>
</tr>

<tr>
<td><label>Password</label></td>
<td><form:input type="password" path="password"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Submit" /></td>
</tr>

</tbody>
</table>
</form:form>
</body>
</html>