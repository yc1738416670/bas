<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>接收参数</title>
</head>
<body>
<form action="receive.do" method="post">
    姓名<input type="text" name="rname">
    <br>
    年龄<input type="text" name="rage">
    <input type="submit" value="提交">
</form>
<%--通过对象接收参数--%>
<form action="receiveobject.do" method="post">
    姓名<input type="text" name="name">
    <br>
    年龄<input type="text" name="age">
    <input type="submit" value="提交">
</form>
</body>
</html>
