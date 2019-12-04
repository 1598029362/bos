package com.ssm.controller;

import com.ssm.model.PacStockitem;
import com.ssm.service.PacStockitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PacStockitemController {

    @Autowired
    private PacStockitemService ps;

    @RequestMapping("Pac")
    public List<PacStockitem> Pac(){
        List<PacStockitem> fess = ps.Fess();
        for (PacStockitem pacStockitem : fess) {
            System.out.println(pacStockitem.getPacStock());
        }
        return fess;
    }

    @RequestMapping("KzQuery")
    public List<PacStockitem> KzQuery(){

        List<PacStockitem> fess1 = ps.Fess();
        for (PacStockitem pacStockitem : fess1) {
            System.out.println(pacStockitem);
        }
        return fess1;
    }

    @RequestMapping("pacstockitemsMhc")
    public List<PacStockitem> pacstockitemsMhc(PacStockitem pacStockitem){
        return ps.selectByPrimaryKey(pacStockitem);
    }

    @RequestMapping("updatekitem")
    public int updatekitem(PacStockitem pacStockitem){
        return ps.updateByPrimaryKeySelective(pacStockitem);
    }

    @RequestMapping("addkitem")
    public int addkitem(PacStockitem pacStockitem){
        return ps.insert(pacStockitem);
    }

}
