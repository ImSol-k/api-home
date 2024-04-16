package com.javaex.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MainDao {

	@Autowired
	private SqlSession sqlSession;
	
	// 리스트 가져오기
	public void list(Map<String,Object> listMap) {
		System.out.println("dao");
		System.out.println(listMap);
		
//		가져와야할거
//		
//		상품 번호
//		상품 메인이미지
//		상품 카테고리
//		상품 이름
//		상품 별점
//		상품 가격
//		상품 번호 - 상품 별점 
	}
	
	// 전체 글 갯수 알아오기
	public int selectTotalCount(String keyword) {
		System.out.println("dao>selectTotalCount");
		return 0;
	}
}
