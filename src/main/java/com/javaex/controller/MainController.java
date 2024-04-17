package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.MainService;
import com.javaex.util.JsonResult;
import com.javaex.vo.MainVo;

@RestController
public class MainController {

	@Autowired
	private MainService mainService;
	
	// 리스트 가져오기 - 검색 페이징 포함
	@GetMapping("/home/main")
	public JsonResult main(@RequestParam(value="page",required = false,defaultValue="1") int page , 
			@RequestParam(value="keyword",required=false,defaultValue="") String keyword) {
		List<MainVo> list = mainService.exeList(page,keyword);
		if(list != null) {
			return JsonResult.success(list);
		} else {
			return JsonResult.fail("더 이상 불러올 데이터가 없습니다.");
		}
	}
	
	@GetMapping("/home/main/nocategory")
	public JsonResult noCategory() {
		List<MainVo> list = mainService.exeNoCategory();
		if(list != null) {
			return JsonResult.success(list);
		} else {
			return JsonResult.fail("실패");
		}
	}
	
	@GetMapping("/home/main/category")
	public JsonResult category(@RequestParam(value="keyword") String keyword) {
		List<MainVo> list = mainService.exeCatogery(keyword);
		System.out.println(list);
		if(list != null) {
			return JsonResult.success(list);
		} else {
			return JsonResult.fail("리스트를 불러올수 없습니다");
		}
	}
	@GetMapping("home/main/sorttype")
	public void sortType(@RequestParam(value="keyword") String keyword)
			  {
		System.out.println("sort");
		System.out.println(keyword);
//		System.out.println(sortType);
	}
	

}
