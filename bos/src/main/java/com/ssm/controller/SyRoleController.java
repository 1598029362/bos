package com.ssm.controller;




import com.alibaba.fastjson.JSONObject;
import com.ssm.model.SyMenus;
import com.ssm.model.SyRole;
import com.ssm.service.SyRoleService;
import com.ssm.service.SyRolesMenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class SyRoleController {
    @Autowired
    private SyRoleService syRoleService;

    @Autowired
    private SyRolesMenusService syRolesMenusService;

    //角色---菜单
    @RequestMapping("selectRolesMenusLike")
    public List<Short> selectRolesMenusLike(int id){
        List<Short> list=new ArrayList<>();
        List<SorStorageController.SyRolesMenus> menus = syRolesMenusService.selectByPrimaryKeyLike(id);
        for (SorStorageController.SyRolesMenus menu : menus) {

            list.add(menu.getMenuid());
        }
        return list;
    }



    //角色管理
    //分页
    @RequestMapping("selectRoleLike")
    public Map<Object,Object> selectRoleLike(int page, int rows,String rolename,String disabled){
        Map<Object,Object> map=new HashMap<>();
        map.put("total",syRoleService.selectCount("%"+rolename+"%","%"+disabled+"%"));
        map.put("rows",syRoleService.selectByPrimaryKeyLike((page-1)*rows,page*rows,"%"+rolename+"%","%"+disabled+"%"));
        return map;
    }

    @RequestMapping("updateRole")
    public void updateRole(SyRole syRole){
        syRoleService.updateByPrimaryKey(syRole);
        for (SorStorageController.SyRolesMenus menus : syRolesMenusService.selectByPrimaryKeyLike(syRole.getId())) {
            syRolesMenusService.deleteByPrimaryKey(syRole.getId());
        }


        List<SyMenus> list = JSONObject.parseArray(syRole.getRole_menus(),SyMenus.class);
        for (SyMenus menus : list) {
            for (SyMenus syMenus : menus.getChildren()) {
                SorStorageController.SyRolesMenus rolesMenus=new SorStorageController.SyRolesMenus(syRole.getId(),syMenus.getId());
                syRolesMenusService.insert2(rolesMenus);
            }
        }
    }

    @RequestMapping("deleteRole")
    public void deleteRole(short id){
        syRoleService.deleteByPrimaryKey(id);
        syRolesMenusService.deleteByPrimaryKey(id);

    }

    @RequestMapping("addRole")
    public void addRole(SyRole syRole){
        syRoleService.insert(syRole);
        List<SyMenus> list = JSONObject.parseArray(syRole.getRole_menus(),SyMenus.class);
        for (SyMenus menus : list) {
            if(Integer.parseInt(menus.getParentid())!=-1)
            {
                SorStorageController.SyRolesMenus rolesMenus=new SorStorageController.SyRolesMenus(menus.getId());
                syRolesMenusService.insert(rolesMenus);
            }

        }

    }


}
