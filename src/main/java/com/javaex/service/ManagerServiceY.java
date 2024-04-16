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

	public void exeInsert(ManagerVoY managerVoY) {
		System.out.println("ManagerServiceY.exeInsert()");

		int count = managerDaoY.insert(managerVoY);
	}

	 // 프로필 이미지 저장 경로
    private static String profile_save_dir = "C:\\javastudy\\homedeco\\profile\\";

    // 추가 파일 저장 경로
    private static String files_save_dir = "C:\\javastudy\\homedeco\\file\\";

    public String exeInsert(ManagerVoY managerVoY, MultipartFile[] files, MultipartFile profileFile) {
        System.out.println("ManagerServiceY.exeInsert()");

        // 프로필 이미지 저장
        String profileFileName = saveFile(profileFile, profile_save_dir);

        // 추가 파일 저장
        List<String> savedFileNames = new ArrayList<>();
        for (MultipartFile file : files) {
            String savedFileName = saveFile(file, files_save_dir);
            savedFileNames.add(savedFileName);
        }

        managerDaoY.insert(managerVoY);

        return profileFileName;
    }

    private String saveFile(MultipartFile file, String saveDir) {
        String savedFileName = "";
        try {
            // 오리지널 파일명
            String orgName = file.getOriginalFilename();

            // 확장자
            String exName = orgName.substring(orgName.lastIndexOf("."));

            // 저장파일명(겹치지 않아야 됨)
            savedFileName = System.currentTimeMillis() + UUID.randomUUID().toString() + exName;

            // 파일전체경로
            String filePath = saveDir + "\\" + savedFileName;

            // 파일 저장
            byte[] fileData = file.getBytes();
            OutputStream os = new FileOutputStream(filePath);
            BufferedOutputStream bos = new BufferedOutputStream(os);
            bos.write(fileData);
            bos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return savedFileName;
    }

    
    
    
}
