package com.javaex.vo;

import java.util.ArrayList;
import java.util.List;

public class OrderInfo_Vo {
    private int userNo;
    private int orderNo;
    private String orderDate;
    private String productName;
    private int price;
    private String color;
    public List<OrderDetail_Vo> OrderDetailList;

    public OrderInfo_Vo() {
        this.OrderDetailList = new ArrayList<>(); // OrderDetailList 필드 초기화
    }

    public OrderInfo_Vo(int orderNo, String orderDate, String productName, int price, String color) {
        super();
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.productName = productName;
        this.price = price;
        this.color = color;
        this.OrderDetailList = new ArrayList<>(); // OrderDetailList 필드 초기화
    }

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<OrderDetail_Vo> getOrderDetailList() {
        return OrderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail_Vo> orderDetailList) {
        OrderDetailList = orderDetailList;
    }

    @Override
    public String toString() {
        return "OrderInfo_Vo [userNo=" + userNo + ", orderNo=" + orderNo + ", orderDate=" + orderDate + ", productName="
                + productName + ", price=" + price + ", color=" + color + ", OrderDetailList=" + OrderDetailList + "]";
    }
}
