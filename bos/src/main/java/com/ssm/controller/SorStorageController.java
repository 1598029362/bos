package com.ssm.controller;

import com.alibaba.fastjson.JSONObject;
import com.ssm.model.SY_Emp;
import com.ssm.model.SorStorage;
import com.ssm.model.SorStoragedetails;
import com.ssm.service.BasZoneinfoService1;
import com.ssm.service.SY_EmpService1;
import com.ssm.service.SorStorageService;
import com.ssm.service.SorStoragedetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
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
    private  Integer page=1;
    private  Integer rows=4;

    @RequestMapping("findAllSorStorage")
    public Map<Object,Object> findAllSorStorage()
    {


        //(page-1)* rows          page*rows;
        Map<Object,Object> map=new HashMap<>();
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

        map.put("total",service.finAllSorStorageSize());
        map.put("rows",list);

        return map;
    }

    @RequestMapping("findAllByLikeSorStorage")
    public Map<Object,Object> findAllByLikeSorStorage(SorStorage storage,Integer page,Integer rows)
    {
        if(storage.getId()==null)
        {
            storage.setId(1L);
        }
        if (storage.getAcceptdate()==null)
        {
          storage.setAcceptdate(new Date());
        }
        if(page==null)
        {
            page=1;
        }
        if(rows==null)
        {
            rows=4;
        }
        System.out.println(storage.getId()+"\t"+storage.getAcceptdate()+"\t"+page+"\t"+rows);
        List<SorStorage> list=service.selectByPrimaryKeyLike((page-1)* rows,page*rows,storage.getId(),storage.getAcceptdate());
        Map<Object,Object> map =new HashMap<>();

        List<SY_Emp> empList=empService.emplist();
        for (SorStorage s : list) {
            System.out.println(s);
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

}
