package com.ssm.controller;




import com.ssm.model.SyUnits;
import com.ssm.service.SyUnitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class SyUnitsController {
    @Autowired
    private SyUnitsService syUnitsService;

    //栏目管理
    //分页
    @RequestMapping("selectUnitsLike")
    public Map<Object,Object> selectUnitsLike(int page, int rows,String name){
        Map<Object,Object> map=new HashMap<>();
        map.put("total",syUnitsService.selectCount("%"+name+"%"));
        map.put("rows",syUnitsService.selectByPrimaryKeyLike((page-1)*rows,page*rows,"%"+name+"%"));
        return map;
    }


    @RequestMapping("updateUnits")
    public void updateUnits(SyUnits syUnits){
        syUnitsService.updateByPrimaryKey(syUnits);

    }

    @RequestMapping("deleteUnits")
    public String deleteUnits(short id){
        syUnitsService.deleteByPrimaryKey(id);
        return "index";
    }

    @RequestMapping("addUnits")
    public void addUnits(SyUnits syUnits){
        syUnitsService.insert(syUnits);
    }







}
