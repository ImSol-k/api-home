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

      managerServiceY.exeInsert(managerVoY);

      return JsonResult.success("Data inserted successfully.");
   }

}
