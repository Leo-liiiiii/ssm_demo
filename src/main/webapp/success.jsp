<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/17
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>爱好</td>
        <td>单身</td>
    </tr>
    <c:forEach items="${girls}" var="girl">
        <tr>
            <td>${girl.id}</td>
            <td>${girl.name}</td>
            <td>${girl.age}</td>
            <td>${girl.hobby}</td>
            <td>
                <c:if test="${girl.alone==o}">男</c:if>
                <c:if test="${girl.alone==1}">女</c:if>
            </td>

        </tr>
    </c:forEach>

</table>
</body>
</html>
