package com.javaex.vo;

public class PayendVo2 {
	
	private String productName;
	private int productPrice;
	
	
	public PayendVo2() {
		super();
	}


	public PayendVo2(String productName, int productPrice) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}


	@Override
	public String toString() {
		return "PayendVo2 [productName=" + productName + ", productPrice=" + productPrice + "]";
	}
	
	
}
