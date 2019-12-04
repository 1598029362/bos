package com.ssm.controller;

import com.ssm.model.DisDispatchhistory;
import com.ssm.service.DisDispatchhistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DisDispatchhistoryController {
    @Autowired
    private DisDispatchhistoryService disDispatchhistoryService;

    //栏目管理
    //分页
    @RequestMapping("selectDispatchhistoryLike")
    public Map<Object,Object> selectDispatchhistoryLike(int page, int rows, String Dispatchhistorynoticeno, String customcode){
        Map<Object,Object> map=new HashMap<>();
        map.put("total",disDispatchhistoryService.selectCount("%"+Dispatchhistorynoticeno+"%","%"+customcode+"%"));
        List<DisDispatchhistory> list = disDispatchhistoryService.selectByPrimaryKeyLike((page - 1) * rows, page * rows,"%"+Dispatchhistorynoticeno+"%","%"+customcode+"%");
        map.put("rows",list);
        return map;
    }


    @RequestMapping("updateDispatchhistory")
    public void updateDispatchhistory(DisDispatchhistory record){
        disDispatchhistoryService.updateByPrimaryKey(record);

    }

    @RequestMapping("deleteDispatchhistory")
    public String deleteDispatchhistory(short id){
        disDispatchhistoryService.deleteByPrimaryKey(id);
        return "index";
    }

    @RequestMapping("addDispatchhistory")
    public void addDispatchhistory(DisDispatchhistory s){
        disDispatchhistoryService.insert(s);
    }
}
