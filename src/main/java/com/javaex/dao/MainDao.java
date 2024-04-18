package com.javaex.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.MainVo;

@Repository
public class MainDao {

	@Autowired
	private SqlSession sqlSession;
	
	// 리스트 가져오기
	public List<MainVo> list(Map<String,Object> listMap) {
		List<MainVo> list = sqlSession.selectList("ssmain.list",listMap);
		return list;
	}
	
	
	public List<MainVo> listCategory(String keyword) {
		List<MainVo> list = sqlSession.selectList("ssmain.listCategory",keyword);
		return list;
	}
	
	public List<MainVo> getHitList() {
		return sqlSession.selectList("ssmain.hitlist");
	}


}
