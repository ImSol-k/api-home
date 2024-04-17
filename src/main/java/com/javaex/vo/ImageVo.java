package com.javaex.vo;

import org.springframework.web.multipart.MultipartFile;

public class ImageVo {

	private int img_no;
	private MultipartFile add;
	
	public ImageVo() {
	}

	public int getImg_no() {
		return img_no;
	}

	public void setImg_no(int img_no) {
		this.img_no = img_no;
	}

	public MultipartFile getAdd() {
		return add;
	}

	public void setAdd(MultipartFile add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "ImageVo [img_no=" + img_no + ", add=" + add + "]";
	}

}
