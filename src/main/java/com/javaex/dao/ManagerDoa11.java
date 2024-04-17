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

	public List<StateVo> list() {

		List<StateVo> state = sqlSession.selectList("manager11.stateList");

		System.out.println(state.toString());

		return state;
	}

	public List<StateVo> list2() {
		System.out.println("리스트 가져오기");

		List<StateVo> state = sqlSession.selectList("manager11.stateList2");

		System.out.println(state.toString());

		return state;
	}
	
	public void cPrice() {
		
		sqlSession.selectOne("manager11.cprice");
	}
}
