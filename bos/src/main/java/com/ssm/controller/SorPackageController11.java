package com.ssm.controller;

import com.ssm.model.SorPackage;
import com.ssm.service.SorPackageService11;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SorPackageController11 {
   @Autowired
    private SorPackageService11 service;

   @RequestMapping("finAllSorPackage")
    public List<SorPackage> finAllSorPackage()
   {
       return service.finAllSorPackage();
   }
}
