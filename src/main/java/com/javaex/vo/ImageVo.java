package com.javaex.vo;

public class ImageVo {

	private int img_no;
	private String save_name;
	
	public ImageVo(int img_no, String save_name) {
		super();
		this.img_no = img_no;
		this.save_name = save_name;
	}
	public int getImg_no() {
		return img_no;
	}
	public void setImg_no(int img_no) {
		this.img_no = img_no;
	}
	public String getSave_name() {
		return save_name;
	}
	public void setSave_name(String save_name) {
		this.save_name = save_name;
	}
	@Override
	public String toString() {
		return "ImageVo [img_no=" + img_no + ", save_name=" + save_name + "]";
	}
	
	
}
