package com.ssm.controller;

import com.ssm.model.DisWorkordersign;
import com.ssm.service.DisWorkordersignService;
import com.ssm.service.SyUnitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DisWorkordersignController {
    @Autowired
    private DisWorkordersignService disWorkordersignService;

    @Autowired
    private SyUnitsService syUnitsService;

    //栏目管理
    //分页
    @RequestMapping("selectWorkordersignLike")
    public Map<Object,Object> selectWorkordersignLike(int page, int rows, String worksheetno, String empName){
        Map<Object,Object> map=new HashMap<>();
        map.put("total",disWorkordersignService.selectCount("%"+worksheetno+"%"));
        List<DisWorkordersign> list = disWorkordersignService.selectByPrimaryKeyLike((page - 1) * rows, page * rows,"%"+worksheetno+"%");
        for (DisWorkordersign d : list) {
            d.setSyUnits(syUnitsService.selectSyUnits(d.getInputid()));

        }
        map.put("rows",list);
        return map;
    }


    @RequestMapping("updateWorkordersign")
    public void updateWorkordersign(DisWorkordersign record){
        disWorkordersignService.updateByPrimaryKey(record);

    }

    @RequestMapping("deleteWorkordersign")
    public String deleteWorkordersign(short id){
        disWorkordersignService.deleteByPrimaryKey(id);
        return "index";
    }

    @RequestMapping("addWorkordersign")
    public void addWorkordersign(DisWorkordersign s){
        s.setWorkorderid(Short.parseShort(s.getWorksheetno().substring(3)));
        disWorkordersignService.insert(s);
    }




}
