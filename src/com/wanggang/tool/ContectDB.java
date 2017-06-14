package com.wanggang.tool;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ContectDB {
	private static final String dbAddress = "jdbc:mysql://localhost:3306/wanggang?useUnicode=true&characterEncoding=UTF-8";
	private static final String dbUsername = "root";
	private static final String dbPassword = "123456";
	
	public static Connection getDbConnection () {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				con = (Connection) DriverManager.getConnection(dbAddress,dbUsername,dbPassword);
				return con;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static void closeCon (Connection con){
		if (con != null){
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
