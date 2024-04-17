package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.ManagerService11;

@RestController
public class ManagerController11 {
	
	@Autowired
	private ManagerService11 ms;
	
	@GetMapping("/home/manager/state")
	public void list() {
		
		ms.list();
	}
	
	@GetMapping("/home/manager/datas")
	public void datas() {
		System.out.println("데이터 뽑아오기");
		
		ms.datas();
	}
}
