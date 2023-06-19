<!DOCTYPE html>
<html>
<head>
  <title>Login Form</title>
 <link rel="stylesheet" href="Login.css">
</head>
<body>
<h1>
	<%
	String msg =(String) request.getAttribute("msg");
	if(msg!=null){
		out.print(msg);
	}
	
	
	%>
	
	
	</h1>
	
  <div class="container">
    <h2>Delete Student</h2>
    <form action="Del" method="post">
      <label for="username">EmailId</label>
      <input type="email" name=email id="username" placeholder="Enter your EmailId" required>
      <br><br><br>
      
      
      <button type="submit">Delete</button>
    </form>
  </div>
</body>
</html>