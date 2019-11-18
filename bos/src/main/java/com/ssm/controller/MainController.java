package com.ssm.controller;



import com.ssm.model.Dept;
import com.ssm.model.Substitute;
import com.ssm.service.SubstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
    //注入UsersServices的Bean
   @Autowired
   private SubstituteService substituteService;

    @RequestMapping("test")
    public String test(){
        System.out.println("测试成功");
        return "index";
    }

   /* @RequestMapping("findAllModules")
    public List<Module> findAllModules(){
        //调用service中的查询方法
        List<Module> list=usersServices.findAllModule();//这里查询出来的是根节点
        for (Module module : list) {
            findChildModule(module.getId(),module);
        }
       return list;
    }

    public void findChildModule(int pid,Module module){
        List<Module> list=usersServices.findChildModule(pid);
        for (Module module1 : list) {
            //继续调用查询的方法
        }
        module.setChildren(list);//将查询到的子节点放入对应根节点的集合中
    }*/

    @RequestMapping("selectSubstitute")
    public List<Substitute> selectSubstitute(){
        List<Substitute> list=substituteService.selectSubstitute();
        return list;
    }

    @RequestMapping("selectDept")
    public List<Dept> selectDept(){
        List<Dept> list=substituteService.selectDept();
        return list;
    }



}
