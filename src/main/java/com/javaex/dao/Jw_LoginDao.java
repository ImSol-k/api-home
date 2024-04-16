// Jw_LoginDao.java
package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.javaex.vo.Jw_Vo;

@Repository
public class Jw_LoginDao {

    @Autowired
    private SqlSession sqlSession;

    public Jw_Vo Jw_Loginlogin(String id, String password) {
        return sqlSession.selectOne("home.login", new Jw_Vo(id, password));
    }
}
