<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<s:form action="checkboxPro.action">
	<s:checkbox name="male" value="true" label="남성" /> <br />
	<s:checkbox name="female" value="true" label="여성"/> <br />
	<s:submit />
</s:form>
<s:set name="list" value="1,2,3,4,5,6,7,8,9" />

<s:radio list="list" name="radio" />

</body>
</html>