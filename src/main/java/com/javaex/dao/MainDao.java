package com.javaex.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class MainDao {

	public void list(Map<String,Object> map) {
		System.out.println("dao");
		System.out.println(map);
	}
}
