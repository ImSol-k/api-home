package com.javaex.service;

import java.sql.Date;
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

	// 주문현황가져오기
	public Map<String, Object> list() {

		// 배송진행중 가져오기
		List<StateVo> ing = md.list();

		// 배송완료 가져오기
		List<StateVo> end = md.list2();

		Map<String, Object> stateMap = new HashMap<>();

		stateMap.put("ing", ing);
		stateMap.put("end", end);

		System.out.println(stateMap);

		System.out.println();

		return stateMap;
	}

	// 배송완료
	public void update(int no) {

		md.update(no);
	}

	// 데이터 가져오기
	public Map<String, Integer> datas() {

		// 누적 판매금액 가져오기
		int cprice = md.cPrice();

		// 금일 판매금액
		int tprice = md.tPrice();

		// 누적판매량
		int ccount = md.cCount();

		// 금일판매량
		int tcount = md.tCount();

		// 침대판매수
		int bedcount = md.bedCount();

		// 쇼파판매수
		int shopacount = md.shopaCount();

		// 테이블판매수
		int tablecount = md.tableCount();

		// 옷장판매수
		int hangercount = md.hangerCount();

		// 금일 침대 판매수
		int todaybed = md.todaybed();

		// 금일 쇼파 판매수
		int todayshopa = md.todayshopa();

		// 금일 테이블 판매수
		int todaytable = md.todaytable();

		// 금일 옷장 판매수
		int todayhanger = md.todayhanger();

		// 침대 당월 판매수
		int bedMonthC = md.bedMonthC();

		// 침대 당월 판매금액
		int bedMonthM = md.bedMonthM();

		// 침대 전원 판매수
		int bedMonthC2 = md.bedMonthC2();

		// 침대 전원 판매금액
		int bedMonthM2 = md.bedMonthM2();

		// 침대 전전월 판매수
		int bedMonthC3 = md.bedMonthC3();

		// 침대 전전월 판매금액
		int bedMonthM3 = md.bedMonthM3();
		
		
		// 쇼파 당월 판매수
		int shopaMonthC = md.shopaMonthC();

		// 쇼파 당월 판매금액
		int shopaMonthM = md.shopaMonthM();

		// 쇼파 전원 판매수
		int shopaMonthC2 = md.shopaMonthC2();

		// 쇼파 전원 판매금액
		int shopaMonthM2 = md.shopaMonthM2();

		// 쇼파 전전월 판매수
		int shopaMonthC3 = md.shopaMonthC3();

		// 쇼파 전전월 판매금액
		int shopaMonthM3 = md.shopaMonthM3();
		
		// 테이블 당월 판매수
		int tableMonthC = md.tableMonthC();

		// 테이블 당월 판매금액
		int tableMonthM = md.tableMonthM();

		// 테이블 전원 판매수
		int tableMonthC2 = md.tableMonthC2();

		// 테이블 전원 판매금액
		int tableMonthM2 = md.tableMonthM2();

		// 테이블 전전월 판매수
		int tableMonthC3 = md.tableMonthC3();

		// 테이블 전전월 판매금액
		int tableMonthM3 = md.tableMonthM3();
		
		
		// 옷장 당월 판매수
		int hangerMonthC = md.hangerMonthC();

		// 옷장 당월 판매금액
		int hangerMonthM = md.hangerMonthM();

		// 옷장 전원 판매수
		int hangerMonthC2 = md.hangerMonthC2();

		// 옷장 전원 판매금액
		int hangerMonthM2 = md.hangerMonthM2();

		// 옷장 전전월 판매수
		int hangerMonthC3 = md.hangerMonthC3();

		// 옷장 전전월 판매금액
		int hangerMonthM3 = md.hangerMonthM3();
		
		

		Map<String, Integer> datas = new HashMap<>();

		datas.put("cprice", cprice);
		datas.put("tprice", tprice);
		datas.put("ccount", ccount);
		datas.put("tcount", tcount);
		datas.put("bedcount", bedcount);
		datas.put("shopacount", shopacount);
		datas.put("tablecount", tablecount);
		datas.put("hangercount", hangercount);
		datas.put("todaybed", todaybed);
		datas.put("todayshopa", todayshopa);
		datas.put("todaytable", todaytable);
		datas.put("todayhanger", todayhanger);
		datas.put("bedMonthC", bedMonthC);
		datas.put("bedMonthM", bedMonthM);
		datas.put("bedMonthC2", bedMonthC2);
		datas.put("bedMonthM2", bedMonthM2);
		datas.put("bedMonthC3", bedMonthC3);
		datas.put("bedMonthM3", bedMonthM3);
		datas.put("shopaMonthC", shopaMonthC);
		datas.put("shopaMonthM", shopaMonthM);
		datas.put("shopaMonthC2", shopaMonthC2);
		datas.put("shopaMonthM2", shopaMonthM2);
		datas.put("shopaMonthC3", shopaMonthC3);
		datas.put("shopaMonthM3", shopaMonthM3);
		datas.put("tableMonthC", tableMonthC);
		datas.put("tableMonthM", tableMonthM);
		datas.put("tableMonthC2", tableMonthC2);
		datas.put("tableMonthM2", tableMonthM2);
		datas.put("tableMonthC3", tableMonthC3);
		datas.put("tableMonthM3", tableMonthM3);
		datas.put("hangerMonthC", hangerMonthC);
		datas.put("hangerMonthM", hangerMonthM);
		datas.put("hangerMonthC2", hangerMonthC2);
		datas.put("hangerMonthM2", hangerMonthM2);
		datas.put("hangerMonthC3", hangerMonthC3);
		datas.put("hangerMonthM3", hangerMonthM3);
		

		return datas;
	}
}
