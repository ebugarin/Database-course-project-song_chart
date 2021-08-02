<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>top</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
	body {
		background: #4682B4; 
	}
	a {
		text-transform:none;
		text-decoration:none;
	} 
	a:hover {
		text-decoration:underline;
	}
</style>
  </head>
  
  <body>
<h1 style="text-align: center;">song_chart Database</h1>
<div style="font-size: 10pt;">
	<c:choose>
		<c:when test="${empty sessionScope.session_user }">
			<a href="<c:url value='/jsps/user/login.jsp'/>" target="_parent">Login</a> |&nbsp; 
			<a href="<c:url value='/jsps/user/regist.jsp'/>" target="_parent">Register</a>	
			|&nbsp; 
			<a href="<c:url value='/jsps/user/init.jsp'/>" target="_parent">init database</a>	
			|&nbsp; 
			<a href="<c:url value='/jsps/artist/create.jsp'/>" target="_parent">create artists</a>
			|&nbsp; 
			<a href="<c:url value='/jsps/artist/read.jsp'/>" target="_parent">read artists</a>	
			|&nbsp; 
			<a href="<c:url value='/jsps/artist/delete.jsp'/>" target="_parent">delete artists</a>
			|&nbsp; 
			<a href="<c:url value='/jsps/artist/update.jsp'/>" target="_parent">update artists</a>
			
				|&nbsp; 
			<a href="<c:url value='/jsps/album/update.jsp'/>" target="_parent">update a album</a>
			|&nbsp; 
			<a href="<c:url value='/jsps/album/read.jsp'/>" target="_parent">read album</a>	
			|&nbsp; 
			<a href="<c:url value='/jsps/album/delete.jsp'/>" target="_parent">delete album</a>
			|&nbsp; 
			<a href="<c:url value='/jsps/album/insert.jsp'/>" target="_parent">insert a album</a>
			
			
			|&nbsp; 
			<a href="<c:url value='/jsps/song/update.jsp'/>" target="_parent">update a song</a>
			|&nbsp; 
			<a href="<c:url value='/jsps/song/read.jsp'/>" target="_parent">read song</a>	
			|&nbsp; 
			<a href="<c:url value='/jsps/song/delete.jsp'/>" target="_parent">delete song</a>
			|&nbsp; 
			<a href="<c:url value='/jsps/song/insert.jsp'/>" target="_parent">insert a song</a>
			
			|&nbsp;
			<a href="<c:url value='/jsps/item.jsp'/>" target="body">Query Results</a>&nbsp;&nbsp;
			


			
			
		</c:when>
		<c:otherwise>
			Hello：${sessionScope.session_user.username };
			<a href="<c:url value='/jsps/item.jsp'/>" target="body">Query Result</a>&nbsp;&nbsp;
		</c:otherwise>
	</c:choose>

</div>
  </body>
</html>
