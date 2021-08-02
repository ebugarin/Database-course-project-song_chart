<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Update</title>
    
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
  <h1>Update artist</h1>

<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/artist_update'/>" method="post">
	<input type="hidden" name="method" value="update"/>
	nationality    :<input type="text" name="nationality" value="${form.nationality }"/>
	<span style="color: red; font-weight: 900">${errors.username }</span>
	<br/>
	artist name    :<input type="text" name="artist_name" value="${form.artist_name }"/>
	<span style="color: red; font-weight: 900">${errors.username }</span>
	<br/>
	artist ID    :<input type="text" name="artistID" value="${form.artistID }"/>
	<span style="color: red; font-weight: 900">${errors.username }</span>
	<br/>
	num of albums    :<input type="text" name="num_albums" value="${form.num_albums }"/>
	<span style="color: red; font-weight: 900">${errors.username }</span>
	<br/>	
		num of awards    :<input type="text" name="num_awards" value="${form.num_awards }"/>
	<span style="color: red; font-weight: 900">${errors.username }</span>
	<br/>
	<input type="submit" value="Update"/>
</form>
  </body>
</html>
