package com.ssm.controller;

import com.ssm.model.SorAbnormal;
import com.ssm.service.SorAbnormalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SorAbnormalController {
    @Autowired
    private SorAbnormalService sorAbnormalService;

    @RequestMapping("findAllSorAbnormal")
    public List<SorAbnormal> findAllSorAbnormal()
    {


        return sorAbnormalService.findAllSOR_Abnormal();
    }

    @RequestMapping("deleteSorAbnormal")
    public  String deleteSorAbnormal(SorAbnormal sorAbnormal)
    {
        sorAbnormalService.deleteByPrimaryKey(sorAbnormal.getId());
        return "";
    }

    @RequestMapping("updateSorAbnormal")
    public  String updateSorAbnormal(SorAbnormal sorAbnormal)
    {
        sorAbnormal.setHandledate(new Date());
        sorAbnormalService.updateByPrimaryKey(sorAbnormal);
        return "";
    }

    @RequestMapping("insertSorAbnormal")
    public String insertSorAbnormal(SorAbnormal sorAbnormal)
    {
        System.out.println(sorAbnormal);
        sorAbnormal.setHandledate(new Date());
        sorAbnormalService.insert(sorAbnormal);
        return "";
    }

}
