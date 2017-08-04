<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/30/030
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>login.jsp....</title>
</head>
<body>
    <c:if test="${!empty error}">
        <font color="red"><empty:out value="${error}"/></font>
    </c:if>
    <form action="<c:url value="/longinCheck.html"/> "method="post">
        用户名：
        <input type="text" name="userName">
        <br>
        密码：
        <input type="password" name="password">
        <br>
        <input type="submit" value="登录"/>
        <input type="reset" value="重置"/>
    </form>

</body>
</html>
