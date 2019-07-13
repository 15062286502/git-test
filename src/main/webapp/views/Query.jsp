<%--
  Created by IntelliJ IDEA.
  User: syf
  Date: 2019/4/20
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<table>
    <tr>
        <td>${requestScope.message.getId()}</td>
        <td>${requestScope.message.getName()}</td>
        <td>${requestScope.message.getPrice()}</td>
    </tr>
</table>
</body>
</html>
