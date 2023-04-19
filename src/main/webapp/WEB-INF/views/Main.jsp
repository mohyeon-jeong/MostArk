<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MostArk</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
</head>
<body>
	<h1>MostArk</h1>
	<div>
		<a href="charInfo.do">전투 정보실</a>
		<br>
		<br>
		<a href="freePostList.do">자유 게시판</a>
	</div>
	<br>
	<div>
		<button id="loginBtn">로그인</button>
	</div>
	<br>
	<div>
		<button id="memberUpdate">마이페이지</button>
		<button id="logOut">로그아웃</button>
	</div>
	<script type="text/javascript">
		$("#loginBtn").click(function() {
			location.href = "login.do";
		})
		
		$("#memberUpdate").click(function() {
			location.href = "memberUpdate.do";
		})
		
		$("#logOut").click(function() {
			location.href = "logout.do";
		})
	</script>
</body>
</html>