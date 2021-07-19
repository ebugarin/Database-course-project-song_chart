<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Register</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <h1>Register</h1>
  <%--
  1. 显示errors --> 字段错误
  2. 显示异常错误
  3. 回显
   --%>
<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/UserServletRegister'/>" method="post">
	<input type="hidden" name="method" value="regist"/>
	nationality    :<input type="text" name="nationality" value="${form.nationality }"/>
	<span style="color: red; font-weight: 900">${errors.username }</span>
	<br/>
	artist    :<input type="text" name="artist_name" value="${form.artist_name }"/>
	<span style="color: red; font-weight: 900">${errors.username }</span>
	<br/>
	
	<input type="submit" value="Register"/>
</form>
  </body>
</html>
