<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑物品</title>
</head>
<body>
<form action="/UserInfo/ProductController?act=5&uid=${p.uid }&id=${p.id }" method="post">
物品名称:<input type="text" value="${p.pname }" name="pname">
<input type="submit" value="保存">
</form>
</body>
</html>