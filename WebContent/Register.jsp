<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
#outer
{
height:600px;
width:1000px; 
margin:0px auto;
border:1px solid;
background-image:url("C:/Users/RAJ/Downloads/background.jpg");

}
#form
{
height:400px;
width:220px;
opacity:0.8;
margin-left:570px;
margin-top:80px;
background-color:black; 
} 
.a
{
height:40px;
width:180px;
border-radius:5px;
margin-top:18px;
margin-left:20px;  
}
.b
{
height:40px;
width:180px;
border-radius:5px;
margin-top:18px;
margin-left:20px;
background-color:red;  
}
.c
{
height:20px;
width:100px;
border-radius:5px;
margin-top:15px;
margin-left:20px;
}
</style>
</head>
<body>
<div id="outer">
<div id="form">
<form action="register.do" method="post">
 <input class="a" type="text" name="name" placeholder="Enter your Name"/>
 <input class="a" type="text" name="emailId" placeholder="Enter your email"/>
 <input class="a" type="number" name="phoneNum" placeholder="Enter your phoneNum"/>
 <input class="a" type="password" name="password" placeholder="Enter your password"/>
 <input class="a" type="password" name="confirmPwd" placeholder=" Enter your confirmPwd"/>
<select class="c" name="country">
<option value="India">India</option>
<option value="Dubai">Dubai</option>
<option value="ThaiLand">Thailand</option>
</select>
<input  class="b" type="submit" value="Register"/>
<br><br>
<a href="Login.jsp"><b>Click to Login</b></a>
</form>
</div>
</div>
</body>
</html>

