<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../adminTop.jsp"%>
<div class="container">
	<h2>Inline form</h2>
	<form:form commandName="user" class="form-inline" action="/userAdmin/update/${user.userNo}" method="POST">
		<div>
			<label for="email">Email : </label> 
			<form:input type="email" value="${user.userWebId}" readonly="readonly" path="userWebId"/>
		</div>
		<div>
			<label for="">회원명 :</label> 
			<form:input type="text" value="${user.userName}" path="userName"/>
		</div>
		<div>
			<label for="">연락처 1 : </label> 
			<input type="text" value=""> 
			<label>국가 : </label> 
			<input type="text" value="">
		</div>
		<div>
			<label for="">주소 : </label> 
			<input type="text" value="">
		</div>
		<div>
			<label for="">성별 : </label> 
			<input type="text" value="">
		</div>
		<div>
			<label for="">생년월일 : </label> 
			<input type="text" value="">
		</div>
		<div>
			<label for="">닉네임 : </label> 
			<input type="text" value="${user.userNickName }">
		</div>
		<div>
		   <input type="submit" value="수정하기"/>
		</div>
	</form:form>
</div>
</body>
</html>