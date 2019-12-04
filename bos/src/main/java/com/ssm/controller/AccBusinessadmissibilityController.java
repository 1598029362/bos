package com.ssm.controller;


import com.ssm.model.*;
import com.ssm.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


@RestController
public class AccBusinessadmissibilityController {
    @Autowired
    private AccBusinessadmissibilityService accBusinessadmissibilityService;


    @Autowired
    private SyEmpService syEmpService;

    @Autowired
    private SyUnitsService syUnitsService;

    @Autowired
    private BasZonecustominfo1Service basZonecustominfo1Service;

    @Autowired
    private AccWorkorderService accWorkorderService;

    @Autowired
    private BasAssociatemember2Service basAssociatemember2Service;




    //栏目管理
    //分页

    @RequestMapping("selectBusinessLike")
    public Map<Object, Object> selectBusinessLike(int page, int rows, String businessnoticeno, String customcode) {
        Map<Object, Object> map = new HashMap<>();
        map.put("total", accBusinessadmissibilityService.selectCount("%" + businessnoticeno + "%", "%" + customcode + "%"));
        List<AccBusinessadmissibility> list = accBusinessadmissibilityService.selectByPrimaryKeyLike((page - 1) * rows, page * rows, "%" + businessnoticeno + "%", "%" + customcode + "%");
        for (AccBusinessadmissibility s : list) {
            for (AccWorkorder d : accBusinessadmissibilityService.selectAccWorkorder()) {
                if (s.getBusinessnoticeno().equals(d.getBusinessnoticeno())) {
                    s.setAccWorkorder(d);

                }
            }
        }
        map.put("rows", list);
        map.put("max", accBusinessadmissibilityService.selectMax());
        return map;
    }
    //工作单状态为新单
    @RequestMapping("selectBusinessLike3")
    public Map<Object, Object> selectBusinessLike3(int page, int rows, String businessnoticeno, String customcode) {
        Map<Object, Object> map = new HashMap<>();
        map.put("total", accBusinessadmissibilityService.selectCount("%" + businessnoticeno + "%", "%" + customcode + "%"));
        List<AccBusinessadmissibility> list = accBusinessadmissibilityService.selectByPrimaryKeyLike((page - 1) * rows, page * rows, "%" + businessnoticeno + "%", "%" + customcode + "%");
        List<AccBusinessadmissibility> list1=new ArrayList<>();
        for (AccBusinessadmissibility s : list) {
            for (AccWorkorder d : accBusinessadmissibilityService.selectAccWorkorder()) {
                if (s.getBusinessnoticeno().equals(d.getBusinessnoticeno())&&d.getPickupstatus()==1) {
                    s.setAccWorkorder(d);
                    list1.add(s);
                }
            }
        }
        map.put("rows", list1);
        map.put("max", accBusinessadmissibilityService.selectMax());
        return map;
    }

    //工作单状态为已通知
    @RequestMapping("selectBusinessLike2")
    public Map<Object, Object> selectBusinessLike2(int page, int rows, String businessnoticeno, String customcode) {
        Map<Object, Object> map = new HashMap<>();
        map.put("total", accBusinessadmissibilityService.selectCount("%" + businessnoticeno + "%", "%" + customcode + "%"));
        List<AccBusinessadmissibility> list = accBusinessadmissibilityService.selectByPrimaryKeyLike((page - 1) * rows, page * rows, "%" + businessnoticeno + "%", "%" + customcode + "%");
        List<AccBusinessadmissibility> list1=new ArrayList<>();
        for (AccBusinessadmissibility s : list) {
            for (AccWorkorder d : accBusinessadmissibilityService.selectAccWorkorder()) {
                if (s.getBusinessnoticeno().equals(d.getBusinessnoticeno())&&d.getPickupstatus()!=1) {
                    s.setAccWorkorder(d);
                    list1.add(s);
                }
            }
        }
        map.put("rows", list1);
        map.put("max", accBusinessadmissibilityService.selectMax());
        return map;
    }

    //a)销单工单直接调度给接收原订单新工单的收派员。
    @RequestMapping("updateBusiness")
    public void updateBusiness(AccBusinessadmissibility d) {
        accBusinessadmissibilityService.updateByPrimaryKey(d);
        BasZonecustominfo1 s=new BasZonecustominfo1(d.getCustomname(),d.getTelphone(),d.getPickupaddress(),d.getLinkman());
        s.setCityname(d.getArrivecity());
        s.setCustomcode(Short.parseShort(d.getCustomcode()));
        basZonecustominfo1Service.updateByPrimaryKey(s);
    }

    @RequestMapping("deleteBusiness")
    public String deleteBusiness(String businessnoticeno) {
        accBusinessadmissibilityService.deleteByPrimaryKey(businessnoticeno);
        accWorkorderService.deleteByPrimaryKey(businessnoticeno);

        return "index";
    }



    @RequestMapping("addBusiness")
    public void addBusiness(AccBusinessadmissibility s) {
        //分析地址  查询省
        //工单
        String ads =s.getPickupaddress();
        int i = ads.indexOf("市");
        int j = ads.indexOf("省");
        int k = ads.indexOf("区");
        int q = ads.indexOf("县");
        if(j!=-1){//省
            String province = ads.substring(0,j+1);
            String city = ads.substring(j+1, i+1);
            String county="";
            if(k!=-1){//区
                county = ads.substring(i+1,k+1);
            }else{
                county = ads.substring(i+1,q+1);
            }
            BasPartition bas=new BasPartition(province,city,county);
            int g = basZonecustominfo1Service.selectPartition(bas);
            System.out.println(g);
            AccWorkorder asd = new AccWorkorder();
            if (g==1){
                //创建工作单
                asd.setPickupstatus((short) 2);
            }else {
                asd.setPickupstatus((short) 1);
            }

            asd.setBusinessnoticeno(s.getBusinessnoticeno());
            asd.setJobno("KD" + s.getMax());
            asd.setJobtype((short) 1);
            asd.setShortmessageint("DX" + s.getMax());
            asd.setWorkgenerationtime(new Date());
            asd.setAftersinglenum((short) 0);
            SyEmp emp = syEmpService.selectSyEmp(61);
            SyUnits units = syUnitsService.selectSyUnits(emp.getEmpUnit());
            asd.setSmallmembernum(emp.getID());
            asd.setPickupunit(units.getId());
            asd.setSortingcode(units.getAddress());

            Date date = new Date();
            Calendar dar = Calendar.getInstance();
            dar.setTime(date);
            dar.add(Calendar.HOUR_OF_DAY, 2);
            asd.setPickuptime(dar.getTime());

            asd.setSortingcode("BQ"+s.getMax());
            accWorkorderService.insert(asd);


            //业务通知单
            //地址
            String a=province+city+county;
            System.out.println(a);
            SyUnits syUnits = syUnitsService.selectSyUnitsAddress(a);
            s.setProcessingunit(syUnits.getId());
            s.setSendaddress(syUnits.getAddress());

            //取货人员信息
            BasAssociatemember basAssociatemember = basAssociatemember2Service.selectBasAssociatemember23(syUnits.getId());
            s.setPickerinfo(Short.parseShort(basAssociatemember.getEmpno()));

            s.setSingletype("人工");
            accBusinessadmissibilityService.insert(s);



        }else{
            if(i>q){//市

            }else {

            }
        }
    }




}
