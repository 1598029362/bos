package com.ssm.controller;

import com.ssm.model.AccBusinessadmissibility;
import com.ssm.model.AccWorkorder;
import com.ssm.model.AccWorksheet;
import com.ssm.model.BasAssociatemember;
import com.ssm.service.AccBusinessadmissibilityService;
import com.ssm.service.AccWorksheetService;
import com.ssm.service.SyEmpService;
import com.ssm.service.SyUnitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AccWorksheetController {
    @Autowired
    private AccWorksheetService accWorksheetService;

    @Autowired
    private AccBusinessadmissibilityService accBusinessadmissibilityService;

    @Autowired
    private BasAssociatemember2Service basAssociatemember2Service;
    
    @Autowired
    private SyEmpService syEmpService;

    @Autowired
    private  SyUnitsService syUnitsService;
    //栏目管理
    //分页
    @RequestMapping("selectWorksheetLike")
    public Map<Object,Object> selectWorksheetLike(int page, int rows, String worksheetno){
        Map<Object,Object> map=new HashMap<>();


        List<AccBusinessadmissibility> list2=new ArrayList<>();
        List<AccWorksheet> list = accWorksheetService.selectByPrimaryKeyLike((page - 1) * rows, page * rows,"%"+worksheetno+"%");
        for (AccWorksheet d : list) {
            System.out.println("来了1"+d);
            for (AccBusinessadmissibility s : accBusinessadmissibilityService.selectAccBusinessadmissibility()) {

                System.out.println("来了2"+s);
                if (s.getBusinessnoticeno().substring(3).equals(d.getWorksheetno().substring(3))){
                    s.setWorksheetno(d.getWorksheetno());
                    System.out.println("来了3");
                    BasAssociatemember asd = basAssociatemember2Service.selectBasAssociatemember23(s.getProcessingunit());
                    s.setBasAssociatemember(asd);
                    System.out.println("来了老弟asd");
                    for (AccWorkorder t : accBusinessadmissibilityService.selectAccWorkorder()) {
                        System.out.println("来了老弟"+t);
                        if (s.getBusinessnoticeno().equals(t.getBusinessnoticeno())) {
                            s.setAccWorkorder(t);
                        }
                        System.out.println("来了4");
                    }
                    //寄件人
                    s.setMan(syEmpService.selectSyEmp(s.getAccWorkorder().getSmallmembernum()).getEmpName());
                    System.out.println("来了5");
                    //收件人
                    System.out.println(syUnitsService.selectSyUnitsAddress(s.getArrivecity()));
                    System.out.println("来了2345");
                    s.setSyUnits(syUnitsService.selectSyUnitsAddress(s.getArrivecity()));
                    s.setPerson( basAssociatemember2Service.selectBasAssociatemember23(syUnitsService.selectSyUnitsAddress(s.getArrivecity()).getId()).getEmpname());

                    System.out.println("来了6");

                    list2.add(s);
                }
            }


        }

        map.put("total",accWorksheetService.selectCount("%"+worksheetno+"%"));

        map.put("rows",list2);
        return map;
    }


    @RequestMapping("updateWorksheet")
    public void updateWorksheet(AccWorksheet record){
        accWorksheetService.updateByPrimaryKey(record);

    }

    @RequestMapping("deleteWorksheet")
    public String deleteWorksheet(short id){
        accWorksheetService.deleteByPrimaryKey(id);
        return "index";
    }

    @RequestMapping("addWorksheet")
    public void addWorksheet(AccWorksheet s){
        accWorksheetService.insert(s);
    }


    //工单号
    @RequestMapping("worksheetnoChange")
    public AccBusinessadmissibility worksheetnoChange(String worksheetno) {
        Map<Object, Object> map = new HashMap<>();

        AccBusinessadmissibility list2 = new AccBusinessadmissibility();
        AccWorksheet d = accWorksheetService.selectAccWorksheetById(worksheetno);
            System.out.println("来了1" + d);
            for (AccBusinessadmissibility s : accBusinessadmissibilityService.selectAccBusinessadmissibility()) {

                System.out.println("来了2" + s);
                if (s.getBusinessnoticeno().substring(3).equals(d.getWorksheetno().substring(3))) {
                    s.setWorksheetno(d.getWorksheetno());
                    System.out.println("来了3");
                    BasAssociatemember asd = basAssociatemember2Service.selectBasAssociatemember23(s.getProcessingunit());
                    s.setBasAssociatemember(asd);
                    System.out.println("来了老弟asd");
                    for (AccWorkorder t : accBusinessadmissibilityService.selectAccWorkorder()) {
                        System.out.println("来了老弟" + t);
                        if (s.getBusinessnoticeno().equals(t.getBusinessnoticeno())) {
                            s.setAccWorkorder(t);
                        }
                        System.out.println("来了4");
                    }
                    //寄件人  s.getAccWorkorder().getSmallmembernum()
                    s.setSyUnits2(syUnitsService.selectSyUnits(s.getAccWorkorder().getPickupunit()));
                    s.setMan(syEmpService.selectSyEmp(s.getAccWorkorder().getSmallmembernum()).getEmpName());
                    System.out.println("来了5");
                    //收件人
                    System.out.println(syUnitsService.selectSyUnitsAddress(s.getArrivecity()));
                    System.out.println("来了2345");
                    s.setSyUnits(syUnitsService.selectSyUnitsAddress(s.getArrivecity()));
                    s.setPerson(basAssociatemember2Service.selectBasAssociatemember23(syUnitsService.selectSyUnitsAddress(s.getArrivecity()).getId()).getEmpname());

                    System.out.println("来了6");

                    list2=s;
                }
            }


            return list2;
        }

}
