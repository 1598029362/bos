package com.ssm.controller;

import com.alibaba.fastjson.JSONObject;
import com.ssm.model.*;
import com.ssm.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SorOutboundController {
    @Autowired
   private SorOutboundService service;
    @Autowired
    private SY_EmpService1 empService;
    @Autowired
    private SyUnitsService1 unitsService;
    @Autowired
    private SorOutbounddetailsService sorOutbounddetailsService;

    @RequestMapping("findAllSorOutbound")
    public Map<Object,Object> findAllSorOutbound()
    {
          Map<Object,Object>  map=new HashMap<>();
     List<SorOutbound>  list=  service.findAllSorOutbound();


        List<SY_Emp> empList=empService.emplist();
        List<SyUnits> ll=  unitsService.findAllSyUnits();
        for (SorOutbound s : list) {
            if(s.getHandovertype()==1)
            {
             s.setJjdlx("市内物流交接单");
            }
           else if(s.getHandovertype()==2)
            {
                s.setJjdlx("长途物流交接单");
            }
            else if(s.getHandovertype()==3)
            {
                s.setJjdlx("派送清单");
            }
           else
            {
                s.setJjdlx("发货交接单");
            }

            System.out.println(s);
            for (SY_Emp emp : empList) {
                if ((int)s.getAcceptperson()==emp.getID())
                {
                    s.setEmp1(emp.getEmpName());
                }
                if ((int)s.getDeliveryperson()==emp.getID())
                {
                    s.setEmp2(emp.getEmpName());
                }
                if ((int)s.getEnterperson()==emp.getID())
                {
                    s.setEmp3(emp.getEmpName());
                }


            }
            for (SyUnits units : ll) {
                System.out.println(units.getId()+"\t"+s.getDirection());
                if (units.getId()==s.getDirection())
                {
                    s.setAcceptcompany(units.getName());
                }
            }
        }


        map.put("rows",list);
        return map;
    }
   @RequestMapping("insertSorOutbound")
    public  String insertSorOutbound(SorOutbound sorOutbound)
    {
        System.out.println(sorOutbound);
        service.insert(sorOutbound);
        List<SorOutbounddetails> list = new ArrayList<SorOutbounddetails>();
// contantUser 需要转的字符串，DoVendorContantEntity.class 需要转换成的实体类对象
        list =  JSONObject.parseArray(sorOutbound.getList(),SorOutbounddetails.class);
        for (SorOutbounddetails sorOutbounddetails : list) {
            System.out.println(sorOutbounddetails);
            sorOutbounddetails.setPackageid("HB"+service.selectSorOutbound());
            sorOutbounddetailsService.insert(sorOutbounddetails);
        }
        return "ok";
    }

    @RequestMapping("updateSorOutbound")
    public  String updateSorOutbound(SorOutbound sorOutbound)
    {
        service.updateByPrimaryKeySelective(sorOutbound);
        List<SorOutbounddetails> list = new ArrayList<SorOutbounddetails>();
// contantUser 需要转的字符串，DoVendorContantEntity.class 需要转换成的实体类对象
        list =  JSONObject.parseArray(sorOutbound.getList(),SorOutbounddetails.class);
        for (SorOutbounddetails sorOutbounddetails : list) {
            sorOutbounddetailsService.updateByPrimaryKeySelective(sorOutbounddetails);
        }

        return "";
    }
   @RequestMapping("selectSorOutbounddetailsByIdLike")
    public  List <SorOutbounddetails> selectSorOutbounddetailsByIdLike(SorOutbound sorOutbound)
    {
        System.out.println("HB" +sorOutbound.getId());

        return sorOutbounddetailsService.selectSorOutbounddetailsByIdLike("HB"+sorOutbound.getId());
    }

    @RequestMapping("deleteSorOutbounddetails")
    public  String deleteSorOutbounddetails(SorOutbound sorOutbound)
    {
        System.out.println("HB" +sorOutbound.getId());
         service.deleteByPrimaryKey(sorOutbound.getId());
        sorOutbounddetailsService.deleteByPrimaryKey("HB"+sorOutbound.getId());
        return "";
    }

}
