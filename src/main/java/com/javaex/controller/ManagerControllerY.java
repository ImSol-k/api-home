package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.ManagerServiceY;
import com.javaex.util.JsonResult;
import com.javaex.vo.ManagerVoY;

@RestController
public class ManagerControllerY {

	@Autowired
	private ManagerServiceY managerServiceY;

	@PostMapping("/home/manager/insert")
	public JsonResult insert(@ModelAttribute ManagerVoY managerVoY ) {
		System.out.println("ManagerControllerY.insert()");

		System.out.println(managerVoY);
//		System.out.println(managerVoY.getContentFiles().size());
		
		managerServiceY.exeInsert(managerVoY);
		managerServiceY.exeInsert02(managerVoY);

		return JsonResult.success("성공야호");
	}


}
