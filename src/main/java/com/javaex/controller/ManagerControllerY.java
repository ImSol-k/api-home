package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
		// System.out.println(managerVoY.getContentFiles().size());

		managerServiceY.exeInsert(managerVoY);
		managerServiceY.exeInsert02(managerVoY);

		return JsonResult.success("성공야호");
	}

	// 리스트 띄우기
	@GetMapping("/home/manager/list")
	public JsonResult list() {
		System.out.println("ManagerControllerY.list()");

		List<ManagerVoY> productList = managerServiceY.exeList();

		return JsonResult.success(productList);
	}

	// 상품 삭제
	@DeleteMapping(value = "/home/manager/delete/{no}")
	public JsonResult remove(@PathVariable(value = "no") int no) {
		System.out.println("GuestbookController.remove()");

		int count = managerServiceY.exeRemove(no);

		return JsonResult.success("야호");
	}
	
}
