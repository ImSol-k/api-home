package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.ManagerVoY;

@Repository
public class ManagerDaoY {
	
	@Autowired
	private SqlSession sqlSession;

	public int insert(ManagerVoY managerVoY) {
		System.out.println("ManagerDaoY.insert()");
		
		int count = sqlSession.insert("", managerVoY);
		
		return count;
	}

}
