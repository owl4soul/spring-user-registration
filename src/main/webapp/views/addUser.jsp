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
<form:form method="post" modelAttribute="registrationForm" lang="en">

    <table>
        <tr valign=top>
            <td>
                Username:
                <input type="text" name="name" value="" size=30 maxlength=255>
            </td>
        </tr>
        <tr valign=top>
            <td>
                Password:
                <input type="text" name="password" value="" size=30 maxlength=31>
            </td>
        </tr>
        <tr valign=top>
            <td>
                Confirm password:
                <input type="text" name="confirmPassword" value="" size=30 maxlength=31>
            </td>
        </tr>
        <tr valign=top>
            <td>
                First name:
                <input type="text" name="first" value="" size=25 maxlength=50>
            </td>
        </tr>
        <tr valign=top>
            <td>
                Last name:
                <input type="text" name="last" value="" size=25 maxlength=50>
            </td>
        </tr>
        <tr valign=top>
            <td>
                Phone name:
                <input type="text" name="phone" value="" size=25 maxlength=50>
            </td>
        </tr>
        <tr valign=top>
            <td>
                Email:
                <input type="text" name="email" value="" size=30 maxlength=50>
            </td>
        </tr>

        </tr>
        <input type="submit" value="Register new user">
    </table>
</form:form>
</body>
</html>