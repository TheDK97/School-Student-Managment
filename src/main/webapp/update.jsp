<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Signup Page</title>
  <link rel="stylesheet" href="SignUp.css"> 
</head>
<body>
  <div class="container">
  <div class="title">Update Student</div>
  <form action="update" method="post">
    <div class="user__details">
      <div class="input__box">
        <span class="details">Full Name</span>
        <input type="text" placeholder="E.g: John Smith" required name="name">
      </div>
      <div class="input__box">
        <span class="details">Username</span>
        <input type="text" placeholder="johnWC98" required name="uname">
      </div>
      <div class="input__box">
        <span class="details">Email</span>
        <input type="email" placeholder="johnsmith@hotmail.com" required name="email">
      </div>
      <div class="input__box">
        <span class="details">Phone Number</span>
        <input type="number" pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}" placeholder="012-345-6789" required name="phone">
      </div>
      <div class="input__box">
        <span class="details">Password</span>
        <input type="password" placeholder="********" required name="pass">
      </div>
      <div class="input__box">
        <span class="details">Address</span>
        <input type="text" required name="address">
      </div>

    </div>
   
    <div class="button">
      <input type="submit" value="Update">
      
    </div>
  </form>
</div>
</body>
</html>