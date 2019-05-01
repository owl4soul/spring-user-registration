<%--
  Created by IntelliJ IDEA.
  User: owl
  Date: 4/29/19
  Time: 9:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete user</title>
</head>
<body>
Are you sure about this action?
Delete user ${user}?

<form action="/deleteUserSuccess"  method="post">
    <input type="hidden" name="username" value="${user.userName}">
    <button type="submit" name="command" value="deleteButton">Delete this user</button>
    <input type="button" onclick="history.back();" value="No, go back now"/>
</form>

</body>
</html>
