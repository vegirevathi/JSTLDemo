<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/students" user="root" password="Revs@1996"/>
	<sql:query var="rs" dataSource="${db}">select * from students_data</sql:query>
	<c:forEach items="${rs.rows}" var="student">
	<br><c:out value="${student.roll_no}"></c:out>:<c:out value="${student.name}"></c:out>:<c:out value="${student.age}"></c:out>
	</c:forEach>
	
</body>
</html>