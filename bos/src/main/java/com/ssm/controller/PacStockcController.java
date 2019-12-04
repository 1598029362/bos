package com.ssm.controller;

import com.ssm.model.PacStockc;
import com.ssm.service.PacStockcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PacStockcController {

    @Autowired
    private PacStockcService pss;

    @RequestMapping("stockcfAll")
    public List<PacStockc> stockcfAll(){
        List<PacStockc> pacStockcs = pss.fAll();
        for (PacStockc pacStockc : pacStockcs) {
            System.out.println(pacStockc);
        }
        return pacStockcs;
    }

    @RequestMapping("stockcadd")
    public int stockcadd(PacStockc pacStockc){
        return pss.insert(pacStockc);
    }

    @RequestMapping("stocckcupdate")
    public int stocckcupdate(PacStockc pacStockc){
        return pss.updatekc(pacStockc);
    }


    @RequestMapping("stockcMhc")
    public List<PacStockc> stockcMhc(PacStockc p){
        return pss.selectid(p);
    }

}
