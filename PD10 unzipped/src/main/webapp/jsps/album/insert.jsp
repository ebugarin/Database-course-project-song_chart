<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>insert album</title>
    
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
  <h1>insert album</h1>

<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/album_insert'/>" method="post">
	<input type="hidden" name="method" value="update"/>

	total streams    :<input type="text" name="total streams" value="${form.total_streams }"/>
	<span style="color: red; font-weight: 900">${errors.username }</span>
	<br/>
	
	album name    :<input type="text" name="album name" value="${form.album_name }"/>
	<span style="color: red; font-weight: 900">${errors.username }</span>
	<br/>
	
	rating    :<input type="text" name="rating" value="${form.rating }"/>
	<span style="color: red; font-weight: 900">${errors.username }</span>
	<br/>
	
	length   :<input type="text" name="length">${errors.length }</span>
	<br/>
	
	artist ID    :<input type="text" name="artistID" value="${form.artistID }"/>
	<span style="color: red; font-weight: 900">${errors.username }</span>
	<br/>
	
	<input type="submit" value="insert album"/>
	</form>
  </body>
</html>
