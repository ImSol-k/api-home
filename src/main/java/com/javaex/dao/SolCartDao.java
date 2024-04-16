package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.SolCartVo;

@Repository
public class SolCartDao {

	@Autowired
	private SqlSession sqlSession;
	
	public int cartInsert(SolCartVo cartVo) {
		System.out.println("SolCartDao.cartInsert()");
		sqlSession.insert("solcart.insert", cartVo);
		return 0;
	}
}
