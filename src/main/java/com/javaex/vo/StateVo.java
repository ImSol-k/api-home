package com.javaex.vo;

public class StateVo {
	
	private String productName;
	private int count;
	private int price;
	private String nickName;
	private String color;
	private String mainImage;
	private String state;
	
	
	public StateVo() {
		super();
	}


	public StateVo(String productName, int count, int price, String nickName, String color, String mainImage,
			String state) {
		super();
		this.productName = productName;
		this.count = count;
		this.price = price;
		this.nickName = nickName;
		this.color = color;
		this.mainImage = mainImage;
		this.state = state;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getNickName() {
		return nickName;
	}


	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getMainImage() {
		return mainImage;
	}


	public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return "StateVo [productName=" + productName + ", count=" + count + ", price=" + price + ", nickName="
				+ nickName + ", color=" + color + ", mainImage=" + mainImage + ", state=" + state + "]";
	}
	
	
	
	
}
