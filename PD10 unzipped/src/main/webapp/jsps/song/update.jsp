<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>update song</title>
    
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
  <h1>Update song</h1>

<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/song_update'/>" method="post">
	<input type="hidden" name="method" value="regist"/>
	

genre    :<input type="text" name="genre" value="${form.genre }"/>
	<span style="color: red; font-weight: 900">${errors.username }</span>
	<br/>
	
	streams    :<input type="text" name="streams" value="${form.streams }"/>
	<span style="color: red; font-weight: 900">${errors.username }</span>
	<br/>
	
	song name    :<input type="text" name="song name" value="${form.song_name }"/>
	<span style="color: red; font-weight: 900">${errors.username }</span>
	<br/>
	
	
	BPM    :<input type="text" name="BPM" value="${form.BPM }"/>
	<span style="color: red; font-weight: 900">${errors.username }</span>
	<br/>
	
	album ID    :<input type="text" name="albumID" value="${form.albumID }"/>
	<span style="color: red; font-weight: 900">${errors.username }</span>
	<br/>
	
	artist ID    :<input type="text" name="artistID" value="${form.artistID }"/>
	<span style="color: red; font-weight: 900">${errors.username }</span>
	<br/>
	
	song ID    :<input type="text" name="songID" value="${form.songID }"/>
	<span style="color: red; font-weight: 900">${errors.username }</span>
	<br/>

	
	<input type="submit" value="update song"/>
</form>
  </body>
</html>
