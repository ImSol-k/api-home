package com.javaex.vo;

public class ColorVo {

	private int no;
	private String color;
	
	public ColorVo() {

	}

	public ColorVo(int no, String color) {
		this.no = no;
		this.color = color;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "ColorVo [no=" + no + ", color=" + color + "]";
	}

}
