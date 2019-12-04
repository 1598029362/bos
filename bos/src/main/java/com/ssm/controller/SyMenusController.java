package com.ssm.controller;




import com.ssm.model.SyMenus;
import com.ssm.service.SyMenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class SyMenusController {
    @Autowired
    private SyMenusService syMenusService;

    //栏目管理
    //分页
    @RequestMapping("selectMenusLike")
    public Map<Object,Object> selectMenusLike(int page, int rows, String text, HttpServletRequest request){

        Map<Object,Object> map=new HashMap<>();
        map.put("total",syMenusService.selectCount("%"+text+"%"));
        map.put("rows",syMenusService.selectByPrimaryKeyLike((page-1)*rows,page*rows,"%"+text+"%"));
        return map;
    }


    @RequestMapping("findAllModules")
    public List<SyMenus> findAllModules(HttpServletRequest request){
        //调用service中的查询方法
        Short a= (Short) request.getSession().getAttribute("roleID");
        List<SyMenus> list=syMenusService.findAllModule();//这里查询出来的是根节点
        for (SyMenus module : list) {
            findChildModule(module.getId(),module,a);
        }
        return list;
    }

    public void findChildModule(int pid,SyMenus module,int a){

        List<SyMenus> list=syMenusService.findChildModule(pid,a);
        for (SyMenus module1 : list) {
            //继续调用查询的方法
        }
        module.setChildren(list);//将查询到的子节点放入对应根节点的集合中
    }

    @RequestMapping("updateMenus")
    public void updateMenus(SyMenus syMenus){
        syMenusService.updateByPrimaryKey(syMenus);

    }

    @RequestMapping("deleteMenus")
    public String deleteMenus(short id){
        syMenusService.deleteByPrimaryKey(id);
        return "index";
    }

    @RequestMapping("addMenus")
    public void addMenus(SyMenus syMenus){
        syMenusService.insert(syMenus);
    }







}
