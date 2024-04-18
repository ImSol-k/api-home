package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PayendVo1;
import com.javaex.vo.PayendVo2;
import com.javaex.vo.StateVo;

@Repository
public class ManagerDoa11 {

	@Autowired
	private SqlSession sqlSession;

	// 배송중 가져오기
	public List<StateVo> list() {

		List<StateVo> state = sqlSession.selectList("manager11.stateList");

		System.out.println(state.toString());

		return state;
	}

	// 배송완료 가져오기
	public List<StateVo> list2() {
		System.out.println("리스트 가져오기");

		List<StateVo> state = sqlSession.selectList("manager11.stateList2");

		System.out.println(state.toString());

		return state;
	}

	// 배송완료바꾸기
	public void update(int no) {

		int count = sqlSession.update("manager11.update", no);
		System.out.println(count);
	}

	// 누적판매금액
	public int cPrice() {

		int cprice = sqlSession.selectOne("manager11.cprice");

		System.out.println(cprice);
		return cprice;
	}

	// 금일판매금액
	public int tPrice() {

		int tprice = sqlSession.selectOne("manager11.tprice");

		System.out.println(tprice);
		return tprice;
	}

	// 누적판매수량
	public int cCount() {

		int ccount = sqlSession.selectOne("manager11.ccount");

		System.out.println(ccount);
		return ccount;
	}

	// 금일판매수량
	public int tCount() {

		int tcount = sqlSession.selectOne("manager11.tcount");

		System.out.println(tcount);
		return tcount;
	}

	// 침대판매수량
	public int bedCount() {

		int bedcount = sqlSession.selectOne("manager11.bedcount");

		System.out.println(bedcount);
		return bedcount;
	}

	// 쇼파판매수량
	public int shopaCount() {

		int shopacount = sqlSession.selectOne("manager11.shopacount");

		System.out.println(shopacount);
		return shopacount;
	}

	// 테이블판매수량
	public int tableCount() {

		int tablecount = sqlSession.selectOne("manager11.tablecount");

		System.out.println(tablecount);
		return tablecount;
	}

	// 옷장판매수량
	public int hangerCount() {

		int hangercount = sqlSession.selectOne("manager11.hangercount");

		System.out.println(hangercount);
		return hangercount;
	}

	// 금일 침대판매량
	public int todaybed() {

		return sqlSession.selectOne("manager11.todaybed");
	}

	// 금일 쇼파판매량
	public int todayshopa() {

		return sqlSession.selectOne("manager11.todayshopa");
	}

	// 금일 테이블판매량
	public int todaytable() {

		return sqlSession.selectOne("manager11.todaytable");
	}

	// 금일 옷장판매량
	public int todayhanger() {

		return sqlSession.selectOne("manager11.todayhanger");
	}

	////////
	// 침대 당월 판매수
	public int bedMonthC() {

		return sqlSession.selectOne("manager11.bedMonthC");
	}

	// 침대 당월 판매금액
	public int bedMonthM() {

		return sqlSession.selectOne("manager11.bedMonthM");
	}

	// 침대 전원 판매수
	public int bedMonthC2() {

		return sqlSession.selectOne("manager11.bedMonthC2");
	}

	// 침대 전월 판매금액
	public int bedMonthM2() {

		return sqlSession.selectOne("manager11.bedMonthM2");
	}

	// 침대 전전월 판매수
	public int bedMonthC3() {

		return sqlSession.selectOne("manager11.bedMonthC3");
	}

	// 침대 전전월 판매금액
	public int bedMonthM3() {

		return sqlSession.selectOne("manager11.bedMonthM3");
	}

	// 쇼파 당월 판매수
	public int shopaMonthC() {

		return sqlSession.selectOne("manager11.shopaMonthC");
	}

	// 쇼파 당월 판매금액
	public int shopaMonthM() {

		return sqlSession.selectOne("manager11.shopaMonthM");
	}

	// 쇼파 전원 판매수
	public int shopaMonthC2() {

		return sqlSession.selectOne("manager11.shopaMonthC2");
	}

	// 쇼파 전원 판매금액
	public int shopaMonthM2() {

		return sqlSession.selectOne("manager11.shopaMonthM2");
	}

	// 쇼파 전전월 판매수
	public int shopaMonthC3() {

		return sqlSession.selectOne("manager11.shopaMonthC3");
	}

	// 쇼파 전전월 판매금액
	public int shopaMonthM3() {

		return sqlSession.selectOne("manager11.shopaMonthM3");
	}

	// 테이블 당월 판매수
	public int tableMonthC() {

		return sqlSession.selectOne("manager11.tableMonthC");
	}

	// 테이블 당월 판매금액
	public int tableMonthM() {

		return sqlSession.selectOne("manager11.tableMonthM");
	}

	// 테이블 전원 판매수
	public int tableMonthC2() {

		return sqlSession.selectOne("manager11.tableMonthC2");
	}

	// 테이블 전원 판매금액
	public int tableMonthM2() {

		return sqlSession.selectOne("manager11.tableMonthM2");
	}

	// 테이블 전전월 판매수
	public int tableMonthC3() {

		return sqlSession.selectOne("manager11.tableMonthC3");
	}

	// 테이블 전전월 판매금액
	public int tableMonthM3() {

		return sqlSession.selectOne("manager11.tableMonthM3");
	}

	// 옷장 당월 판매수
	public int hangerMonthC() {

		return sqlSession.selectOne("manager11.hangerMonthC");
	}

	// 옷장 당월 판매금액
	public int hangerMonthM() {

		return sqlSession.selectOne("manager11.hangerMonthM");
	}

	// 옷장 전원 판매수
	public int hangerMonthC2() {

		return sqlSession.selectOne("manager11.hangerMonthC2");
	}

	// 옷장 전원 판매금액
	public int hangerMonthM2() {

		return sqlSession.selectOne("manager11.hangerMonthM2");
	}

	// 옷장 전전월 판매수
	public int hangerMonthC3() {

		return sqlSession.selectOne("manager11.hangerMonthC3");
	}

	// 옷장 전전월 판매금액
	public int hangerMonthM3() {

		return sqlSession.selectOne("manager11.hangerMonthM3");
	}

	public PayendVo1 payend1(int no) {

		return sqlSession.selectOne("manager11.payend1", no);
	}

	public List<PayendVo2> payend2(int no) {

		return sqlSession.selectList("manager11.payend2", no);
	}
}
