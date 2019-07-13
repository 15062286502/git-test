<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<link rel="stylesheet" type="text/css" href="../statics/test.css" />
<p>Spring MVC based on XML config success!</p>
</body>
<form action="<%=request.getContextPath()%>/home/login" method="post">
用户名：<input type="text" name="name">
密码：<input type="password" name="password">
<input type="submit" value="登陆">
</form>

</html>

