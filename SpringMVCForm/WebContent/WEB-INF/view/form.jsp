<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign Up</title>

<script type="text/javascript">
function validation()
{
	if(document.contact_form.username.value=="")
		{
			alert("Please enter your Username");
			return false;
		}
	if(document.contact_form.password.value=="")
	{
		alert("Please enter your Password");
		return false;
	}
	if((document.contact_form.gender[0].checked==false)&&(document.contact_form.gender[1].checked==false))
		{
			alert("Please select your Gender");
			return false;
		}
	if(document.contact_form.country.selectedIndex==0)
		{
			alert("Please select your Country");
			return false;
		}
	if(document.contact_form.terms.checked == false)
		{
			alert("Please agree the Terms and Contions");
			return false;
		}
}
</script>

</head>
<body>
<br>
<h1>Sign Up</h1><hr><hr><br>
<form:form action="saveUser" onsubmit="return validation()" name="contact_form" method="POST" modelAttribute="users">
 <form:hidden path="id"/> 

<table>
<tbody>
<tr>
<td><label>Username </label></td>
<td><form:input path="username"/></td>
</tr>

<tr>
<td><label>Password</label></td>
<td><form:input type = "password" path="password"/></td>
</tr>

<tr>
<td><label>Gender </label></td>
<td>  
Male    <form:radiobutton path="gender" value="Male"/>  
Female   <form:radiobutton path="gender" value="Female"/></td>
</tr>

<tr>
<td><label>Country </label></td>
<td><form:select path="country">
		<form:option value="select" label="select"/>   
        <form:option value="Australia" label="Aus"/>  
        <form:option value="US" label="US"/>  
        <form:option value="Canada" label="Canada"/>  
        <form:option value="India" label="Ind"/>  
        <form:option value="Japan" label="japan"/> 
        </form:select>  </td>
</tr>

<tr>
<td><label>Terms and Conditions </label></td>
<td><form:checkbox path="terms" value="yes"/></td>
</tr>

<tr>
<td><label></label></td>
<td><input type="submit" value="Save"></td>
</tr>

</tbody>
</table>
</form:form>
<br>

</body >
</html>