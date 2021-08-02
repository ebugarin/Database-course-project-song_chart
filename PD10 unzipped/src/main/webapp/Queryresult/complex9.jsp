<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<h3 align="center"> songartist complex 4 </h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>song id</th>
		<th>genre</th>
		
		<th>streams</th>
		<th>song name</th>
		<th>BPM</th>
		<th>album id</th>
		
		<th>artist id</th>
		
				<th>album id</th>
		
		<th>album streams</th>
		<th>album name</th>
		<th>rating</th>
		<th>length</th>
		
		<th>artist id</th>
		
	</tr>
<c:forEach items="${songartistComplex4}" var="songartist">
	<tr>
		<td>${songartist.songID }</td>
		<td>${songartist.genre }</td>
		
		<td>${songartist.streams }</td>
		<td>${songartist.song_name }</td>
		
		<td>${songartist.BPM }</td>
		<td>${songartist.albumID }</td>
		
		<td>${songartist.artistID }</td>
		
				<td>${songartist.albumID2 }</td>		
		<td>${songartist.total_streams }</td>
		<td>${songartist.album_name }</td>
		
		<td>${songartist.rating }</td>
		<td>${songartist.length }</td>
		
		<td>${songartist.artistID2 }</td>
		
		
	</tr>
</c:forEach>
</table>
</body>
</html>