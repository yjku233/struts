<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/view/color.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ȸ��Ż��</title>
<link href="style.css" rel="stylesheet" type="text/css">

   <script language="javascript">
     <!--
       function begin(){
         document.myform.passwd.focus();
       }

       function checkIt(){
		  if(!document.myform.passwd.value){
           alert("��й�ȣ�� �Է����� �����̽��ϴ�.");
           document.myform.passwd.focus();
           return false;
         }
	   }   
     -->
   </script>
</head>
<BODY onload="begin()" bgcolor="${bodyback_c}">
<form name="myform" action="deletePro.action" method="post" onSubmit="return checkIt()">
<TABLE cellSpacing=1 cellPadding=1 width="260" border=1 align="center" >
  
  <TR height="30">
    <TD colspan="2" align="middle" bgcolor="${title_c}">
	  <font size="+1" ><b>ȸ�� Ż��</b></font></TD></TR>
  
  <TR height="30">
    <TD width="110" bgcolor="${value_c}" align=center>��й�ȣ</TD>
    <TD width="150" align=center>
      <INPUT type=password name="passwd"  size="15" maxlength="12"></TD></TR>
  <TR height="30">
    <TD colspan="2" align="middle" bgcolor="${value_c}" >
      <INPUT type=submit value="ȸ��Ż��"> 
      <input type="button" value="��  ��" onclick="javascript:window.location='main.action'"></TD></TR>
</TABLE>
</form>
</BODY>
</HTML>
