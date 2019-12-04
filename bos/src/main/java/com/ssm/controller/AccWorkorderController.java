package com.ssm.controller;

import com.ssm.model.AccWorkorder;
import com.ssm.model.SyUnits;
import com.ssm.service.AccBusinessadmissibilityService;
import com.ssm.service.AccWorkorderService;
import com.ssm.service.SyUnitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AccWorkorderController {
    @Autowired
    private AccWorkorderService accWorkorderService;

    @Autowired
    private SyUnitsService syUnitsService;

    @Autowired
    private AccBusinessadmissibilityService accBusinessadmissibilityService;



    //栏目管理
    //分页
    @RequestMapping("selectWorkorderLike")
    public Map<Object,Object> selectWorkorderLike(int page, int rows, String Workordernoticeno, String customcode){
        Map<Object,Object> map=new HashMap<>();
        map.put("total",accWorkorderService.selectCount("%"+Workordernoticeno+"%","%"+customcode+"%"));
        List<AccWorkorder> list = accWorkorderService.selectByPrimaryKeyLike((page - 1) * rows, page * rows,"%"+Workordernoticeno+"%","%"+customcode+"%");
        map.put("rows",list);
        return map;
    }


    @RequestMapping("updateWorkorder")
    public void updateWorkorder(AccWorkorder record){
        accWorkorderService.updateByPrimaryKey(record);

    }


    @RequestMapping("deleteWorkorder")
    public String deleteWorkorder(String  businessnoticeno){
        accWorkorderService.deleteByPrimaryKey(businessnoticeno);
        return "index";
    }

    @RequestMapping("addWorkorder")
    public void addWorkorder(AccWorkorder s){
        accWorkorderService.insert(s);
    }

    //调度
    @RequestMapping("updateWorkorder2")
    public void updateWorkorder2(int typeId,int typeName, String businessnoticeno,String pickupaddress) {
        System.out.println(pickupaddress);
        if(typeId==1){//小件员  更改小件员编号和工单状态 已通知
            accWorkorderService.updateByPrimaryKey2(typeName, businessnoticeno);

        }else {//单位 （更改账号 继续转单）
            //更改单位 清除小件员编号
            accWorkorderService.updateByPrimaryKey3(typeName, businessnoticeno);

            //修改业务通知单的地址
            String ads =pickupaddress;
            System.out.println(pickupaddress);
            int i = ads.indexOf("市");
            int j = ads.indexOf("省");
            int k = ads.indexOf("区");
            int q = ads.indexOf("县");

            String county="";
            if(j!=-1){//省
                SyUnits units = syUnitsService.selectSyUnits(typeName);

                if(k!=-1){//区
                    county =units.getAddress()+ ads.substring(k+1);
                }else{
                    county =units.getAddress()+ ads.substring(q+1);
                }
                System.out.println(county+"--------");
            }
            System.out.println(county+"count");
            //修改业务通知单的地址
            accBusinessadmissibilityService.updateByPrimaryKey2(county,businessnoticeno);
        }
    }
}
