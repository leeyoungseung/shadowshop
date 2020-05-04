<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
<script type="text/javascript">

 function checkAdminLoginForm(){
  if (f.webid.value==""){
   alert("Please Input Account")
   f.subject.focus()
   return false;
  }
  var emailRule = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
  if (!emailRule.test(f.webid.value)){
	   alert("Please Input your account by Email format.")
	   f.subject.focus()
	   return false;
  }
  if (f.passwd.value==""){
   alert("Please Input Password")
   f.passwd.focus()
   return false;
  }
  return true;
 }

</script>
</head>
<body>
<h1>Shadow Shop Login Page</h1>

<div style="border: 1px solid powderblue;position:relative;left:200px;top:150px;">
<h2> Please Login Administrator Account</h2>
<form:form commandName="loginForm" action="/auth/login" method="POST" 
onsubmit="return checkAdminLoginForm()" name="f">
<label> Admin Account(E-mail) : </label> 
<form:input type="text" path="webid" id="webid"/><br>

<label> Admin Password : </label> 
<form:input type="password" path="password" id="password"/><br>
<input type="submit" value="Login"><br>
</form:form>
</div>
</body>

</html>