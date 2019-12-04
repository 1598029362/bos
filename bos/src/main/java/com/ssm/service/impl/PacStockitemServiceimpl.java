package com.ssm.service.impl;

import com.ssm.mapper.PacStockitemMapper;
import com.ssm.model.PacStockitem;
import com.ssm.service.PacStockitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PacStockitemServiceimpl implements PacStockitemService {

    @Autowired
    private PacStockitemMapper pm;

    @Override
    public List<PacStockitem> Fess() {
        return pm.Fess();
    }

    @Override
    public List<PacStockitem> selectByPrimaryKey(PacStockitem pacStockitem) {
        return pm.selectByPrimaryKey(pacStockitem);
    }

    @Override
    public int updateByPrimaryKeySelective(PacStockitem record) {
        return pm.updateByPrimaryKeySelective(record);
    }

    @Override
    public int insert(PacStockitem record) {
        return pm.insert(record);
    }
}
