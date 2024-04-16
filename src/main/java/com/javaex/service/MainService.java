package com.javaex.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.MainDao;

@Service
public class MainService {
	
	@Autowired
	private MainDao mainDao;
	
	public void exeList(Map<String,Object> map) {
//		System.out.println("exeList");
//		System.out.println(map);
		mainDao.list(map);
	}
}
