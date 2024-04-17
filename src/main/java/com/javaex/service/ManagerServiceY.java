package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.ManagerDaoY;
import com.javaex.vo.ManagerVoY;

@Service
public class ManagerServiceY {

	@Autowired
	private ManagerDaoY managerDaoY;

	public void exeInsert(ManagerVoY managerVoY) {
		System.out.println("ManagerServiceY.exeInsert()");

		int count = managerDaoY.insert(managerVoY);
	}

//	// 프로필 이미지 저장 경로
//	private static String profileSaveDir = "C:\\javastudy\\homedeco\\profile\\";
//
//	// 추가 파일 저장 경로
//	private static String filesSaveDir = "C:\\javastudy\\homedeco\\file\\";
//
//	// ManagerServiceY 클래스의 exeInsert 메서드 수정
//	public String exeInsert(ManagerVoY managerVoY, MultipartFile[] files, MultipartFile profileFile) {
//		System.out.println("ManagerServiceY.exeInsert()");
//
//		// 프로필 이미지 저장
//		String profileFileName = saveFile(profileFile, profileSaveDir);
//
//		// 프로필 이미지 정보 설정
//		managerVoY.setMain_img(profileFileName);
//
//		// 추가 파일 저장 및 이미지 정보 설정
//		List<ImageVo> imageList = new ArrayList<>();
//		for (MultipartFile file : files) {
//			String savedFileName = saveFile(file, filesSaveDir);
//
//			// 이미지 정보 설정
//			ImageVo imageVo = new ImageVo();
//			imageVo.setProduct_no(managerVoY.getProduct_no()); // product_no 설정
//			imageVo.setSave_name(savedFileName);
//
//			// 이미지 정보 리스트에 추가
//			imageList.add(imageVo);
//		}
//
//		// 이미지 정보 리스트 설정
//		managerVoY.setImageList(imageList);
//
//		// 상품 및 이미지 정보 삽입
//		managerDaoY.insert(managerVoY);
//
//		return profileFileName;
//	}
//
//	private String saveFile(MultipartFile file, String saveDir) {
//		String savedFileName = "";
//		try {
//			// 오리지널 파일명
//			String orgName = file.getOriginalFilename();
//
//			// 확장자
//			String exName = orgName.substring(orgName.lastIndexOf("."));
//
//			// 저장파일명(겹치지 않아야 됨)
//			savedFileName = System.currentTimeMillis() + UUID.randomUUID().toString() + exName;
//
//			// 파일전체경로
//			String filePath = saveDir + "\\" + savedFileName;
//
//			// 파일 저장
//			byte[] fileData = file.getBytes();
//			OutputStream os = new FileOutputStream(filePath);
//			BufferedOutputStream bos = new BufferedOutputStream(os);
//			bos.write(fileData);
//			bos.close();
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return savedFileName;
//	}

}
