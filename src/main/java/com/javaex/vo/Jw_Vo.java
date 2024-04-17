package com.javaex.vo;

public class Jw_Vo {

	// 유저
	private int userNo;
	private String id;
	private String password;
	private String name;
	private String nickName;
	private String hp;
	private String email;
	private String address;
	private int manager;
	
	// Order VO
	private int orderNo;
	private String orderDate;

	// Product VO
	private int productNo;
	private String productName;
	private int price;

	// Color VO
	private int colorNo;
	private String color;

	public Jw_Vo() {

	}
	// 유저 ID, Password VO 생성자
	public Jw_Vo(String id, String password) {

		this.id = id;
		this.password = password;
	}

	public Jw_Vo(int userNo, String id, String password, String name, String nickName, String hp, String email,
			String address, int manager) {

		this.userNo = userNo;
		this.id = id;
		this.password = password;
		this.name = name;
		this.nickName = nickName;
		this.hp = hp;
		this.email = email;
		this.address = address;
		this.manager = manager;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getManager() {
		return manager;
	}

	public void setManager(int manager) {
		this.manager = manager;
	}
	
	 

/*	@Override
	public String toString() {
		return "Jw_Vo [userNo=" + userNo + ", id=" + id + ", password=" + password + ", name=" + name + ", nickName="
				+ nickName + ", hp=" + hp + ", email=" + email + ", address=" + address + ", manager=" + manager + "]";
	}*/
	
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
	public int getProductNo() {
		return productNo;
	}
	public void setProductNo(int productNo) {
		this.productNo = productNo;
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
	@Override
	public String toString() {
		return "Jw_Vo [userNo=" + userNo + ", id=" + id + ", password=" + password + ", name=" + name + ", nickName="
				+ nickName + ", hp=" + hp + ", email=" + email + ", address=" + address + ", manager=" + manager
				+ ", orderNo=" + orderNo + ", orderDate=" + orderDate + ", productNo=" + productNo + ", productName="
				+ productName + ", price=" + price + ", colorNo=" + colorNo + ", color=" + color + "]";
	}

}