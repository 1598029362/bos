package com.ssm.controller;

import com.ssm.model.AccBusinessadmissibility;
import com.ssm.service.AccBusinessadmissibilityService11;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccBusinessadmissibilityController11 {
    @Autowired
    private AccBusinessadmissibilityService11 service;
   @RequestMapping("selectByIdAccBusinessadmissibility")
    public  AccBusinessadmissibility selectByIdAccBusinessadmissibility(AccBusinessadmissibility businessadmissibility)
   {

       return service.selectByPrimaryKey(businessadmissibility.getId());
   }

}
