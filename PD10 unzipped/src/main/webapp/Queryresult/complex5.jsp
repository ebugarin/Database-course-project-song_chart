<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<h3 align="center"> album complex, #5</h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>album id</th>
		
		<th>streams</th>
		<th>album name</th>
		<th>rating</th>
		<th>length</th>
		
		<th>artist id</th>
		
	</tr>
<c:forEach items="${albumComplex2}" var="album">
	<tr>
		<td>${album.albumID }</td>		
		<td>${album.total_streams }</td>
		<td>${album.album_name }</td>
		
		<td>${album.rating }</td>
		<td>${album.length }</td>
		
		<td>${album.artistID }</td>
	</tr>
</c:forEach>
</table>
</body>
</html>