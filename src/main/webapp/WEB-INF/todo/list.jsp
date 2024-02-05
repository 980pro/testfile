<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 804-14
  Date: 2024-01-16
  Time: 오후 12:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Todo List</h1>
<ul>
        <li>${dto.name}</li>
            <li>${dto.age}</li>
            <li>${dto.userid}</li>
            <li>${dto.userpass}</li>
            <li>
                <c:if test="${dto.sex == true}">
                    남자
                </c:if>
                <c:if test="${dto.sex == false}">
                    여자
                </c:if>
                </li>
            <li>${dto.hobby}</li>
            <li>${dto.travel}</li>
            <li>${dto.text}</li>

</ul>
</body>
</html>
