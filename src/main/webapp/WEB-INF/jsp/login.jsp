<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="empty" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>测试1111</title>
</head>
<body>
    <c:if test="${!empty error}">
        <font color="red"><empty:out value="${error}"/></font>
    </c:if>
    <form action="<c:url value="loginCheck.html"/> "method="post">
        用户名：
        <input type="text" name="userName">
        <br>
        密码：
        <input type="password" name="password">
        <br>
        <input type="submit" value="登录111"/>
        <input type="reset" value="重置"/>
    </form>

</body>
</html>
