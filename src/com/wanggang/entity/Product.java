package com.wanggang.entity;

public class Product {
	private int id;
	private int uid;
	private String pname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Product(int id, int uid, String pname) {
		super();
		this.id = id;
		this.uid = uid;
		this.pname = pname;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
}
