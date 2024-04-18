package com.javaex.vo;

public class SolCartVo {

	private String cart;
	private int productNo;
	private String product;
	private String user;
	private int colorNo;
	private String color;
	private int count;
	private int userNo;
	private int price;

	public SolCartVo() {

	}

	public SolCartVo(String cart, int productNo, String product, String user, int colorNo, String color, int count,
			int userNo, int price) {
		super();
		this.cart = cart;
		this.productNo = productNo;
		this.product = product;
		this.user = user;
		this.colorNo = colorNo;
		this.color = color;
		this.count = count;
		this.userNo = userNo;
		this.price = price;
	}

	public String getCart() {
		return cart;
	}

	public void setCart(String cart) {
		this.cart = cart;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
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

	public int getColorNo() {
		return colorNo;
	}

	public void setColorNo(int colorNo) {
		this.colorNo = colorNo;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "SolCartVo [cart=" + cart + ", productNo=" + productNo + ", product=" + product + ", user=" + user
				+ ", colorNo=" + colorNo + ", color=" + color + ", count=" + count + ", userNo=" + userNo + ", price="
				+ price + "]";
	}

}
