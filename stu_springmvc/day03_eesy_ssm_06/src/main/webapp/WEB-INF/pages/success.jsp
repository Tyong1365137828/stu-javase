<%--
  Created by IntelliJ IDEA.
  User: 13651
  Date: 2021/3/6
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--引入jstl--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>成果页面</title>
</head>
<body>
    <h1>成果</h1>
    ${accountList}
    <hr>

    <c:forEach items="${accountList}" var="acc">
        ${acc.name},&nbsp;&nbsp;&nbsp;
    </c:forEach>
</body>
</html>
