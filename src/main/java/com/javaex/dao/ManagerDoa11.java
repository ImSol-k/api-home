package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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

	//배송완료바꾸기
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
}
