<%--
  Created by IntelliJ IDEA.
  User: megvii
  Date: 2019/4/10
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../statics/test1.css" />
    <title>你好</title>
</head>
<body>
<div><h1>欢迎进入速达点餐界面！</h1></div>
<div>
    <form action="<%=request.getContextPath()%>/home/query" method="post">
        商品名称：<input type="text" name="name">
        <input type="submit" value="查询">
    </form>
</div>
<div>
    <form action="<%=request.getContextPath()%>/home/allquery" method="post">
        <input type="submit" value="查询所有商品">
    </form>
</div>
</body>
</html>
