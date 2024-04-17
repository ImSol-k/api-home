package com.javaex.vo;

public class MainVo {

	private int productNo;
	private String mainImg;
	private String category;
	private String productName;
	private double star;
	private int price;
	
	public MainVo() {

	}

	public MainVo(int productNo, String mainImg, String category, String productName, double star, int price) {
		this.productNo = productNo;
		this.mainImg = mainImg;
		this.category = category;
		this.productName = productName;
		this.star = star;
		this.price = price;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getMainImg() {
		return mainImg;
	}

	public void setMainImg(String mainImg) {
		this.mainImg = mainImg;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getStar() {
		return star;
	}

	public void setStar(double star) {
		this.star = star;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MainVo [productNo=" + productNo + ", mainImg=" + mainImg + ", category=" + category + ", productName="
				+ productName + ", star=" + star + ", price=" + price + "]";
	}
	
}
