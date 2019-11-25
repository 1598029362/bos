package com.ssm.controller;

import com.alibaba.fastjson.JSONObject;
import com.ssm.model.SY_Emp;
import com.ssm.model.SorStorage;
import com.ssm.model.SorStoragedetails;
import com.ssm.service.SY_EmpService1;
import com.ssm.service.SorStorageService;
import com.ssm.service.SorStoragedetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@ResponseBody
@Controller
public class SorStorageController {
    @Autowired
    private SorStorageService service;
    @Autowired
    private SorStoragedetailsService sorStoragedetailsService;
    @Autowired
    private SY_EmpService1 empService;


    @RequestMapping("findAllSorStorage")
    public Map<Object,Object> findAllSorStorage()
    {
      List<SorStorage> list= service.findAllSorStorage();
     List<SY_Emp> empList=empService.emplist();
        for (SorStorage s : list) {
            for (SY_Emp emp : empList) {
               if (s.getAcceptperson()==emp.getID())
               {
                   s.setEmp1(emp.getEmpName());
               }
               if (s.getDeliveryperson()==emp.getID())
               {
                    s.setEmp2(emp.getEmpName());
               }

            }
        }

        System.out.println("进来了");
        Map<Object,Object> map=new HashMap<>();
        map.put("total",service.finAllSorStorageSize());
        map.put("rows",list);
      return map;
    }

    @RequestMapping("selectSorStoragedetailsById")
    public List<SorStoragedetails> selectSorStoragedetailsById(SorStorage storage)
    {
        System.out.println("进来了selectSorStoragedetailsById");
        List<SorStoragedetails> list=new ArrayList<>();
        list=sorStoragedetailsService.selectSorStoragedetailsById("HB"+storage.getId());
        for (SorStoragedetails storagedetails : list) {
            if (storagedetails.getState()==1)
            {
               storagedetails.setStates("中转入库");
            }
            else  if (storagedetails.getState()==2)
            {
                storagedetails.setStates("二次入库");
            }
            else  if (storagedetails.getState()==3)
            {
                storagedetails.setStates("初始入库");
            }
           else if (storagedetails.getState()==4)
            {
                storagedetails.setStates("有货无单");
            }
        }
        return list;
    }


    @RequestMapping("deleteSorStorage")
    public String deleteSorStorage(long id)
    {
        System.out.println(id);
        System.out.println("jinlaildelete");
        service.deleteByPrimaryKey(id);
        sorStoragedetailsService.deleteByLike("HB"+id);
        return "";
    }

    @RequestMapping("insertSorStorage")
    public String insertSorStorage(SorStorage storage)
    {

        System.out.println("insert");
        System.out.println(storage.toString());
        long id=new Date().getTime();
        System.out.println(id);
        storage.setId(id);

        // storage.setAcceptdate(new Date(time));
        service.insert(storage);
        List<SorStoragedetails> list = new ArrayList<SorStoragedetails>();
// contantUser 需要转的字符串，DoVendorContantEntity.class 需要转换成的实体类对象
        list =  JSONObject.parseArray(storage.getList(), SorStoragedetails.class);
        for (SorStoragedetails storagedetails : list) {
            storagedetails.setPackageid("HB"+id);
            storagedetails.setOutboundid("CK"+id);
            sorStoragedetailsService.insert(storagedetails);
        }
        //service.insert(storage);
        return "";
    }

    @RequestMapping("updateSorStorage")
    public String updateSorStorage(SorStorage storage)
    {
       // service.updateByPrimaryKeySelective(storage);
        System.out.println("updateSorStorage");

        System.out.println(storage);

        service.updateByPrimaryKeySelective(storage);
        List<SorStoragedetails> list = new ArrayList<SorStoragedetails>();
// contantUser 需要转的字符串，DoVendorContantEntity.class 需要转换成的实体类对象
        list =  JSONObject.parseArray(storage.getList(), SorStoragedetails.class);
        for (SorStoragedetails storagedetails : list) {
            sorStoragedetailsService.update(storagedetails);
        }
        //service.insert(storage);
        return "";

    }

    public static class SyRolesMenus {
        private Short id;

        private Short roleid;

        private Short menuid;

        public SyRolesMenus() {
        }

        public SyRolesMenus( Short menuid) {
            this.menuid = menuid;
        }

        public SyRolesMenus(Short roleid, Short menuid) {
            this.roleid = roleid;
            this.menuid = menuid;
        }

        public Short getId() {
            return id;
        }

        public void setId(Short id) {
            this.id = id;
        }

        public Short getRoleid() {
            return roleid;
        }

        public void setRoleid(Short roleid) {
            this.roleid = roleid;
        }

        public Short getMenuid() {
            return menuid;
        }

        public void setMenuid(Short menuid) {
            this.menuid = menuid;
        }
    }
}
