package com.javaex.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.util.JsonResult;

@RestController
@RequestMapping("home/cart")
public class CartController {
	
	@PostMapping("add")
	public JsonResult addCart() {
		System.out.println("CartController.addCart");
		return null;
	}

}
