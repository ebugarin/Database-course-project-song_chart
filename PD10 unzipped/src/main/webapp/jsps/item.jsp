<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="">
    
    <title>body</title>
    
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
    <h1>Queries</h1>
    <br>
    <a href="<c:url value='/findAll'/>" target="body">tb_user: Please list all the user in the table</a>&nbsp;&nbsp;
 |&nbsp;
  <BR>
    <BR>
    simple query 1:
        <a href="<c:url value='/artistfindAll'/>" target="body">artist: list all in the table</a>&nbsp;&nbsp;
    
    <BR>
    <BR>
    simple query 2:
        <a href="<c:url value='/albumfindAll'/>" target="body">album: list all in the table</a>&nbsp;&nbsp;
        
        <BR>
    <BR>
    simple query 3:
        <a href="<c:url value='/songfindAll'/>" target="body">song: list all in the table</a>&nbsp;&nbsp;
    
     <BR>
    <BR>
    complex query 1:
        <a href="<c:url value='/songComplex'/>" target="body">song: select * from song s where  exists (SELECT * FROM song WHERE songID = s.songID AND streams > 1000000 AND genre = 'pop') ;
        </a>&nbsp;&nbsp;
    
    <BR>
    <BR>
    complex query 2:
        <a href="<c:url value='/songComplex2'/>" target="body">song: select songID, genre, streams, song_name, BPM from song s where  streams < (SELECT AVG(streams) FROM song WHERE albumID = s.albumID)</a>&nbsp;&nbsp;
        
    <BR>
    <BR>
    complex query 3:
        <a href="<c:url value='/songComplex3'/>" target="body">song: select * from song s where  BPM < (SELECT AVG(BPM) FROM song WHERE albumID = s.albumID)</a>&nbsp;&nbsp;
        
    <BR>
    <BR>
    complex query 4:
        <a href="<c:url value='/albumComplex'/>" target="body">album: select * from album s where  rating >  (SELECT AVG(rating) FROM album WHERE length < '00:59:00')</a>&nbsp;&nbsp;    
        
    <BR>
    <BR>
    complex query 5:
        <a href="<c:url value='/albumComplex2'/>" target="body">album: select * from album s where (s.total_streams <= 99999) and s.albumID in (select albumID from album where rating  > 55);
        </a>&nbsp;&nbsp;        
    
    <BR>
    <BR>
    complex query 6:
        <a href="<c:url value='/songartistComplex'/>" target="body"> SELECT * FROM song S INNER JOIN album a ON S.albumID = a.albumID where rating > 75 and BPM <100 ;
        </a>&nbsp;&nbsp; 
        
        <BR>
    <BR>
    complex query 7:
        <a href="<c:url value='/songartistComplex2'/>" target="body"> SELECT * FROM song S INNER JOIN album a ON S.albumID = a.albumID where rating = 84 and BPM = 152 group by genre;
        </a>&nbsp;&nbsp;  
            
       <BR>
    <BR>
    complex query 8:
        <a href="<c:url value='/songartistComplex3'/>" target="body">  SELECT * FROM song S INNER JOIN album a ON S.albumID = a.albumID where BPM between 80 and 190 and rating between 79 and 100;
        
        </a>&nbsp;&nbsp;    
    
    <BR>
    <BR>
    complex query 9:
        <a href="<c:url value='/songartistComplex4'/>" target="body">  SELECT * FROM song S INNER JOIN album a ON S.albumID = a.albumID where genre = 'psychodelic' and length between '00:40:00' and '00:52:00' ORDER by BPM;
        
        </a>&nbsp;&nbsp;    
        
        
    <BR>
    <BR>
        complex query 10:
        <a href="<c:url value='/songartistComplex5'/>" target="body">  "SELECT * FROM song S INNER JOIN album a ON S.albumID = a.albumID where genre = 'pop' or genre = 'rap' and rating >= 80 and length > '00:40:00' order by BPM";
        
        
        </a>&nbsp;&nbsp;    
    
  </body>
</html>
