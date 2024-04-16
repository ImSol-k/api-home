package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.orm.jpa.EntityManagerFactoryDependsOnPostProcessor;
import org.springframework.stereotype.Service;

import com.javaex.dao.ManagerDaoY;
import com.javaex.vo.ManagerVoY;

@Service
public class ManagerServiceY {

	@Autowired
	private ManagerDaoY managerDaoY;
	
	public void exeInsert(ManagerVoY managerVoY) {
		System.out.println("ManagerServiceY.exeInsert()");
		
		int count=managerDaoY.insert(managerVoY);
		
	}

}
