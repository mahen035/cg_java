<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a Movie</title>
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
<h1>Add Movie</h1>
		<form:form method="POST" action="save" modelAttribute="movie">
             <table>
             	<!--<tr>
                    <td><form:label path="id">ID: </form:label></td>
                    <td><form:input path="id"/></td>
                </tr>-->
                <tr>
                    <td><form:label path="movieName">Name: </form:label></td>
                    <td><form:input path="movieName"/></td>
                </tr>
                <tr>
                    <td><form:label path="year">Year: </form:label></td>
                    <td><form:input path="year"/></td>
                </tr>
                <tr>
                    <td><form:label path="rating">Rating: </form:label></td>
                    <td><form:input path="rating"/></td>
                </tr>
                <tr>
                    <td><form:label path="genre">Genre: </form:label></td>
                    <td><form:input path="genre"/></td>
                </tr>
               
                <tr>
                    <td><input type="submit" value="Add"/></td>
                </tr>
            </table>
        </form:form>
</body>
</html>