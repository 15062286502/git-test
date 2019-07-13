<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: syf
  Date: 2019/4/20
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<c:forEach var="g" items="${message}">
    ${g.getId()}
    ${g.getName()}

    </br>
</c:forEach>
</head>
<body>

</body>
</html>
