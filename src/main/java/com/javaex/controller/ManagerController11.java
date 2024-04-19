package com.javaex.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.ManagerService11;

@RestController
public class ManagerController11 {
	
	@Autowired
	private ManagerService11 ms;
	
	@GetMapping("/home/manager/state")
	public Map<String, Object> list() {
		
		return ms.list();
	}
	
	
	@PostMapping("/home/manager/state")
	public void update(@RequestBody int no) {
		
		System.out.println(no);
		ms.update(no);
	}
	
	@GetMapping("/home/manager/datas")
	public Map<String, Integer> datas() {
		
		return ms.datas();
	}
	
	@PostMapping("/home/payend")
	public Map<String, Object> payend(@RequestBody int no) {
		System.out.println("sss");
		System.out.println(no);
		
		return ms.payend(no);
	}
	
	@PostMapping("/home/manager/state2")
	public void list2(@RequestBody int no) {
		
		System.out.println(no);
		
		ms.list2(no);
		//ms.update(no);
	}
}
