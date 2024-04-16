package com.javaex.service;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
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

	public void exeInsert(ManagerVoY managerVoY) {
		System.out.println("ManagerServiceY.exeInsert()");

		int count = managerDaoY.insert(managerVoY);
	}
	
	public String exeUpload(MultipartFile file) {
		System.out.println("FoodStoreService.exeUpload()");

		// 파일저장디렉토리
		String saveDir = "c:\\javaStudy\\upload";

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

		// 파일전체경로
		String filePath = saveDir + "\\" + saveName;
		System.out.println(filePath);

		// vo로묶기
		ManagerVoY managerVoY = new ManagerVoY();
		managerVoY.setMain_img(saveName);


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

}
