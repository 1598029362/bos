package com.ssm.controller;

import com.ssm.model.DisPropagandatask;
import com.ssm.service.DisPropagandataskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DisPropagandataskController {
    @Autowired
    private DisPropagandataskService disPropagandataskService;

    //栏目管理
    //分页
    @RequestMapping("selectPropagandataskLike")
    public Map<Object,Object> selectPropagandataskLike(int page, int rows,String outline,String releasetime){
        Map<Object,Object> map=new HashMap<>();
        map.put("total",disPropagandataskService.selectCount("%"+outline+"%","%"+releasetime+"%"));
        List<DisPropagandatask> list = disPropagandataskService.selectByPrimaryKeyLike((page - 1) * rows, page * rows,"%"+outline+"%","%"+releasetime+"%");
        map.put("rows",list);
        return map;
    }


    @RequestMapping("updatePropagandatask")
    public void updatePropagandatask(DisPropagandatask record){
        disPropagandataskService.updateByPrimaryKey(record);

    }

    @RequestMapping("deletePropagandatask")
    public String deletePropagandatask(short id){
        disPropagandataskService.deleteByPrimaryKey(id);
        return "index";
    }

    @RequestMapping("addPropagandatask")
    public void addPropagandatask(DisPropagandatask s){
        disPropagandataskService.insert(s);
    }
}
