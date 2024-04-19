package com.javaex.service;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.javaex.dao.SolInfoDao;
import com.javaex.vo.ImageVo;
import com.javaex.vo.SolCartVo;
import com.javaex.vo.SolProductVo;
import com.javaex.vo.SolReviewVo;

@Service
public class SolInfoService {

	@Autowired
	private SolInfoDao infoDao;

	// 장바구니 추가
	public int exeCartAdd(List<SolCartVo> cartList) {
		System.out.println("SolInfoService.exeCartAdd()");
		System.out.println(cartList.size());
		for (int i = 0; i < cartList.size(); i++) {
			infoDao.cartInsert(cartList.get(i));
		}
		return 0;
	}

	// 상품정보 불러오기
	public SolProductVo exeGetInfo(int no) {
		System.out.println("SolInfoService.exeCartAdd()");
		SolProductVo productVo = infoDao.selcetProduct(no);
		List<ImageVo> imgList = infoDao.selectImg(no);
		productVo.setImgList(imgList);
		return productVo;
	}

	public List<String> exeColor() {
		System.out.println("SolInfoService.exeCartAdd()");
		List<String> colorList = infoDao.selectColor();
		return colorList;
	}

	// 리뷰
	public List<SolReviewVo> exeGetReview(int no) {
		System.out.println("SolInfoService.exeGetReview()");
		List<SolReviewVo> reviewList = infoDao.selectReview(no);
		return reviewList;
	}

	// 구입확인
	public boolean exeIsPurchase(int num, int proNo) {
		System.out.println("SolInfoService.exeIsPurchase");
		List<Integer> userList = infoDao.isPurchase(proNo);
		
		for (int i = 0; i < userList.size(); i++) {
			if(num == userList.get(i)) {
				return true;
			} 
		}
		return false;
	}

	// 리뷰작성
	public SolReviewVo exeSetReview(MultipartFile file, SolReviewVo reviewVo) {
		System.out.println("SolInfoService.exeSetReview()");

		// 파일 정보수집
		String orgName = file.getOriginalFilename();
		String exeName = orgName.substring(orgName.lastIndexOf("."));
		String saveName = System.currentTimeMillis() + UUID.randomUUID().toString() + exeName;
//		System.out.println("saveName: " + saveName);
		
		String saveDir;
		String filePath;
		String osName = System.getProperty("os.name").toLowerCase();
		if (osName.contains("linux")) {
			System.out.println("리눅스");
			// 파일저장디렉토리
			saveDir = "/app/upload/"; // Linux 경로. username을 실제 사용자 이름으로 변경하세요.
			filePath = saveDir + "/" + saveName;

		} else {
			System.out.println("윈도우");
			// 파일저장디렉토리
			saveDir = ".\\uploadImages\\";
			filePath = saveDir + "\\" + saveName;
		}
		reviewVo.setImgName(saveName);
		System.out.println(reviewVo);
		int count = infoDao.insertReview(reviewVo);
		reviewVo.setReviewNo(count);
		try {
			byte[] fileData = file.getBytes();
			OutputStream os = new FileOutputStream(filePath);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			bos.write(fileData);
			bos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return reviewVo;
	}

	// 리뷰삭제
	public int exeDeleteReview(int no) {
		System.out.println("SolInfoService.exeDeleteReview()");
		infoDao.delelteReview(no);
		return 0;
	}

	// 카트리스트
	public List<SolCartVo> exeCartList(int userNo) {
		System.out.println("SolInfoService.exeCartList");
		List<SolCartVo> cartList = infoDao.selectCart(userNo);
		return cartList;
	}

	// 카트 업데이트
	public int exeCartUpdate(SolCartVo cartVo) {
		System.out.println("SolInfoService.exeCartUpdate");
		int count = infoDao.updateCart(cartVo);
		return count;
	}

	// 카트삭제
	public int exeCartDelete(Map<String, Object> delMap) {
		System.out.println("SolInfoService.exeCartDelete()");
		infoDao.deleteCart(delMap);
		return 0;
	}

	// 결제완료 장바구니 삭제
	public int exePayendDelete(List<SolCartVo> deleteList) {
		System.out.println("SolInfoService.exePayendDelete()");
		for (int i = 0; i < deleteList.size(); i++) {
			infoDao.payendDeleteCart(deleteList.get(i));
		}
		return 0;
	}

}
