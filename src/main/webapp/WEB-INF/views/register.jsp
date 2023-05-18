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
			<input type="text" placeholder="ID" name="ID" id="ID">&nbsp;
			<button type="button" id="idCheckBtn">중복확인</button>
			<br>
			<p id="idCheckStat" />
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
			<input type="text" placeholder="nickname" name="nickname" id="nickname">&nbsp;
			<button type="button" id="nickCheckBtn">중복확인</button>
			<br>
			<p id="nickCheckStat" />
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
		// 아이디 중복확인
		$("#idCheckBtn").click(function() {
			// 빈칸 조사
			if ($("#ID").val() == "" || $("#ID").val() == null) {
				alert("ID를 입력하세요")
				return;
			}
			
			// 중복 확인
			$.ajax({
				type: "post",
				url: "idCheck.do",
				data: { "ID":$("#ID").val() },
				success: function(msg) {
					if (msg == "YES") {
						alert("사용할 수 있는 ID입니다.")
					} else {
						alert("이미 사용중인 ID입니다.")
						$("#ID").val() = ""
					}
				},
				error: function() {
					alert("register.jsp idCheck ajax error")
				}
			})
		})
		
		// 닉네임 중복확인
		$("#nickCheckBtn").click(function() {
			
		})
	
		// 회원가입 버튼 클릭 - 회원 가입 처리 로직
		$("#registerBtn").click(function() {
			
		})
	</script>
</body>
</html>