<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.app.dao.StudentDao,com.app.bean.Student,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int id = Integer.parseInt(request.getParameter("prn_no"));
Student s = StudentDao.getRecordById(id);
%>

<table border="1" width="80%">
<tr>
<th>StudentID</th>
<th>Student Name</th>
<th>Subject 1</th>
<th>Subject 2</th>
<th>Subject 3</th>
<th>Total Marks</th>
<th>Percentage</th>
</tr>
<tr>
<td><%=s.getPrn_no()%></td>
<td><%= s.getName()%></td>
<td><%= s.getSub1()%></td>
<td><%= s.getSub2()%></td>
<td><%= s.getSub3()%></td>
<td><%= s.getSub1()+s.getSub2()+s.getSub3()%></td>
<td><%= (float)((s.getSub1()+s.getSub2()+s.getSub3())/3)%></td>
</tr>
</table>
</body>
</html>