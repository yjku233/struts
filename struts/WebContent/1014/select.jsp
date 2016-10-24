<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="list" items="${list}">
	${list.id},${list.pw},${list.age},${list.reg}<br />
</c:forEach>
<br /><br /><br />
${dto.id},${dto.pw},${dto.age},${dto.reg}
<br /><br /><br />
<c:forEach var="age" items="${age}">
	${age}<br />
</c:forEach>
</body>
</html>