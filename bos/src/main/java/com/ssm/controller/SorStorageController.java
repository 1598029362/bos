package com.ssm.controller;

import com.ssm.model.SorStorage;
import com.ssm.service.SorStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SorStorageController {
    @Autowired
    private SorStorageService service;

    @RequestMapping("findAllSorStorage")
    public Map<Object,Object> findAllSorStorage()
    {
        Map<Object,Object> map=new HashMap<>();
        map.put("total",service.finAllSorStorageSize());
        map.put("rows",service.findAllSorStorage());
      return map;
    }


}
