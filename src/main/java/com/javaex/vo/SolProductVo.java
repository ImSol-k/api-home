package com.javaex.vo;

import java.util.List;

public class SolProductVo {

	private int productNo;
	private int price;
	private String productName;
	private String category;
	private String mainImg;
	private List<ImageVo> imgList;
	
	public SolProductVo() {
		super();
	}
	public SolProductVo(int productNo, int price, String productName, String category, String mainImg,
			List<ImageVo> imgList) {
		super();
		this.productNo = productNo;
		this.price = price;
		this.productName = productName;
		this.category = category;
		this.mainImg = mainImg;
		this.imgList = imgList;
	}
	
	
	public int getProductNo() {
		return productNo;
	}
	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getMainImg() {
		return mainImg;
	}
	public void setMainImg(String mainImg) {
		this.mainImg = mainImg;
	}
	public List<ImageVo> getImgList() {
		return imgList;
	}
	public void setImgList(List<ImageVo> imgList) {
		this.imgList = imgList;
	}
	@Override
	public String toString() {
		return "SolProductVo [productNo=" + productNo + ", price=" + price + ", productName=" + productName
				+ ", category=" + category + ", mainImg=" + mainImg + ", imgList=" + imgList + "]";
	}
	
	
	
	
}
