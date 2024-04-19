package com.javaex.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.ImageVo;
import com.javaex.vo.SolCartVo;
import com.javaex.vo.SolProductVo;
import com.javaex.vo.SolReviewVo;

@Repository
public class SolInfoDao {

	@Autowired
	private SqlSession sqlSession;

	// 장바구니 추가
	public int cartInsert(SolCartVo cartVo) {
		System.out.println("SolInfoDao.cartInsert()");
		sqlSession.insert("solinfo.insertCart", cartVo);
		return 0;
	}

	// 상품정보 불러오기
	public SolProductVo selcetProduct(int no) {
		System.out.println("SolInfoDao.selcetProduct()");
		SolProductVo productVo = sqlSession.selectOne("solinfo.selectProduct", no);
//		System.out.println(productVo);
		return productVo;
	}

	// 상품리뷰
	public List<SolReviewVo> selectReview(int no) {
		System.out.println("SolInfoDao.selectReview()");
		List<SolReviewVo> reviewList = sqlSession.selectList("solinfo.selectReview", no);
		return reviewList;
	}

	// 이미지
	public List<ImageVo> selectImg(int no) {
		System.out.println("SolInfoDao.selectImg()");
		List<ImageVo> imgList = sqlSession.selectList("solinfo.selectProductImg", no);
//		System.out.println("(" + imgList.size() + ")" + imgList);
		return imgList;
	}

	public List<String> selectColor() {
		System.out.println("SolInfoDao.selectColor()");
		List<String> colorList = sqlSession.selectList("solinfo.selectColor");
		return colorList;
	}

	// 구입확인
	public List<Integer> isPurchase(int proNo) {
		System.out.println("SolInfoService.exeIsPurchase");
		List<Integer> userList = sqlSession.selectList("solinfo.isPurchase", proNo);
		return userList;
	}

	// 리뷰작성
	public int insertReview(SolReviewVo reviewVo) {
		System.out.println("SolInfoDao.insertReview()");
		int count = sqlSession.insert("solinfo.reviewInsert", reviewVo);
		return count;
	}

	// 리뷰삭제
	public int delelteReview(int no) {
		System.out.println("SolInfoDao.delelteReview()");
		sqlSession.delete("solinfo.reviewDelete", no);
		return 0;
	}

	// 카트리스트
	public List<SolCartVo> selectCart(int userNo) {
		System.out.println("SolInfoDao.selectCart()");
		List<SolCartVo> cartList = sqlSession.selectList("solinfo.userCartSelect", userNo);
		System.out.println(cartList);
		return cartList;
	}

	// 카트 업데이트
	public int updateCart(SolCartVo cartVo) {
		System.out.println("SolInfoDao.updateCart");
		int count = sqlSession.update("solinfo.cartUpdate", cartVo);
		return count;
	}

	// 카트 삭제
	public int deleteCart(Map<String, Object> delMap) {
		System.out.println("SolInfoDao.deleteCart");
		sqlSession.delete("solinfo.cartDelete", delMap);
		return 0;
	}

	// 결제완료시 장바구니 삭제
	public int payendDeleteCart(SolCartVo cartVo) {
		System.out.println("SolInfoDao.payendDeleteCart");
		sqlSession.delete("solinfo.payendCartDelete", cartVo);
		return 0;
	}
}
