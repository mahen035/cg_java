<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Movies List</h1>
    <table border="2" width="70%" cellpadding="2">
        <tr>
            <th>Id</th>
            <th>MovieName</th>
            <th>Year</th>
            <th>rating</th>
            <th>category</th>
            <th>Delete</th>
        </tr>
        <c:forEach var="movie" items="${movie}">
            <tr>
                <td>${movie.id}</td>
                <td>${movie.movieName}</td>
                <td>${movie.year}</td>
                <td>${movie.rating}</td>
                <td>${movie.category}</td>
                
                <td><a href="/delete/${movie.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
<br/>
<a href="/save">Save</a>