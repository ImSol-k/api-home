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
	public Map<String, Object> list() {
		
		//배송진행중 가져오기
		List<StateVo> ing = md.list();
		
		//배송완료 가져오기
		List<StateVo> end = md.list2();
		
		Map<String, Object> stateMap = new HashMap<>();
		
		stateMap.put("ing", ing);
		stateMap.put("end", end);
		
		System.out.println(stateMap);
		
		return stateMap;
	}
	
	public Map<String, Integer> datas() {
		
		//누적 판매금액 가져오기
		int cprice = md.cPrice();
		
		//금일 판매금액
		int tprice = md.tPrice();
		
		//누적판매량
		int ccount = md.cCount();
		
		//금일판매량
		int tcount = md.tCount();
		
		//침대판매수
		int bedcount = md.bedCount();
		
		//쇼파판매수
		int shopacount = md.shopaCount();
		
		//테이블판매수
		int tablecount = md.tableCount();
		
		//옷장판매수
		int hangercount = md.hangerCount();
		
		Map<String, Integer> datas = new HashMap<>();
		
		datas.put("cprice", cprice);
		datas.put("tprice", tprice);
		datas.put("ccount", ccount);
		datas.put("tcount", tcount);
		datas.put("bedcount", bedcount);
		datas.put("shopacount", shopacount);
		datas.put("tablecount", tablecount);
		datas.put("hangercount", hangercount);
		
		return datas;
	}
}
