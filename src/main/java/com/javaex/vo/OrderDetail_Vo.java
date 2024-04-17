// OrderDetail_Vo.java

package com.javaex.vo;

public class OrderDetail_Vo {
    private int orderNo;
    private int productNo;
    private int count;
    private int colorNo;
    
    public OrderDetail_Vo() {
    
    }
    
    public OrderDetail_Vo(int orderNo, int productNo, int count, int colorNo) {
        this.orderNo = orderNo;
        this.productNo = productNo;
        this.count = count;
        this.colorNo = colorNo;
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
    
    @Override
    public String toString() {
        return "OrderDetail_Vo [orderNo=" + orderNo + ", productNo=" + productNo + ", count=" + count + ", colorNo="
            + colorNo + "]";
    }
}