package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.SolCartDao;
import com.javaex.vo.SolCartVo;

@Service
public class SolCartService {

	@Autowired
	private SolCartDao cartDao;

	public int exeCartAdd(List<SolCartVo> cartList) {
		System.out.println("SolCartService.exeCartAdd()");
		System.out.println(cartList.size());
		for(int i = 0; i < cartList.size(); i++) {
			cartDao.cartInsert(cartList.get(i));
		}
		return 0;
	}

}
