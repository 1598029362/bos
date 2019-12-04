package com.ssm.controller;

import com.ssm.model.BiglogLogisticscontroltable;
import com.ssm.service.BiglogLogisticscontroltableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BiglogLogisticscontroltableController {

    @Autowired
    private BiglogLogisticscontroltableService bs;

    @RequestMapping("query")
    public List<BiglogLogisticscontroltable> query(){
        List<BiglogLogisticscontroltable> feaa = bs.feaa();

        for (BiglogLogisticscontroltable biglogLogisticscontroltable : feaa) {
            System.out.println(biglogLogisticscontroltable);
        }
        return feaa;
    }

    @RequestMapping("addbig")
    public int addbig(BiglogLogisticscontroltable biglogLogisticscontroltable){
        return bs.insert(biglogLogisticscontroltable);
    }

    @RequestMapping("updatebig")
    public int updatebig(BiglogLogisticscontroltable biglogLogisticscontroltable){
        return bs.updateByPrimaryKeySelective(biglogLogisticscontroltable);
    }

    @RequestMapping("deletebig")
    public int deletebig(short id){
        return  bs.deleteByPrimaryKey(id);
    }

    @RequestMapping("bigMhc")
    public List<BiglogLogisticscontroltable> bigMhc(BiglogLogisticscontroltable biglogLogisticscontroltable){
        return bs.selectByPrimaryKey(biglogLogisticscontroltable);
    }

}
