package com.javaex.vo;

public class SolCartVo {
	
	private String cart;
	private String product;
	private String user;
	private String color;
	private int count;
	private int userNo;
	
	public SolCartVo() {
		super();
	}
	
	public SolCartVo(String cart, String product, String user, String color, int count) {
		super();
		this.cart = cart;
		this.product = product;
		this.user = user;
		this.color = color;
		this.count = count;
	}



	public String getCart() {
		return cart;
	}
	public void setCart(String cart) {
		this.cart = cart;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	@Override
	public String toString() {
		return "SolCartVo [cart=" + cart + ", product=" + product + ", user=" + user + ", color=" + color + ", count="
				+ count + "]";
	}

	
	
}
