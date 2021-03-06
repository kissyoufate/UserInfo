package com.wanggang.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.wanggang.entity.Product;
import com.wanggang.tool.ContectDB;

//物品相关
public class ProductDao {
	// 得到ID下所有的物品
	public static List getAllProductsByUserId(String id) {
		List list = new ArrayList();
		Connection con = ContectDB.getDbConnection();
		try {
			Statement sta = con.createStatement();
			String sql = "select *from product where uid = " + id;
			ResultSet rs = sta.executeQuery(sql);
			while (rs.next()) {
				Product p = new Product(rs.getInt("id"), rs.getInt("uid"), rs.getString("pname"));
				list.add(p);
			}
			ContectDB.closeCon(con);
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	// 通过ID查找物品
	public static Product getProductById(String id) {
		Connection con = ContectDB.getDbConnection();
		try {
			Statement sta = con.createStatement();
			String sql = "select *from product where id = " + id;
			ResultSet rs = sta.executeQuery(sql);
			Product p = null;
			while (rs.next()) {
				p = new Product(rs.getInt("id"), rs.getInt("uid"), rs.getString("pname"));
			}
			return p;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// 在指定ID下添加一个物品
	public static int addProductOrderById(String id, String p) {
		Connection con = ContectDB.getDbConnection();
		try {
			Statement sta = con.createStatement();
			String sql = "insert into product values(null," + id + ",'" + p + "')";

			System.out.println(sql);
			return sta.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	// 删除指定的物品
	public static int delProductById(String id) {
		Connection con = ContectDB.getDbConnection();
		try {
			Statement sta = con.createStatement();
			String sql = "delete from product where id = " + id;
			return sta.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

	// 编辑指定物品
	public static int editProductById(String id, String name) {
		Connection con = ContectDB.getDbConnection();
		try {
			Statement sta = con.createStatement();
			String sql = "update product set pname = '" + name + "' where id = " + id;
			return sta.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
