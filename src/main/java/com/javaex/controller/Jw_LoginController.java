// Jw_LoginController.java
package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.Jw_LoginService;
import com.javaex.util.JsonResult;
import com.javaex.util.JwtUtil;
import com.javaex.vo.Jw_Vo;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class Jw_LoginController {

    @Autowired
    private Jw_LoginService jw_LoginService;

    @PostMapping("/home/login")
    public JsonResult login(@RequestBody Jw_Vo jw_Vo, HttpServletResponse response) {
        Jw_Vo user = jw_LoginService.exelogin(jw_Vo.getId(), jw_Vo.getPassword());

        if (user != null) {
            JwtUtil.createTokenAndSetHeader(response, String.valueOf(user.getUserNo()));
            return JsonResult.success(user);
        } else {
            return JsonResult.fail("로그인 실패");
        }
    }
}
