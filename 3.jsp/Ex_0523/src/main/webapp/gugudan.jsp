<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border = "1">
	<% for(int x = 1; x < 10; x++){ %>
		<tr>
		<% for(int y = 2; y < 10; y++){ %>
		<td>
		<%= y + " * " + x + " = " + x*y %>
		</td>
	<% } %>
	</tr>
	<% } %>
	</table>


	
	
	
	
	
	
	
	
	
</body>
</html>