package com.ssm.controller;

import com.ssm.model.SorAbnormal;
import com.ssm.service.SorAbnormalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SorAbnormalController {
    @Autowired
    private SorAbnormalService sorAbnormalService;

    @RequestMapping("findAllSorAbnormal")
    public Map<Object,Object> findAllSorAbnormal()
    {
        Map<Object,Object> map=new HashMap<>();
        map.put("list",sorAbnormalService.findAllSOR_Abnormal());
        return map;
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
        sorAbnormalService.updateByPrimaryKey(sorAbnormal);
        return "";
    }

    @RequestMapping("insertSorAbnormal")
    public String insertSorAbnormal(SorAbnormal sorAbnormal)
    {
        sorAbnormalService.insert(sorAbnormal);
        return "";
    }

}