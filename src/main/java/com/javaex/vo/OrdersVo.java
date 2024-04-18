package com.javaex.vo;

public class OrdersVo {

	private int orderNo;
	private int userNo;
	private String orderDate;
	private String state;
	
	public OrdersVo() {
		super();
	}

	public OrdersVo(int orderNo, int userNo, String orderDate, String state) {
		super();
		this.orderNo = orderNo;
		this.userNo = userNo;
		this.orderDate = orderDate;
		this.state = state;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "OrdersVo [orderNo=" + orderNo + ", userNo=" + userNo + ", orderDate=" + orderDate + ", state=" + state
				+ "]";
	}
	
	
}
