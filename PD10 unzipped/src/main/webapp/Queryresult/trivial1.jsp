<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<h3 align="center"> artist Table </h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>artist id</th>
		<th>nationality</th>
		<th>album</th>
		<th>award</th>
		<th>name</th>
	</tr>
<c:forEach items="${artistList}" var="artist">
	<tr>
		<td>${artist.artistID }</td>
		<td>${artist.nationality }</td>
		<td>${artist.num_albums }</td>
		<td>${artist.num_awards }</td>
		<td>${artist.artist_name }</td>
	</tr>
</c:forEach>
</table>
</body>
</html>