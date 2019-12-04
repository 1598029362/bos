package com.ssm.service.impl;

import com.ssm.mapper.PacStockcMapper;
import com.ssm.model.PacStockc;
import com.ssm.service.PacStockcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PacStockcServiceimpl implements PacStockcService {

    @Autowired
    private PacStockcMapper psm;

    @Override
    public List<PacStockc> fAll() {
        return psm.fAll();
    }

    @Override
    public int insert(PacStockc pacStockc) {
        return psm.insert(pacStockc);
    }

    @Override
    public int updatekc(PacStockc pacStockc) {
        return psm.updatekc(pacStockc);
    }

    @Override
    public List<PacStockc> selectid(PacStockc pacStock) {
        return psm.selectid(pacStock);
    }
}
