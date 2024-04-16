package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.javaex.service.ManagerServiceY;
import com.javaex.util.JsonResult;
import com.javaex.vo.ManagerVoY;

@RestController
public class ManagerControllerY {

	@Autowired
	private ManagerServiceY managerServiceY;

	@PostMapping("/home/manager/insert")
	public JsonResult insert(@RequestParam("files") MultipartFile[] files,
			@RequestParam("profile") MultipartFile profileFile, @ModelAttribute ManagerVoY managerVoY) {
		System.out.println("ManagerControllerY.insert()");

		// 프로필 이미지 처리
		if (!profileFile.isEmpty()) {
			String savedProfileFileName = managerServiceY.exeUpload(profileFile);
			String profileImageUrl = "/uploads/" + savedProfileFileName; // 예시: 프로필 이미지의 URL
			managerVoY.setMain_img(profileImageUrl);
		}

		// 상품 이미지 처리
//	    if (files != null && files.length > 0) {
//	        List<String> savedFileNames = managerServiceY.exeUpload(files);
//	        // 저장된 파일 이름들을 배열로 설정
//	        managerVoY.setSave_name(savedFileNames.toArray(new String[0]));
//	    }

		// 기타 입력값 설정
		// 예: managerVoY.setProduct_name(productName), managerVoY.setPrice(price),
		// managerVoY.setCategory(category) 등

		// 데이터베이스에 저장
		managerServiceY.exeInsert(managerVoY);

		return JsonResult.success("Data inserted successfully.");
	}

}
