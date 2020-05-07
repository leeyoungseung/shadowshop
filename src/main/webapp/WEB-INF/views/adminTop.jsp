<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>adminMain Page</title>
<link rel="stylesheet" type="text/css" href="../../resources/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="../../resources/css/adminshop.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/4.7.6/handlebars.js"></script>
</head>
<body>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            	<button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
				 data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
				<span class="sr-only"></span>
				<span class="icon-bar"></span><!-- 네비게이션바의 header버튼의 줄 수를 늘린다 -->
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="/">AdminMain</a>
        </div>
    </div>
    <div class="collapsed nabvar-collapse" id="bs-example-navbar-collapse-1">
        <ul class="nav navbar-nav">
            <li class=""><a href="/userAdmin/main">회원 관리<span class="sr-only"></span></a></li>
            <li class=""><a href="index.html">카테고리 관리<span class="sr-only"></span></a></li>
            <li class=""><a href="index.html">상품 관리<span class="sr-only"></span></a></li>
            <li class=""><a href="index.html">주문 관리<span class="sr-only"></span></a></li>
        </ul>
        <c:if test="${not empty logined_dto.getWebid() }">
        <ul class="nav navbar-nav navbar-right">
        	<li class="" style="font-weight:bold">
			    ${logined_dto.getWebid() }<span class="sr-only"></span>
			</li>
			<li class="">
			    <a href="/auth/logout" class="dropdown-toggle" data-toggle="dropdown" role="button"
				aria-haspopup="true" aria-expanded="false">로그 아웃<span class="sr-only"></span></a>
			</li>
		</ul>
		</c:if>
    </div>
    
</nav>