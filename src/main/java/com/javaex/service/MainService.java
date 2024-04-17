package com.javaex.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.MainDao;
import com.javaex.vo.MainVo;

@Service
public class MainService {
	
	@Autowired
	private MainDao mainDao;
	
	// 리스트 가져오기 
	public List<MainVo> exeList(int page, String keyword) {
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
		
		List<MainVo> list = mainDao.list(listMap);
		if (!list.isEmpty()) {
			return list;
		} else {
			return null;
		}		
	}
	
	// 카테고리 기본
	public List<MainVo> exeNoCategory() {
		List<MainVo> list = mainDao.listNoCategory();
		if (!list.isEmpty()) {
			return list;
		} else {
			return null;
		}		
	}
	
	public List<MainVo> exeCatogery(String keyword) {
		List<MainVo> list = mainDao.listCategory(keyword);
		if (!list.isEmpty()) {
			return list;
		} else {
			return null;
		}		
	}

	
	
	
}
