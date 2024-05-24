<%@page import="vo.DeptVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.Context"%>
<%@page import="javax.naming.InitialContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 톰캣이 JNDI를 검색하기 위해 필요한 클래스(JNDI기법: Java Naming Directory Interface)
	InitialContext ic = new InitialContext();

	Context ctx = (Context)ic.lookup("java:comp/env");
	// lookup -> 찾는 함수
	// "java:comp/env" -> 자바에 내장되어있는 리소스 자원을 검색하는 상수(고정)
    
	// 검색된 Resource를 통해 JNDI의 자원을 검색
	// context.xml파일의 resource영역에 참조되어 있는 name속성값
	DataSource ds = (DataSource)ctx.lookup("jdbc/oracle_test");
	
	Connection conn = ds.getConnection();
	// 위에서 준비해둔 경로로 로그인 시도
	
	String sql = "select * from dept";
	
	// 문자열 형태의 sql문을 실제 쿼리문으로 전달
	PreparedStatement pstmt = conn.prepareStatement(sql);
	
	// executeQuery(): 전달 받은 쿼리문을 실행하여 결과를 반환받는다.
	// 전달받은 데이터는 rs객체에 저장됨
	ResultSet rs = pstmt.executeQuery();
	
	List<DeptVO> dept_list = new ArrayList<>();
	
	while(rs.next()) {
		DeptVO vo = new DeptVO();
		
		//현재 행의 값을 vo에 담는다.
		vo.setDeptno(rs.getInt("deptno"));
		vo.setDname(rs.getString("dname"));
		vo.setLoc(rs.getString("loc"));
	
	dept_list.add(vo);	
	}
	
	

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>