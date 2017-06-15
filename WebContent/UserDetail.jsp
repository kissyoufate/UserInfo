<%@page import="com.wanggang.dao.ProductDao"%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="com.wanggang.entity.*" %>
<%
	List list = (List)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>用户详情</title>
    </head>
    <body>
    	<table border="1" cellspacing="0" cellpadding="5" align="center">
    		<tr>
    			<th colspan="3">拥有物品</th>
    		</tr>
    		<tr>
    			<th>物品ID</th>
    			<th>物品名称</th>
    			<th>物品操作</th>
    		</tr>
    		<%
    			for(int i=0;list!=null&&i<list.size();i++){
    				Product d = (Product)list.get(i);
    		%>
    		<tr>
    			<th><%=d.getId() %></th>
    			<th><%=d.getPname() %></th>
    			<th>
    				<a href="/UserInfo/ProductController?act=3&uid=<%=d.getUid() %>&id=<%=d.getId() %>">[删除]</a>
    				<a href="#">[编辑]</a>
    			</th>
    		</tr>
    		<%
    			}
    		%>
    	</table>
 	</body>
</html>