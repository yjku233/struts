<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/view/color.jsp" %>
<html>
<head>
<title>ȸ����������</title>
<link href="style.css" rel="stylesheet" type="text/css">


<script language="JavaScript">
   <!-- 
    function checkIt() {
        var userinput = eval("document.userinput");
               
        if(!userinput.passwd.value ) {
            alert("��й�ȣ�� �Է��ϼ���");
            return false;
        }
        if(userinput.passwd.value != userinput.passwd2.value)
        {
            alert("��й�ȣ�� �����ϰ� �Է��ϼ���");
            return false;
        }
       
        if(!userinput.username.value) {
            alert("����� �̸��� �Է��ϼ���");
            return false;
        }
        if(!userinput.jumin1.value  || !userinput.jumin2.value )
        {
            alert("�ֹε�Ϲ�ȣ�� �Է��ϼ���");
            return false;
        }
    }
-->
</script>
<body bgcolor="${bodyback_c}">
<form method="post" action="modifyPro.action" name="userinput" onsubmit="return checkIt()">

  <table width="600" border="1" cellspacing="0" cellpadding="3"  align="center">
    <tr > 
      <td  colspan="2" height="39" bgcolor="${title_c}" align="center">
	     <font size="+1" ><b>ȸ�� ��������</b></font></td>
    </tr>
    <tr>
      <td colspan="2" class="normal" align="center">ȸ���� ������ �����մϴ�.</td>
    </tr>
     <tr> 
      <td width="200" bgcolor="${value_c}"><b>���̵� �Է�</b></td>
      <td width="400" bgcolor="${value_c}">&nbsp;</td>
    <tr>  

    <tr> 
      <td  width="200"> ����� ID</td>
      <td  width="400">
      	<input type="hidden" name="id" value="${dto.id}" />
      	${dto.id}
      </td>
    </tr>
    
     <tr> 
      <td width="200"> ��й�ȣ</td>
      <td width="400"> 
        <input type="password" name="passwd" size="10" maxlength="10" value="${dto.passwd}">
      </td>
    <tr>  
    <tr> 
      <td  width="200" bgcolor="${value_c}"><b>�������� �Է�</b></td>
      <td width="400" bgcolor="${value_c}">&nbsp;</td>
    <tr>  
    <tr> 
      <td   width="200">����� �̸�</td>
      <td  width="400"> 
        <input type="text" name="name" size="15" maxlength="20" value="${dto.name}">
      </td>
    </tr>
    <tr> 
      <td width="200">�ֹε�Ϲ�ȣ</td>
      <td width="400"> 
        ${dto.jumin1}-${dto.jumin2}
      </td>
    </tr>
   <tr> 
      <td width="200">E-Mail</td>
      <td width="400">
	    <c:choose>
	    	<c:when test="${dto.email == null}">
	    		<input type="text" name="email" size="40" maxlength="30" >
	    	</c:when>
	    	<c:when test="${dto.email != null}">
	    		<input type="text" name="email" size="40" maxlength="30" value="${dto.email}">
	    	</c:when>
	    </c:choose>
      </td>
    </tr>
    <tr> 
      <td width="200">Blog</td>
      <td width="400"> 
	    <c:choose>
	    	<c:when test="${dto.blog == null}">
	    		<input type="text" name="blog" size="60" maxlength="50" >
	    	</c:when>
	    	<c:when test="${dto.blog != null}">
	    		<input type="text" name="blog" size="60" maxlength="50" value="${dto.blog}">
	    	</c:when>
	    </c:choose>
      </td>
    </tr>      
    <tr> 
      <td colspan="2" align="center" bgcolor="${value_c}"> 
       <input type="submit" name="modify" value="��   ��" >
       <input type="button" value="��  ��" onclick="javascript:window.location='main.action'">      
      </td>
    </tr>
  </table>
</form>
</body>
</html>