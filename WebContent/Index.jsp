<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@page import="com.wanggang.dao.*" %>
<%@page import="com.wanggang.entity.*" %>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>用户列表</title>
    </head>
    
<%
	List list = UserDao.getAllUser();
%>
    <body>
    	<h1 align="center">所有用户</h1>
    	<table border="1" cellspacing="0" cellpadding="5" align="center">
    		<tr>
    			<th>用户ID</th>
    			<th>用户姓名</th>
    			<th>用户操作</th>
    		</tr>
    		<%
    			for (int i=0;list!=null&&i<list.size();i++){
    				User u = (User)list.get(i);
    		%>
    		<tr>
    			<td><%=u.getId() %></td>
    			<td><%=u.getUsername() %></td>
    			<td>
    				<a href="/UserInfo/ProductController?act=0&id=<%=u.getId() %>">[详情]</a>
    				<a href="/UserInfo/ProductController?act=1&id=<%=u.getId() %>">[添加物品]</a>
    			</td>
    		</tr>
    		<%
    			}
    		%>
    	</table>
 	</body>
</html>