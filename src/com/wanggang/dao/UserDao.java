package com.wanggang.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.wanggang.entity.User;
import com.wanggang.tool.ContectDB;

public class UserDao {
	
	//得到所有用户
	public static List getAllUser(){
		List list = new ArrayList();
		//连接数据库 并创建statement
		try {
			Connection con = ContectDB.getDbConnection();
			Statement sta = con.createStatement();
			String sql = "select *from user";
			ResultSet rs = sta.executeQuery(sql);
			while(rs.next()){
				User user = new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"));
				list.add(user);
			}
			ContectDB.closeCon(con);
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
