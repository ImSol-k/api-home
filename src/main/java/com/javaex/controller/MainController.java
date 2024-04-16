package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.MainService;

@RestController
public class MainController {

	@Autowired
	private MainService mainService;
	
	// 리스트 가져오기 - 검색 페이징 포함
	@GetMapping("/home/main")
	public void main(@RequestParam(value="page",required = false,defaultValue="1") int page , 
			@RequestParam(value="keyword",required=false,defaultValue="") String keyword) {
//		System.out.println("con>main");
		mainService.exeList(page,keyword);
	}

}
