<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<h3 align="center"> song complex 3 </h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>song id</th>
		<th>genre</th>
		
		<th>streams</th>
		<th>song name</th>
		<th>BPM</th>
		<th>album id</th>
		
		<th>artist id</th>
		
	</tr>
<c:forEach items="${songComplex3}" var="song">
	<tr>
		<td>${song.songID }</td>
		<td>${song.genre }</td>
		
		<td>${song.streams }</td>
		<td>${song.song_name }</td>
		
		<td>${song.BPM }</td>
		<td>${song.albumID }</td>
		
		<td>${song.artistID }</td>
	</tr>
</c:forEach>
</table>
</body>
</html>