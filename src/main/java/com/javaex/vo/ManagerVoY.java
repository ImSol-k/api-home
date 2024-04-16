package com.javaex.vo;

import java.util.List;

public class ManagerVoY {

	private int product_no;
	private String product_name;
	private int price;
	private String category;
	private String main_img;

	private List<ImageVo> imageList;

	public ManagerVoY() {
		super();
	}

	public int getProduct_no() {
		return product_no;
	}

	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getMain_img() {
		return main_img;
	}

	public void setMain_img(String main_img) {
		this.main_img = main_img;
	}

	public List<ImageVo> getImageList() {
		return imageList;
	}

	public void setImageList(List<ImageVo> imageList) {
		this.imageList = imageList;
	}

	@Override
	public String toString() {
		return "ManagerVoY [product_no=" + product_no + ", product_name=" + product_name + ", price=" + price
				+ ", category=" + category + ", main_img=" + main_img + ", imageList=" + imageList + "]";
	}

}
