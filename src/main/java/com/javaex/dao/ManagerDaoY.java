package com.javaex.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

		int count = sqlSession.insert("managerY.insert", managerVoY);

		return count;
	}

	public void insert02(ManagerVoY managerVoY) {
		System.out.println("ManagerDaoY.insert02()");

		int productNo = managerVoY.getProduct_no();

		for (String saveName : managerVoY.getContentImg()) {
			Map<String, Object> paramMap = new HashMap<>();
			paramMap.put("product_no", productNo);
			paramMap.put("saveName", saveName);
			sqlSession.insert("managerY.insertImg", paramMap);
		}
	}

	public List<ManagerVoY> selectList(String sortType) {
		System.out.println("ManagerDaoY.SelectList()");
		
		 String sql = "";
		    
		    if ("recent".equals(sortType)) {
		    	sql = "managerY.selectNew";
		    } else if ("review".equals(sortType)) {
		    	sql = "managerY.selectReview";
		    } else if ("rating".equals(sortType)) {
		    	sql = "managerY.selectStar";
		    } else {
		    	sql = "managerY.selectNew";
		    }
		    
		    List<ManagerVoY> productList = sqlSession.selectList(sql);

		return productList;
	}
	
	public List<ManagerVoY> selectCategoryList(String category){
		System.out.println("ManagerDaoY.selectCategoryList");
		
		List<ManagerVoY> categoryList = sqlSession.selectList("managerY.categoryList", category);
		
		return categoryList;
	}

	public int delete(int no) {
		System.out.println("ManagerDaoY.delete()");
		
		int count = sqlSession.delete("managerY.deleteImg", no);
		
		return count;
	}

	public void delete02(int no) {
		System.out.println("ManagerDaoY.delete02()");
		sqlSession.delete("managerY.delete", no);
	}
	

	
	
}
