package com.javaex.service;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
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
	public SolReviewVo exeSetReview(MultipartFile file, SolReviewVo reviewVo) {
		System.out.println("SolInfoService.exeSetReview()");

		String saveDir = ".\\uploadImages\\";

		// 파일 정보수집
		String orgName = file.getOriginalFilename();
		String exeName = orgName.substring(orgName.lastIndexOf("."));
		String saveName = System.currentTimeMillis() + UUID.randomUUID().toString() + exeName;
//		System.out.println("saveName: " + saveName);
		String filePath = saveDir + "\\" + saveName;
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

	// 카트리스트
	public List<SolCartVo> exeCartList(int userNo) {
		System.out.println("SolInfoService.exeCartList");
		List<SolCartVo> cartList = infoDao.selectCart(userNo);
		return cartList;
	}

}
