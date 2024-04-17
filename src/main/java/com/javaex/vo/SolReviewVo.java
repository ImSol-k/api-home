package com.javaex.vo;

public class SolReviewVo {

	private int reviewNo;
	private int star;
	private String regDate;
	private String content;
	private String imgName;
	private String id;
	private int userNo;
	private int productNo;
	
	private int page;

	public SolReviewVo() {
		super();
	}

	public SolReviewVo(int star, String content, int userNo, int productNo) {
		super();
		this.star = star;
		this.content = content;
		this.userNo = userNo;
		this.productNo = productNo;
	}

	public SolReviewVo(int star, String content, String imgName, int userNo) {
		super();
		this.star = star;
		this.content = content;
		this.imgName = imgName;
		this.userNo = userNo;
	}

	public SolReviewVo(int reviewNo, int star, String regDate, String content, String imgName) {
		super();
		this.reviewNo = reviewNo;
		this.star = star;
		this.regDate = regDate;
		this.content = content;
		this.imgName = imgName;
	}

	public int getReviewNo() {
		return reviewNo;
	}

	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	
	@Override
	public String toString() {
		return "SolReviewVo [reviewNo=" + reviewNo + ", star=" + star + ", regDate=" + regDate + ", content=" + content
				+ ", imgName=" + imgName + ", id=" + id + ", userNo=" + userNo + ", productNo=" + productNo + "]";
	}
	
	

}
