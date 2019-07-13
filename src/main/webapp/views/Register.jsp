<%--
  Created by IntelliJ IDEA.
  User: syf
  Date: 2019/4/14
  Time: 23:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册界面</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/home/register" method="post">
    用户名：<input type="text" name="name">
    密码：<input type="password" name="password">
    <input type="submit" value="注册">
</form>
</body>
</html>
