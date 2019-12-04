package com.ssm.controller;

import com.ssm.model.RetReturnlist;
import com.ssm.model.SyEmp;
import com.ssm.service.RetReturnlistService;
import com.ssm.service.SyEmpService;
import com.ssm.service.SyUnitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RetReturnlistController {
    @Autowired
    private RetReturnlistService retReturnlistService;

    @Autowired
    private SyEmpService syEmpService;

    @Autowired
    private SyUnitsService syUnitsService;
//申请返货
    @RequestMapping("selectReturnlist")
    public Map<Object,Object> selectReturnlist(int page, int rows, String worksheetno, String entrytime,String apreturnstatus,  HttpServletRequest request){
        Map<Object,Object> map=new HashMap<>();
        System.out.println("进来了");
        map.put("total",retReturnlistService.selectCount2("%"+worksheetno+"%","%"+entrytime+"%","%"+apreturnstatus+"%"));
        List<RetReturnlist> list = retReturnlistService.selectByPrimaryKeyLike2((page - 1) * rows, page * rows,"%"+worksheetno+"%","%"+entrytime+"%","%"+apreturnstatus+"%");
        SyEmp emp = syEmpService.selectSyEmp(61);
        emp.setSyUnits(syUnitsService.selectSyUnits(emp.getEmpUnit()));
        for (RetReturnlist s : list) {
            if (s.getPersonname().equals(emp.getEmpName())){
                s.setSyEmp(emp);
            }

        }

        map.put("rows",list);
        map.put("max",retReturnlistService.selectMax());
        return map;
    }
    @RequestMapping("updateReturnlist2")
    public void updateReturnlist2(RetReturnlist record){
        retReturnlistService.update(record);

    }

    @RequestMapping("updateReturnlist3")
    public void updateReturnlist3(RetReturnlist record){
        retReturnlistService.update2(record);

    }
//返货
    @RequestMapping("selectReturnlistLike")
    public Map<Object,Object> selectReturnlistLike(int page, int rows, String worksheetno, String entrytime,String apreturnstatus,  HttpServletRequest request){
        Map<Object,Object> map=new HashMap<>();
        map.put("total",retReturnlistService.selectCount("%"+worksheetno+"%","%"+entrytime+"%","%"+apreturnstatus+"%"));
        List<RetReturnlist> list = retReturnlistService.selectByPrimaryKeyLike((page - 1) * rows, page * rows,"%"+worksheetno+"%","%"+entrytime+"%","%"+apreturnstatus+"%");
        SyEmp emp = syEmpService.selectSyEmp(41);
        emp.setSyUnits(syUnitsService.selectSyUnits(emp.getEmpUnit()));
        for (RetReturnlist s : list) {
            if (s.getPersonname().equals(emp.getEmpName())){
                s.setSyEmp(emp);
            }

        }

        map.put("rows",list);
        map.put("max",retReturnlistService.selectMax());
        return map;
    }

/*1）有功能权限和修改按钮权限的用户对数据进行修改；
            2）数据权限：只能对申请单状态为“未确认”的申请单进行修改；
            3）数据权限：只能对申请单位是本单位及下级的数据进行修改；
            4）修改字段权限：只能对是否可修改状态为“是”的字段进行修改，见输入中介绍；
            5）修改保存的校验同新增保存。*/
    @RequestMapping("updateReturnlist")
    public void updateReturnlist(RetReturnlist record){
        retReturnlistService.updateByPrimaryKey(record);

    }

    @RequestMapping("deleteReturnlist")
    public String deleteReturnlist(short id){
        retReturnlistService.deleteByPrimaryKey(id);
        return "index";
    }
/*
    1)添加条件
已经有工作单签收、或者已经有核销信息的不能录入申请；，提示“货物已经签收、，不允许再申请返货”或者“货物已经核销，不允许再申请返货”；
            已经有对应工作单“返货申请”，且申请处理状态为“未确认”状态的，且作废标志为“否”，也不能重新申请，提示“已经有返货申请，不允许再申请返货”；
            已经有对应工作单“返货申请”，且返货执行状态为“返货、转发”状态的，且作废状态标志为“否”，也不能录入异常，提示“出港方已经确认返货，不必再申请返货”；
            不能录入异单的返货申请；
            不能录入工作单返货标志为“是”的返货申请；
            不能录入返单标志为“是”的返货申请；*/
    @RequestMapping("addReturnlist")
    public void addReturnlist(RetReturnlist s){
        retReturnlistService.insert(s);
    }
}
