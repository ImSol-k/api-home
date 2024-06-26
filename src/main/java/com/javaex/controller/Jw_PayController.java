
package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.Jw_PayService;
import com.javaex.util.JsonResult;
import com.javaex.vo.OrderInfo_Vo;

@RestController
@RequestMapping("/home/pay")
public class Jw_PayController {

	@Autowired
	private Jw_PayService jw_PayService;


	@PostMapping("/createOrder")
	public JsonResult createOrder(@RequestBody OrderInfo_Vo orderInfo_Vo) {
		System.out.println("Jw_PayController.createOrder");

		System.out.println(orderInfo_Vo);
		
		// 주문 생성 및 주문 번호 반환
		int orderNo = jw_PayService.execreateOrder(orderInfo_Vo);

		System.out.println(orderInfo_Vo);

		return JsonResult.success(orderNo);
	}

//    @PostMapping("/clearCart")
//    public int clearCart(@RequestParam int userNo) {
//        System.out.println("Jw_PayController.clearCart");
//        return jw_PayService.clearCart(userNo);
//    }
}