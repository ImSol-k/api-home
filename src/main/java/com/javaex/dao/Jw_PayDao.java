// Jw_PayDao.java

package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.OrderDetail_Vo;
import com.javaex.vo.OrderInfo_Vo;
import com.javaex.vo.SolCartVo;



@Repository
public class Jw_PayDao {

	@Autowired
	private SqlSession sqlSession;

	// 장바구니 데이터 조회 메서드
	public List<SolCartVo> getCartItems(int userNo) {
		System.out.println("Jw_PayDao.getCartItems");
		
		
		return sqlSession.selectList("jw.getCartItems", userNo);
	}
	

	// 주문 생성 메서드
	public int createOrder(OrderInfo_Vo orderInfo_Vo) {
		System.out.println("Jw_PayDao.createOrder()");

		int count = sqlSession.insert("jw.createOrder", orderInfo_Vo);
		System.out.println(orderInfo_Vo);
		return count;
	}

	// 주문 상세 정보 생성 메서드
	public void createOrderDetail(OrderDetail_Vo orderDetail_Vo) {
		System.out.println("Jw_PayDao.createOrderDetail()");
		sqlSession.insert("jw.createOrderDetail", orderDetail_Vo);
	}

	// 장바구니 비우기 메서드
//    public int clearCart(int userNo) {
//        System.out.println("Jw_PayDao.clearCart()");
//        int count = sqlSession.delete("jw.clearCart", userNo);
//        return count;
//    }
}