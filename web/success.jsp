<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/8/22
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功</title>
</head>
<body>
<%=request.getAttribute("msg")%>
用户名：<%=request.getAttribute("name")%>

</body>
</html>
