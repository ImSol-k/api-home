package com.javaex.service;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.javaex.dao.ManagerDaoY;
import com.javaex.vo.ManagerVoY;

@Service
public class ManagerServiceY {

	@Autowired
	private ManagerDaoY managerDaoY;

	public String exeInsert(ManagerVoY managerVoY) {
		System.out.println("ManagerServiceY.exeInsert()");
		
		

		MultipartFile file = managerVoY.getProfile(); // 프로필 파일 정보 가져오기

		// (1)파일관련 정보 추출///////////////////////////////////////////////////

		// 오리지널 파일명
		String orgName = file.getOriginalFilename();
		System.out.println(orgName);

		// 확장자
		String exName = orgName.substring(orgName.lastIndexOf("."));
		System.out.println(exName);

		// 저장파일명(겹치지 않아야 된다)
		String saveName = System.currentTimeMillis() + UUID.randomUUID().toString() + exName;
		System.out.println(saveName);

		// 파일사이즈
		long fileSize = file.getSize();
		System.out.println(fileSize);
		
		
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

		// 파일전체경로
		
		System.out.println(filePath);

		// Dao만들기 --> DB저장 과제
		managerVoY.setMain_img(saveName);

		managerDaoY.insert(managerVoY);

		// (2)파일을 하드디스크에 저장
		// 파일저장
		try {
			byte[] fileData = file.getBytes();
			OutputStream os = new FileOutputStream(filePath);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			bos.write(fileData);
			bos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return saveName;
	}

	public List<String> exeInsert02(ManagerVoY managerVoY) {
		System.out.println("ManagerServiceY.exeInsert02()");


		List<MultipartFile> files = managerVoY.getContentFiles(); // 프로필 파일 정보 가져오기

		List<String> savedFileNames = new ArrayList<>(); // 저장된 파일 이름을 담을 리스트

		for (MultipartFile file : files) {
			// (1)파일관련 정보 추출///////////////////////////////////////////////////

			// 오리지널 파일명
			String orgName = file.getOriginalFilename();
			System.out.println(orgName);

			// 확장자
			String exName = orgName.substring(orgName.lastIndexOf("."));
			System.out.println(exName);

			// 저장파일명(겹치지 않아야 된다)
			String saveName = System.currentTimeMillis() + UUID.randomUUID().toString() + exName;
			System.out.println(saveName);
			
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
//
//			// 파일사이즈
//			long fileSize = file.getSize();
//			System.out.println(fileSize);
//
//			// 파일전체경로
//			String filePath = saveDir + "\\" + saveName;
//			System.out.println(filePath);

			// Dao만들기 --> DB저장 과제
			savedFileNames.add(saveName);

			// (2)파일을 하드디스크에 저장
			// 파일저장
			try {
				byte[] fileData = file.getBytes();
				OutputStream os = new FileOutputStream(filePath);
				BufferedOutputStream bos = new BufferedOutputStream(os);
				bos.write(fileData);
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		managerVoY.setContentImg(savedFileNames);
		System.out.println(savedFileNames);

		managerDaoY.insert02(managerVoY);

		return savedFileNames; // 저장된 파일 이름들을 반환
	}

	public List<ManagerVoY> exeList(String sortType) {
		System.out.println("ManagerServiceY.exeList()");

		List<ManagerVoY> productList = managerDaoY.selectList(sortType);

		return productList;
	}

	public int exeRemove(int no) {
		System.out.println("ManagerServiceY.exeRemove()");

		int count = managerDaoY.delete(no);
		managerDaoY.delete02(no);

		return count;
	}

	public List<ManagerVoY> exeCateList(String category) {
		System.out.println("ManagerServiceY.exeCateList()");

		List<ManagerVoY> categoryList = managerDaoY.selectCategoryList(category);

		return categoryList;
	}

	public int exeCartCount(int user_no) {
		System.out.println("ManagerServiceY.exeCartCount()");

		int count = managerDaoY.selectCartCount(user_no);

		return count;
	}

}
