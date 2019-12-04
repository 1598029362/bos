package com.ssm.controller;




import com.ssm.model.SyEmp;
import com.ssm.model.SyRole;
import com.ssm.model.SyUnits;
import com.ssm.service.SyEmpService;
import com.ssm.service.SyRoleService;
import com.ssm.service.SyUnitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class SyEmpController {
    @Autowired
    private SyEmpService syEmpService;

    @Autowired
    private SyUnitsService syUnitsService;

    @Autowired
    private SyRoleService syRoleService;


    //查询单位
    @RequestMapping("selectUnits")
    public List<SyUnits> selectUnits(){
      return   syUnitsService.selectUnits();
    }
    //查询角色
    @RequestMapping("selectRole")
    public List<SyRole> selectRole(){
        return   syRoleService.selectRole();
    }

    //栏目管理
    //分页
    @RequestMapping("selectEmpLike")
    public Map<Object,Object> selectEmpLike(int page, int rows,String name,String disabled){
        Map<Object,Object> map=new HashMap<>();
        List<SyEmp> emps = syEmpService.selectByPrimaryKeyLike((page - 1) * rows, page * rows, "%" + name + "%", "%" + disabled + "%");
        for (SyEmp emp : emps) {
            emp.setEmp_role(syRoleService.byid(emp.getRoleID()));
        }
        map.put("total",syEmpService.selectCount("%"+name+"%","%"+disabled+"%"));
        map.put("rows",emps);
        return map;
    }
    //获取登录信息
    @RequestMapping("login")
    public Map<Object,Object> login(SyEmp syEmp, HttpServletRequest request){
        Map<Object,Object> map=new HashMap<>();
        Short id = (Short) request.getSession().getAttribute("id");
        SyEmp emp = syEmpService.selectSyEmp(id);
        SyUnits units = syUnitsService.selectSyUnits(emp.getEmpUnit());
        map.put("id",id);
        map.put("roleID",request.getSession().getAttribute("roleID"));
        map.put("name",request.getSession().getAttribute("name"));
        map.put("units",units);
        return map;
    }
    @RequestMapping("sssss")
    public Map<Object,Object>  ssssss(SyEmp syEmp,HttpServletRequest request){
        Map<Object,Object> map=new HashMap<>();
        List<SyEmp> list = syEmpService.selectByPrimaryLike(syEmp.getEmpNo(), syEmp.getPwd());
        for (SyEmp emp : list) {
            request.getSession().setAttribute("id",emp.getID());
            request.getSession().setAttribute("roleID",emp.getRoleID());
            request.getSession().setAttribute("name",emp.getEmpName());
        }
        map.put("size",list.size());
        return map;

    }

    @RequestMapping("updateEmp")
    public void updateEmp(SyEmp syEmp){
        syEmpService.updateByPrimaryKey(syEmp);

    }

    @RequestMapping("deleteEmp")
    public String deleteEmp(short id){
        System.out.println("sdfghjk");
        int i = syEmpService.deleteByPrimaryKey(id);
        System.out.println(i);
        return "index";
    }

    @RequestMapping("addEmp")
    public void addEmp(SyEmp syEmp){

        syEmpService.insert(syEmp);
    }







}
