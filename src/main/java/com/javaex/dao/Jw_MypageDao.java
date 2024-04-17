package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.Jw_Vo;
import com.javaex.vo.OrderInfo_Vo; // OrderInfo 클래스를 OrderInfo_Vo로 변경

@Repository
public class Jw_MypageDao {

    @Autowired
    private SqlSession sqlSession;

    public Jw_Vo getUserInfo(int userNo) {
        // MyBatis를 사용하여 데이터베이스로부터 사용자 정보를 가져옴
    	System.out.println("Jw_MypageDao");
        return sqlSession.selectOne("jw.getUserInfo", userNo);
    }

    public List<OrderInfo_Vo> getOrders(int userNo) { // OrderInfo 클래스를 OrderInfo_Vo로 변경
        // MyBatis를 사용하여 데이터베이스로부터 주문 내역을 가져옴
        return sqlSession.selectList("jw.getOrders", userNo);
    }
}
