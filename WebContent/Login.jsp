<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>${msg}</h3>

<form action="Login.do" method="post">
<pre>
Email-Id :<input type="text" name="emailId" /><br>
Password :<input type="password" name="password" /><br>
<input type="submit" value="login"><br>
<a href="Forgot.jsp"><b>Forgot</b></a>
</pre>
</form>

</body>
</html>