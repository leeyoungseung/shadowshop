<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>adminMain Page</title>
</head>
<body>
<h1>adminMain Page</h1>
<div>
ID :  ${dto.getWebid() } <br>
Last Login Time : ${dto.getLastLoginTime() } <br>
</div>
</body>
</html>