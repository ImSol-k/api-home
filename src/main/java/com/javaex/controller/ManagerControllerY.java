package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.javaex.service.ManagerServiceY;
import com.javaex.util.JsonResult;
import com.javaex.vo.ManagerVoY;

@RestController
public class ManagerControllerY {

	@Autowired
	private ManagerServiceY managerServiceY;

	@PostMapping("/home/manager/insert")
	public JsonResult insert(@ModelAttribute ManagerVoY managerVoY) {
		System.out.println("ManagerControllerY.insert()");
		/*
		 * System.out.println(managerVoY.getProfile().getOriginalFilename());
		 */
		System.out.println(managerVoY);
		
		
		return JsonResult.success("");
	}

	/*
	 * @PostMapping("/home/manager/insert") public JsonResult
	 * insert(@RequestParam("profile") MultipartFile profileFile, @ModelAttribute
	 * ManagerVoY managerVoY,
	 * 
	 * @RequestParam("files") MultipartFile[] files) {
	 * System.out.println("ManagerControllerY.insert()"); System.out.println(files);
	 * System.out.println(profileFile); System.out.println(managerVoY);
	 * managerServiceY.exeInsert(managerVoY, files, profileFile);
	 * 
	 * return JsonResult.success(""); }
	 * 
	 */
//	@PostMapping("/home/manager/insert")
//	public JsonResult insert(@RequestBody MultipartFile formData) {
//		System.out.println("ManagerControllerY.insert()");
//
//		System.out.println(formData);
//		//managerServiceY.exeInsert(managerVoY, files, profileFile);
//
//		return JsonResult.success("");
//	}

}
