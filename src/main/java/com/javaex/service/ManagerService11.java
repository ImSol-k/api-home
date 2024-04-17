package com.javaex.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.ManagerDoa11;
import com.javaex.vo.StateVo;

@Service
public class ManagerService11 {
	
	@Autowired
	private ManagerDoa11 md;
	
	
	//주문현황가져오기
	public void list() {
		
		//배송진행중 가져오기
		List<StateVo> ing = md.list();
		
		//배송완료 가져오기
		List<StateVo> end = md.list2();
		
		Map<String, Object> stateMap = new HashMap<>();
		
		stateMap.put("ing", ing);
		stateMap.put("end", end);
		
		System.out.println(stateMap);
	}
	
	public void datas() {
		
		md.cPrice();
	}
}
