<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Online Store</title>
<link rel="stylesheet" href="manUP.css">
<style type="text/css">
body{
background-image: url("images/p4.png");
	background-size: 1400px 600px;
	background-repeat: no-repeat;


}

</style>

</head>
<body>

<div class="container">
		<div class="indexbox">
			<p><p>
			<h2>Student Portal</h2>
			<form action="Login.jsp"><button class="button1">Student Login</button></form>
			<form action="ragistration.jsp"><button class="button1">Register As Customer</button></form>
			<form action="update.jsp"><button class="button1">Update Student</button></form>
           <form action="delete.jsp"><button class="button1">Delete Student</button></form>		
           <form action="all" method="post"><button class="button1">GetAll Student</button></form>
		</div>
	</div>
	
</body>
</html>