package com.javaex.service;

import java.util.List;
import java.util.UUID;

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

	// 리뷰
	public List<SolReviewVo> exeGetReview(int no) {
		System.out.println("SolInfoService.exeGetReview()");
		List<SolReviewVo> reviewList = infoDao.selectReview(no);
		return reviewList;
	}

	// 리뷰작성
	public int exeSetReview(MultipartFile file, SolReviewVo reviewVo) {
		System.out.println("SolInfoService.exeSetReview()");

		// 운영 체제 이름 확인
		String osName = System.getProperty("os.name").toLowerCase();
		String saveDir;
		// 운영 체제에 따라 다른 경로 설정
		if (osName.contains("linux")) {
			System.out.println("리눅스");
			// 파일저장디렉토리
			saveDir = "/app/upload/"; // Linux 경로. username을 실제 사용자 이름으로 변경하세요.
		} else {
			System.out.println("윈도우");
			// 파일저장디렉토리
			saveDir = ".\\uploadImages\\";
		}

		// 파일 정보수집
		String orgName = file.getOriginalFilename();
		String exeName = orgName.substring(orgName.lastIndexOf("."));
		String saveName = System.currentTimeMillis() + UUID.randomUUID().toString() + exeName;
		System.out.println("saveName: " + saveName);
		reviewVo.setImgName(saveName);
		infoDao.insertReview(reviewVo);

		return 0;
	}

}
