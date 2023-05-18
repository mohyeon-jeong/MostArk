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
	<div class="loginDiv">	
		<form id="frm" action="loginAf.do" method="post">
			<h2>Login</h2>
			<input type="text" placeholder="ID" name="ID" id="ID">
			<br>
			<input type="password" placeholder="password" name="password" id="password">
			<br>
			<input type="checkbox" id="saveIdChkbx">아이디 저장
			<br>
			<br>
			<button type="button" id="loginBtn">로그인</button>
		</form>
		<br>
		<button type="button" id="registerBtn">회원가입</button>
	</div>
	<script type="text/javascript">
		// 회원가입 버튼 클릭 - 회원가입 페이지로 이동
		$("#registerBtn").click(function() {
			location.href = "register.do";
		})
		
		// 빈칸 조사
		$("#loginBtn").click(function() {
			if(!$("#ID").val() || !$("#password").val()) {
				alert("there is null");
				return;
			} else {
				$("#frm").submit();
			}
		})
		
		// 아이디 저장
		if($("#saveIdChkbx").is(":checked")) {
			
		}
	</script>
</body>
</html>