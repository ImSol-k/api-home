package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.SolCartService;
import com.javaex.util.JsonResult;
import com.javaex.vo.SolCartVo;

@RestController
@RequestMapping("home/cart/")
public class SolCartController {
	
	@Autowired
	private SolCartService cartService;
	
	@PostMapping("add")
	public JsonResult addCart(@RequestBody List<SolCartVo> cartList) {
		System.out.println("CartController.addCart");
		System.out.println(cartList.size());
		if(cartList.size() > 0) {
			cartService.exeCartAdd(cartList);
			return JsonResult.success(cartList.size());
		} else {
			return JsonResult.fail("선택한 상품 없음");
		}
		
	}

}
