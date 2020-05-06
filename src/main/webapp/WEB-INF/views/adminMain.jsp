<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./adminTop.jsp"  %>
<h1>adminMain Page</h1>
<div>
ID :  ${logined_dto.getWebid() } <br>
Last Login Time : ${logined_dto.getLastLoginTime() } <br>
</div>
</body>
</html>