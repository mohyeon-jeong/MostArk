<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
</head>
<body>
	<h1>Register</h1>
	<div>
		<form id="frm" action="registerAf.do" method="post">
			아이디
			<br>
			<input type="text" placeholder="ID" name="ID">&nbsp;
			<button type="button" id="idCheckBtn">중복확인</button>
			<br>
			<br>
			비밀번호
			<br>
			<input type="password" placeholder="●●●●●●●●" name="password" id="password1">
			<br>
			<br>
			비밀번호 확인
			<br>
			<input type="password" placeholder="●●●●●●●●" id="password2">
			<br>
			<br>
			닉네임
			<br>
			<input type="text" placeholder="nickname" name="nickname">
			<br>
			<br>
			이메일
			<br>
			<input type="text" placeholder="example@example.com" name="email">
			<br>
			<br>
			<button type="button" id="registerBtn">회원가입</button>
		</form>
	</div>
	<script type="text/javascript">
		$("registerBtn").click(function() {
				
		})
	</script>
</body>
</html>