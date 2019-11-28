package com.ssm.controller;

import com.ssm.model.BasZoneinfo;
import com.ssm.model.SY_Emp;
import com.ssm.model.SyUnits;
import com.ssm.service.BasZoneinfoService1;
import com.ssm.service.SY_EmpService1;
import com.ssm.service.SyUnitsService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FuzhuaddSorStorageController {

   @Autowired

    private SY_EmpService1 empService;
   @Autowired
   private SyUnitsService1 unitsService;


   @RequestMapping("findAllSyUnits")
   public List<SyUnits> findAllSyUnits()
   {
       System.out.println("findAllSyUnits");
       List<SyUnits> list = unitsService.findAllSyUnits();

       return list;
   }
   @RequestMapping("findAllSY_Emp")
   public List<SY_Emp> findAllSY_Emp()
   {
       System.out.println("findAllSY_Emp");
       List<SY_Emp> list2=  empService.emplist();

       return  list2;
   }





}

