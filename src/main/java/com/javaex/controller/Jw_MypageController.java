package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.Jw_MypageService;
import com.javaex.vo.Jw_Vo;
import com.javaex.vo.OrderInfo_Vo;

@RestController
@RequestMapping("/home/mypage")
public class Jw_MypageController {

    @Autowired
    private Jw_MypageService mypageService;

    @GetMapping("/userinfo/{no}")
    public Jw_Vo getUserInfo(@PathVariable("no") int userNo) {
    	System.out.println("Jw_MypageController");
        return mypageService.getUserInfo(userNo);
   
    }

    @GetMapping("/orders/{no}")
    public List<OrderInfo_Vo> getOrders(@PathVariable("no") int userNo) {
    	System.out.println("Jw_MypageController");
        return mypageService.getOrders(userNo);
    }
}