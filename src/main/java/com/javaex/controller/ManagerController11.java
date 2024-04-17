package com.javaex.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/home/manager/datas")
	public Map<String, Integer> datas() {
		
		return ms.datas();
	}
}
