package com.javaex.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.MainService;

@RestController
public class MainController {

	@Autowired
	private MainService mainService;
	
	
	@PostMapping("/home/main")
	public void main(@RequestBody Map<String,Object> map) {
//		System.out.println("con>main");
//		System.out.println(map);
		mainService.exeList(map);
	}

}
