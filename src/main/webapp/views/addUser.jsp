<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: owl
  Date: 4/29/19
  Time: 7:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Add new user</title>
</head>
<body>
You can register new user here:
<br>
<form:form method="post" modelAttribute="addUser" lang="en">

    <tr bgcolor="#c8d8f8">
        <td valign=top>
            Username:
            <input type="text" name="name" value="" size=25 maxlength=30></td>
        <td valign=top>
            First name:
            <input type="text" name="first" value="" size=50 maxlength=30></td>
        <td valign=top>
            Last name:
            <input type="text" name="last" value="" size=50 maxlength=30></td>
        <td valign=top>
            Phone name:
            <input type="text" name="phone" value="" size=50 maxlength=30></td>

    </tr>
    <input type="submit" value="Register new user">
    </table>
</form:form>
</body>
</html>