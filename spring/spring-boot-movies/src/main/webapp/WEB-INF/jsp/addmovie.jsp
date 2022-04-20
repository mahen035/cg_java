<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Add Movies</h1>
<form:form method="post" action="/save">
    <table>
        <tr>
            <td>Name: </td>
            <td><form:input path="movieName"/></td>
        </tr>
        <tr>
            <td>Year: </td>
            <td><form:input path="year"/></td>
        </tr>
        <tr>
            <td>Rating: </td>
            <td><form:input path="rating"/></td>
        </tr>
        <tr>
            <td>Category: </td>
            <td><form:input path="category"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Add"/></td>
        </tr>
    </table>
</form:form>