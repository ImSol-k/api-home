package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.Jw_MypageDao;
import com.javaex.vo.Jw_Vo;
import com.javaex.vo.OrderInfo_Vo; // OrderInfo 클래스를 OrderInfo_Vo로 변경

@Service
public class Jw_MypageService {

    @Autowired
    private Jw_MypageDao mypageDao;

    public Jw_Vo getUserInfo(int userNo) {
    	System.out.println("Jw_MypageService");
        // DAO를 통해 데이터베이스에서 사용자 정보를 가져옴
        return mypageDao.getUserInfo(userNo);
    }

    public List<OrderInfo_Vo> getOrders(int userNo) { // OrderInfo 클래스를 OrderInfo_Vo로 변경
        // DAO를 통해 데이터베이스에서 주문 내역을 가져옴
        return mypageDao.getOrders(userNo);
    }
}
