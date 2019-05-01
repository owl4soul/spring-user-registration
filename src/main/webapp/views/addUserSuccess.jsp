<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: owl
  Date: 4/29/19
  Time: 8:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>User registration was successful. </h1>
A new user with parameters ${user} has been registered.<br>

<br><h4>Here you can see the list of all users have been added in current session:</h4><br>
<table>
    <c:forEach items="${list}" var="usr">

        <tr>
            <td>${usr}</td>
        <tr>
        <tr>
            <td>
                <form action="/edit" method="get">
                    <input type="hidden" name="editByName" value="${usr.userName}">
                    <button type="submit" name="command" value="editButton">Edit user</button>
                </form>
            </td>


            <td>
                <form action="/delete" method="get">
                    <input type="hidden" name="deleteByName" value="${usr.userName}">
                    <button type="submit" name="command" value="deleteButton">Delete user</button>
                </form>
            </td>
        </tr>
        </tr>
        </tr>
    </c:forEach>
</table>
</body>
</html>
