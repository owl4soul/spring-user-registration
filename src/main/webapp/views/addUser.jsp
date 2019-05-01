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

    <tr bgcolor="#c8d8f8">
        <tr valign=top>
            Username:
            <input type="text" name="name" value="" size=30 maxlength=255></tr>
        <tr valign=top>
            Password:
            <input type="text" name="password" value="" size=30 maxlength=31></tr>
        <tr valign=top>
            First name:
            <input type="text" name="first" value="" size=25 maxlength=50></tr>
        <tr valign=top>
            Last name:
            <input type="text" name="last" value="" size=25 maxlength=50></tr>
        <tr valign=top>
            Phone name:
            <input type="text" name="phone" value="" size=25 maxlength=50></tr>
        <tr valign=top>
            Email:
            <input type="text" name="email" value="" size=30 maxlength=50></tr>

    </tr>
    <input type="submit" value="Register new user">
    </table>
</form:form>
</body>
</html>