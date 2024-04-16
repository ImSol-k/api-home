// Jw_LoginService.java
package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.Jw_LoginDao;
import com.javaex.vo.Jw_Vo;

@Service
public class Jw_LoginService {

    @Autowired
    private Jw_LoginDao jw_LoginDao;

    public Jw_Vo exelogin(String id, String password) {
    	System.out.println("Jw_LoginService");
    	
        return jw_LoginDao.Jw_Loginlogin(id, password);
    }
}
