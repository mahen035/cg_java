<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
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

</style>
</head>
<body>
<h1>Movie App</h1>
<div class="show"><a href="/show">Show Movies</a></div>
<div class="show"><a href="/addMovie">Add Movies</a></div>
</body>
</html>