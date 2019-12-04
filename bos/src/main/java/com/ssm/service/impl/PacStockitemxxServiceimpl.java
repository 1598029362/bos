package com.ssm.service.impl;

import com.ssm.mapper.PacStockitemxxMapper;
import com.ssm.model.PacStockitemxx;
import com.ssm.service.PacStockitemxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PacStockitemxxServiceimpl implements PacStockitemxxService {

    @Autowired
    private PacStockitemxxMapper pm;

    @Override
    public List<PacStockitemxx> FeAll() {
        return pm.FeAll();
    }

    @Override
    public List<PacStockitemxx> FellMh(PacStockitemxx pacStockitemxx) {
        return pm.FellMh(pacStockitemxx);
    }
}
