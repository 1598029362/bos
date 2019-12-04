package com.ssm.service.impl;

import com.ssm.mapper.PacStockitemMapper11;
import com.ssm.model.PacStockitem;
import com.ssm.service.PacStockitemService11;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacStockitemServiceImpl11  implements PacStockitemService11 {
    @Autowired
    private PacStockitemMapper11 mapper;
    @Override
    public int insert(PacStockitem record) {
        return mapper.insert(record);
    }
}
