<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加物品</title>
</head>
<body>
<form action="/UserInfo/ProductController" method="post">
	<input type="hidden" name="uid" value="<%=request.getParameter("id") %>">
	<input type="hidden" name="act" value="2">
	名字:<input type="text" name="pname">
	<input type="submit">
</form>
</body>
</html>