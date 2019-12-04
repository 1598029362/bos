package com.ssm.controller;

import com.ssm.model.PacStockitemxx;
import com.ssm.service.PacStockitemxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PacStockitemxxController {

    @Autowired
    private PacStockitemxxService ps;

    @RequestMapping("XXfell")
    public List<PacStockitemxx> XXfell(){
        List<PacStockitemxx> pacStockitemxxes = ps.FeAll();
        for (PacStockitemxx pacStockitemxx : pacStockitemxxes) {
            System.out.println(pacStockitemxx);
        }
        return pacStockitemxxes;
    }


    @RequestMapping("MHC")
    public List<PacStockitemxx> MHC(PacStockitemxx pacStockitemxx){

        return ps.FellMh(pacStockitemxx);
    }

}
