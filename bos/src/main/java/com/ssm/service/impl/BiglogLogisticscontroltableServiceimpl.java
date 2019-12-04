package com.ssm.service.impl;

import com.ssm.mapper.BiglogLogisticscontroltableMapper;
import com.ssm.model.BiglogLogisticscontroltable;
import com.ssm.service.BiglogLogisticscontroltableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BiglogLogisticscontroltableServiceimpl implements BiglogLogisticscontroltableService {

    @Autowired
    private BiglogLogisticscontroltableMapper bm;

    @Override
    public List<BiglogLogisticscontroltable> feaa() {
        return bm.feaa();
    }

    @Override
    public int insert(BiglogLogisticscontroltable record) {
        return bm.insert(record);
    }

    @Override
    public int updateByPrimaryKeySelective(BiglogLogisticscontroltable record) {
        return bm.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Short id) {
        return bm.deleteByPrimaryKey(id);
    }

    @Override
    public List<BiglogLogisticscontroltable> selectByPrimaryKey(BiglogLogisticscontroltable biglogLogisticscontroltable) {
        return bm.selectByPrimaryKey(biglogLogisticscontroltable);
    }
}
