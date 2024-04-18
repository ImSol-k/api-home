package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.ManagerServiceY;
import com.javaex.util.JsonResult;
import com.javaex.vo.ManagerVoY;

@RestController
public class ManagerControllerY {

	@Autowired
	private ManagerServiceY managerServiceY;

	// 상품 등록
	@PostMapping("/home/manager/insert")
	public JsonResult insert(@ModelAttribute ManagerVoY managerVoY) {
		System.out.println("ManagerControllerY.insert()");

		System.out.println(managerVoY);

		managerServiceY.exeInsert(managerVoY);
		managerServiceY.exeInsert02(managerVoY);

		return JsonResult.success("성공야호");
	}

	// 리스트 띄우기
	@GetMapping("/home/manager/list")
	public JsonResult list(@RequestParam(name = "sortType") String sortType) {
		System.out.println("ManagerControllerY.list()");

		List<ManagerVoY> productList = managerServiceY.exeList(sortType);

		System.out.println(sortType);
		System.out.println(productList);
		return JsonResult.success(productList);
	}

	// 상품 삭제
	@DeleteMapping(value = "/home/manager/delete/{no}")
	public JsonResult remove(@PathVariable(value = "no") int no) {
		System.out.println("ManagerControllerY.remove()");

		int count = managerServiceY.exeRemove(no);

		return JsonResult.success("야호");
	}

	// 카테고리별 상품리스트
	@PostMapping("/home/manager/categorylist")
	public JsonResult categoryList(@RequestParam String category) {
		System.out.println("ManagerControllerY.categoryList: " + category);

		List<ManagerVoY> categoryList = managerServiceY.exeCateList(category);

		return JsonResult.success(categoryList);
	}

	// 장바구니 갯수 표시하기
	@GetMapping("/home/cartcount")
	public JsonResult cartCount(@RequestParam int user_no) {
		System.out.println("ManagerControllerY.cartCount()");

		System.out.println("유저번호"+user_no);
		int count = managerServiceY.exeCartCount(user_no);

		System.out.println("장바구니"+count);
		return JsonResult.success(count);
	}

}
