package com.javaex.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.MainDao;

@Service
public class MainService {
	
	@Autowired
	private MainDao mainDao;
	
	// 리스트 가져오기 
	public void exeList(int page, String keyword) {
//		System.out.println("exeList");
//		System.out.println(page);
//		System.out.println(keyword);
		
		// 받아온 페이지가 0보다 크면  그대로 , 아니면 1로 설정
		page = (page>0) ? page : (page = 1);
		
		// 한번에 불러올 상품갯수
		int listCount = 8;
		
		// 시작번호
		int startRowNo = (page-1)*listCount;
		
		Map<String, Object> listMap = new HashMap<String, Object>();
		listMap.put("startRowNo", startRowNo);
		listMap.put("listCount", listCount);
		listMap.put("keyword", keyword);
		
		mainDao.list(listMap);
		
		// 전체 
		int totalCount = mainDao.selectTotalCount(keyword);
		
	}
}
