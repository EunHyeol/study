<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
		<!-- 합쳐지고 최소화된 최신 CSS -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
		<!-- 부가적인 테마 -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
		<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<script type="text/javascript">
		$(document).ready(function(){
			// 취소
			$(".cencel").on("click", function(){
				location.href = "/";		    
			})
		
			$("#submit").on("click", function(){
				if($("#userpass").val()==""){
					alert("비밀번호를 입력해주세요.");
					$("#userpass").focus();
					return false;
				}
				if($("#username").val()==""){
					alert("성명을 입력해주세요.");
					$("#username").focus();
					return false;
				}
			});	
		})
	</script>
<body>
	<section id="container">
			<form action="/member/memberUpdate" method="post">
				<div class="form-group has-feedback">
					<label class="control-label" for="userid">아이디</label>
					<input class="form-control" type="text" id="userid" name="userid" value="${member.userid}" readonly="readonly"/>
				</div>
				<div class="form-group has-feedback">
					<label class="control-label" for="userpass">패스워드</label>
					<input class="form-control" type="password" id="userpass" name="userpass" />
				</div>
				<div class="form-group has-feedback">
					<label class="control-label" for="username">성명</label>
					<input class="form-control" type="text" id="username" name="username" value="${member.username}"/>
				</div>
				<div class="form-group has-feedback">
					<button class="btn btn-success" type="submit" id="submit">회원정보수정</button>
					<button class="cencel btn btn-danger" type="button">취소</button>
				</div>
			</form>
		</section>
</body>
</html>