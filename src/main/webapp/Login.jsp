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
    <h2>Login</h2>
    <form action="log" method="post">
      <label for="username">Username</label>
      <input type="text" name="uname" id="username" placeholder="Enter your username" required>
      
      <label for="password">Password</label>
      <input type="password" name="pass" id="password" placeholder="Enter your password" required>
      
      <button type="submit">Login</button>
    </form>
  </div>
</body>
</html>