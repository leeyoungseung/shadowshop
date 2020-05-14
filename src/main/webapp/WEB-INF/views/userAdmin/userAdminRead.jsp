<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../adminTop.jsp"%>
<div class="container">
	<h2>Inline form</h2>
	<form class="form-inline">
		<div>
			<label for="email">Email : </label> 
			<input type="email" value="${user.userWebId}" readonly="readonly">
		</div>
		<div>
			<label for="">회원명 :</label> 
			<input type="text" value="${user.userName}" readonly="readonly">
		</div>
		<div>
			<label for="">연락처 1 : </label> 
			<input type="text" value="" readonly="readonly"> 
			<label>국가 : </label> 
			<input type="text" value="" readonly="readonly">
		</div>
		<div>
			<label for="">주소 : </label> 
			<input type="text" value="" readonly="readonly">
		</div>
		<div>
			<label for="">성별 : </label> 
			<input type="text" value="" readonly="readonly">
		</div>
		<div>
			<label for="">생년월일 : </label> 
			<input type="text" value="" readonly="readonly">
		</div>
		<div>
			<label for="">닉네임 : </label> 
			<input type="text" value="${user.userNickName }" readonly="readonly">
		</div>
	</form>
</div>
</body>
</html>