<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Movies</title>
<style type="text/css">
h1{
	color : red;
	text-align : center;
}
.show{
	margin : 10px auto;
	padding : 2px;
	width : 150px;
	height : 20px;
	border : 2px solid black;
	border-radius : 10px;
	text-align : center;
}
a{
	color : black;
	text-decoration : none;
}
#heads{
	color:red;
}
</style>
</head>
<body>
<h1>Favorite Movies :</h1>
<table>
	<thead>
	<tr id="heads">
		<td>Movie</td>
		<td>Rating</td>
		<td>Genre</td>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${movies}" var="movie">
	<tr class="list">
		<td>${movie.getMovieName()} (${movie.getYear()})</td>
		<td>${movie.getRating()}</td>
		<td>${movie.getGenre()}</td>
	</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>
















