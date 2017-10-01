<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<h1>Update Page</h1>
<form action="Update.do" method="post">
<pre>
<label for="name">User Name</label>        : <input type="text" name="name" value="${dto.name}"/><br/>
Email Id         : <input type="text" name="emailId" value="${dto.emailId}" readonly="readonly"><br/>
Phone Number     : <input type="number" name="phoneNum" value="${dto.phoneNum}"/><br/>
Password         : <input type="text" name="password" value="${dto.password}"/><br/>
Confirm Password : <input type="text" name="confirmPwd" value="${dto.confirmPwd}"/><br/>
Country          :<select name="country">
<option>${dto.country}</option>
<option value="India">India</option>
<option value="Dubai">Dubai</option>
<option value="ThaiLand">Thailand</option>
<option value="America">America</option>
<option value="Nepal">Nepal</option>
<option value="Africa">Africa</option>
</select>
<br/><br/>
<input type="submit" value="Update">

<a href="Login.jsp">Login</a>
</pre>
</form>
</body>
</html>