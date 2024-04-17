package com.javaex.vo;

public class ProductListVo {
	private int product_no;
	private String main_img;
	private String product_name;
	private float avg_star;
	
	public ProductListVo() {
		super();
	}

	public int getProduct_no() {
		return product_no;
	}

	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}

	public String getMain_img() {
		return main_img;
	}

	public void setMain_img(String main_img) {
		this.main_img = main_img;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public float getAvg_star() {
		return avg_star;
	}

	public void setAvg_star(float avg_star) {
		this.avg_star = avg_star;
	}

	@Override
	public String toString() {
		return "ProductListVo [product_no=" + product_no + ", main_img=" + main_img + ", product_name=" + product_name
				+ ", avg_star=" + avg_star + "]";
	}
	
}
