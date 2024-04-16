package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@PostMapping("/api/manager/insert")
	public JsonResult insert(@RequestBody ManagerVoY managerVoY) {
		System.out.println("ManagerControllerY.insert()");
		
		managerServiceY.exeInsert(managerVoY);
		
		return JsonResult.success(managerServiceY);
	}
}
