// Jw_PayService.java

package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.Jw_PayDao;
import com.javaex.vo.OrderDetail_Vo;
import com.javaex.vo.OrderInfo_Vo;
import com.javaex.vo.SolCartVo;

@Service
public class Jw_PayService {

	@Autowired
	private Jw_PayDao jw_PayDao;
	
	
	public int execreateOrder(OrderInfo_Vo orderInfo_Vo) {
	    System.out.println("Jw_PayService.execreateOrder()");

	    // 주문 생성 및 주문 번호 반환
	    int count = jw_PayDao.createOrder(orderInfo_Vo);

	    // 주문 상세 정보 생성
//	    for (OrderDetail_Vo orderDetail : orderInfo_Vo.getOrderList()) {
//	        // 주문 번호 설정
//	        orderDetail.setOrderNo(orderInfo_Vo.getOrderNo());
//	        System.out.println(orderDetail);
//
//	        // 주문 상세 정보 생성
//	        jw_PayDao.createOrderDetail(orderDetail);
//	    }
	    
	    for(int i = 0; i < orderInfo_Vo.getOrderList().size(); i++) {
	    	orderInfo_Vo.getOrderList().get(i).setOrderNo(orderInfo_Vo.getOrderNo());
	    	jw_PayDao.createOrderDetail(orderInfo_Vo.getOrderList().get(i));
	    	System.out.println(orderInfo_Vo.getOrderList().get(i));
	    }

	    return orderInfo_Vo.getOrderNo();
	}
	

//	public int execreateOrder(OrderInfo_Vo orderInfo_Vo) {
//		System.out.println("Jw_PayService.execreateOrder()");
//
//		// 주문 생성 및 주문 번호 반환
//		int count = jw_PayDao.createOrder(orderInfo_Vo);
//
//		// 주문 상세 정보 생성
//		for (OrderDetail_Vo orderDetail : orderInfo_Vo.getOrderList()) {
//
//			int orderNo = orderInfo_Vo.getOrderNo();
//
//			orderInfo_Vo.setOrderNo(orderNo);
//			System.out.println(orderNo);
//
//			jw_PayDao.createOrderDetail(orderDetail);
//			System.out.println(orderDetail);
//		}
//
//		return count;
//	}

//    public int clearCart(int userNo) {
//        System.out.println("Jw_PayService.clearCart");
//        return jw_PayDao.clearCart(userNo);
//    }
}