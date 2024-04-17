package com.javaex.vo;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class ManagerVoY {

	private int product_no;
	private String title;
	private int price;
	private String category;
	private MultipartFile profile;
	private String main_img;

	private List<MultipartFile> contentFiles;
	private List<String> contentImg;
	
	private float avg_star;

	public ManagerVoY() {
		super();
	}
	
	
	public float getAvg_star() {
		return avg_star;
	}


	public void setAvg_star(float avg_star) {
		this.avg_star = avg_star;
	}


	public List<String> getContentImg() {
		return contentImg;
	}

	public void setContentImg(List<String> contentImg) {
		this.contentImg = contentImg;
	}

	public String getMain_img() {
		return main_img;
	}
	public void setMain_img(String main_img) {
		this.main_img = main_img;
	}

	public int getProduct_no() {
		return product_no;
	}

	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public MultipartFile getProfile() {
		return profile;
	}

	public void setProfile(MultipartFile profile) {
		this.profile = profile;
	}

	public List<MultipartFile> getContentFiles() {
		return contentFiles;
	}

	public void setContentFiles(List<MultipartFile> contentFiles) {
		this.contentFiles = contentFiles;
	}

	@Override
	public String toString() {
		return "ManagerVoY [product_no=" + product_no + ", title=" + title + ", price=" + price + ", category="
				+ category + ", profile=" + profile + ", main_img=" + main_img + ", contentFiles=" + contentFiles
				+ ", contentImg=" + contentImg + ", avg_star=" + avg_star + "]";
	}

}
