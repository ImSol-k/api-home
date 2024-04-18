// OrderDetail_Vo.java

package com.javaex.vo;

public class OrderDetail_Vo {
	private int orderlistNo;
    private int orderNo;
    private int productNo;
    private int count;
    private int colorNo;
    private String color;
    
    public OrderDetail_Vo() {
    
    }
    
    

	public OrderDetail_Vo(int orderlistNo, int orderNo, int productNo, int count, int colorNo, String color) {
		super();
		this.orderlistNo = orderlistNo;
		this.orderNo = orderNo;
		this.productNo = productNo;
		this.count = count;
		this.colorNo = colorNo;
		this.color = color;
	}



	public int getOrderlistNo() {
		return orderlistNo;
	}

	public void setOrderlistNo(int orderlistNo) {
		this.orderlistNo = orderlistNo;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getColorNo() {
		return colorNo;
	}

	public void setColorNo(int colorNo) {
		this.colorNo = colorNo;
	}
	

	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	@Override
	public String toString() {
		return "OrderDetail_Vo [orderlistNo=" + orderlistNo + ", orderNo=" + orderNo + ", productNo=" + productNo
				+ ", count=" + count + ", colorNo=" + colorNo + ", color=" + color + "]";
	}



	
    
   
}