package com.ssm.controller;

import com.ssm.model.PacPackaging;
import com.ssm.service.PacPackagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
public class PacPackagingController {

    @Autowired
    private PacPackagingService pps;

    @RequestMapping("paxpaxckagingall")
    public List<PacPackaging> paxpaxckagingall(){
        List<PacPackaging> fess = pps.fess();
        for (PacPackaging pacPackaging : fess) {
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
            simpleDateFormat.format(pacPackaging.getOperationtime());
            simpleDateFormat.format(pacPackaging.getInvalidatejobint());
            simpleDateFormat.format(pacPackaging.getInvalidatetime());
            System.out.println(pacPackaging);
        }

        return fess;
    }

    @RequestMapping("packagingadd")
    public int packagingadd(PacPackaging packaging){
       return pps.insert(packaging);
    }

    @RequestMapping("packagingupdate")
    public int packagingupdate(PacPackaging packaging){
        return pps.updateByPrimaryKeySelective(packaging);
    }

    @RequestMapping("packagingdelete")
    public int packagingdelete(short id){
        return pps.deleteByPrimaryKey(id);
    }

    @RequestMapping("MhcSelect")
    public List<PacPackaging> MhcSelect(PacPackaging packaging){
        return pps.selectByPrimaryKey(packaging);
    }

}
