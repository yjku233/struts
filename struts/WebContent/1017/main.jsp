<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/view/color.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�����Դϴ�..</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>
<body onLoad="focusIt();" bgcolor="${bodyback_c}">
<c:if test="${sessionScope.memId == null}">
<script>
<!--
function focusIt()
{      
   document.inform.id.focus();
}
 
 function checkIt()
 {
   inputForm=eval("document.inform");
   if(!inputForm.id.value){
     alert("���̵� �Է��ϼ���..");
	 inputForm.id.focus();
	 return false;
   }
   if(!inputForm.passwd.value){
     alert("���̵� �Է��ϼ���..");
	 inputForm.passwd.focus();
	 return false;
   }
 }
//-->
</script>
<form name="inform" method="post" action="loginPro.action"  onSubmit="return checkIt();">
	<table width=500 cellpadding="0" cellspacing="0"  align="center" border="1" >
		<tr>
			<td width="300" bgcolor="${bodyback_c}" height="20">
			&nbsp;
			</td>
			<td bgcolor="${title_c}"  width="100" align="right">���̵�</td>
			<td width="100" bgcolor="${value_c}">
				<input type="text" name="id" size="15" maxlength="10"></td>
			</tr>
		<tr > 
			<td rowspan="2" bgcolor="${bodyback_c}" width="300" >�����Դϴ�.</td>
			<td bgcolor="${title_c}"  width="100" align="right">�н�����</td>
			<td width="100" bgcolor="${value_c}">
				<input type="password" name="passwd" size="15" maxlength="10"></td>
		</tr>
		<tr>
			<td colspan="3" bgcolor="${title_c}"   align="center">
				<input type="submit" name="Submit" value="�α���">
				<input type="button"  value="ȸ������" onclick="javascript:window.location='inputForm.action'">
			</td>
		</tr>
	</table>
</form>
</c:if>
<c:if test="${sessionScope.memId != null}">
       <table width=500 cellpadding="0" cellspacing="0"  align="center" border="1" >
         <tr>
           <td width="300" bgcolor="${bodyback_c}" height="20">������</td>

           <td rowspan="3" bgcolor="${value_c}" align="center">
             ${sessionScope.memId}���� <br>
             �湮�ϼ̽��ϴ�
             <form  method="post" action="logout.action">  
             <input type="submit"  value="�α׾ƿ�">
             <input type="button" value="ȸ����������" onclick="javascript:window.location='modify.action'">
             <input type="button" value="Ż��" onclick="javascript:window.location='deleteForm.action'">
             </form>
         </td>
        </tr>
       <tr > 
         <td rowspan="2" bgcolor="${bodyback_c}" width="300" >�����Դϴ�.</td>
      </tr>
     </table>
</c:if>
     <br>
 </body>
</html>
