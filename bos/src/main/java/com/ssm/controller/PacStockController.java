package com.ssm.controller;


import com.ssm.model.PacStock;
import com.ssm.service.PacStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
public class PacStockController {

    @Autowired
    private PacStockService ps;

    @RequestMapping("fAll")
    public List<PacStock> fAll(){
        List<PacStock> fess = ps.fess();
        for (PacStock stock : fess) {
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
            simpleDateFormat.format(stock.getDrawertime());
            System.out.println(stock);
        }
        return fess;
    }

    @RequestMapping("addpac")
    public int addpac(PacStock pacStock){
        return ps.insert(pacStock);
    }

    @RequestMapping("updatepac")
    public int updatepac(PacStock pacStock){
        System.out.println("hbu"+pacStock);
        return ps.updateByPrimaryKeySelective(pacStock);
    }

    @RequestMapping("seletemhc")
    public List<PacStock> seletemhc(PacStock pacStock){
        List<PacStock> list=ps.selectMhc(pacStock);
        System.out.println(pacStock);
        for (PacStock stock : list) {
            System.out.println(stock);
        }
        return list;
    }


    @RequestMapping("fAll1")
    public List<PacStock> fAll1(){
        List<PacStock> fess = ps.fess();
        for (PacStock stock : fess) {
            System.out.println(stock);
        }
        return fess;
    }


}
