
<%@page import="DTO.Student"%>
<%@page import="java.util.Vector"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="table.css">
</head>
<body>

<%
                    
                   String ses =(String)session.getAttribute("session");
                    if(ses!=null){
                    	out.print(ses);
                    }
                    
                    %>
<% Vector<Student> v =(Vector)request.getAttribute("data"); %>
	<table border="2px">
	<tr>
			
			<th>Name</th>
			<th>UserId</th>
			<th>Email</th>
			<th>Phone</th>
			
			<th>Password</th>
			
			<th>Address</th>
			
			
			
		</tr>
		
		
	<tr>
	    <%for(Student u2:v){ %>
	         <td><%=u2.getName()%></td>
			<td><%=u2.getUserId()%></td>
            <td><%=u2.getEmail()%></td>
            <td><%=u2.getPhone()%></td>
            <td><%=u2.getPass()%></td>
			<td><%=u2.getAddress()%></td>
			
		
		</tr>
		<%} %>
	
	</table>
</body>
</html>