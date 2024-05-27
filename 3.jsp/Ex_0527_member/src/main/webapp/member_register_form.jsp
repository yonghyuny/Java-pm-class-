<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function send(f){
		let name  = f.name.value.trim();
		let id = f.id.value.trim(); 
		let pwd = f.pwd.value.trim();
		let email = f.email.value.trim();
		
		// 유효성 검사
		if(name == "" && name.length< 8){
			alert("이름을 입력하세요")
			return;
		} 
		f.method = "post";
		f.action = "member_reg.jsp";
		f.submit();
	}	

</script>
</head>
<body>
	<form>
		<table border = "1">
			<tr>
				<th>이름</th>
				<td><input name = "name"></td>
			</tr>
			<tr>
				<th>아이디</th>
				<td><input name = "id"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input name = "pwd" type = "password"></td>
			</tr>
			<tr>
				<th>이메일</th>
				<td><input name = "email"></td>
			</tr>
			<tr>
				<td colspan="2" align = "center">
				<input type= "button" value = "등록" onclick="send(this.form);">
				<input type= "button" value = "취소" onclick="location.href='member_list.jsp'">	
			
					
		</table>
	</form>
</body>
</html>