package com.javaex.vo;

public class OrderInfo_Vo {
	private int orderNo;
	private String orderDate;
	private String productName;
	private int price;
	private String color;
	
	public OrderInfo_Vo() {

	}
	
	public OrderInfo_Vo(int orderNo, String orderDate, String productName, int price, String color) {
		super();
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.productName = productName;
		this.price = price;
		this.color = color;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "OrderInfo_Vo [orderNo=" + orderNo + ", orderDate=" + orderDate + ", productName=" + productName
				+ ", price=" + price + ", color=" + color + "]";
	}

	
	
	
}