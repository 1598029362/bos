package com.ssm.service.impl;

import com.ssm.mapper.PacStockMapper;
import com.ssm.model.PacStock;
import com.ssm.service.PacStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PacStockServiceimpl implements PacStockService {

    @Autowired
    private PacStockMapper pm;

    @Override
    public List<PacStock> fess() {
        List<PacStock> fess = pm.fess();

        return fess;
    }

    @Override
    public int insert(PacStock record) {
        return pm.insert(record);
    }

    @Override
    public int updateByPrimaryKeySelective(PacStock record) {
        return pm.updateByPrimaryKeySelective(record);
    }

    @Override
    public PacStock selectByPrimaryKey(String warehouseno) {
        return pm.selectByPrimaryKey(warehouseno);
    }

    @Override
    public List<PacStock> selectMhc(PacStock pacStock) {
        return pm.selectMhc(pacStock);
    }
}
