<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="request01_process.jsp" method="GET">
		<p>아이디: <input name= "id" placeholder="아이디를 적어주세요" maxlength = 10></p>
		<p>비밀번호: <input name = "password" type="password"></p>
		<p>닉네임: <input name = "nickname" placeholder = "닉네임 적어주세요"></p>
		
		<p><input type = "submit" value="전송"></p>
	</form>
</body>
</html>