<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<style type="text/css">
.loginDiv {
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
}
#registerBtn, #loginBtn {
	margin:auto;
	display:block;
}
</style>
</head>
<body>
	<form id="frm" action="loginAf.do" method="post">
		<div class="loginDiv">
			<h2>Login</h2>
			<input type="text" placeholder="ID" name="ID">
			<br>
			<input type="password" placeholder="password" name="password">
			<br>
			<input type="checkbox" id="saveIdChkbx">아이디 저장
			<br>
			<br>
			<button id="loginBtn">로그인</button>
			<br>
			<button type="button" id="registerBtn">회원가입</button>
		</div>
	</form>
	<script type="text/javascript">
		// 회원가입 버튼 클릭
		$("#registerBtn").click(function() {
			location.href = "register.do";
		})
	</script>
</body>
</html>