package com.ssm.service.impl;

import com.ssm.mapper.SyUnitsMapper1;
import com.ssm.model.SyUnits;
import com.ssm.service.SyUnitsService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SyUnitsServiceImpl1 implements SyUnitsService1 {
    @Autowired
    private SyUnitsMapper1 mapper;

    @Override
    public List<SyUnits> findAllSyUnits() {
        return mapper.findAllSyUnits();
    }

    @Override
    public int deleteByPrimaryKey(Short id) {
        return 0;
    }

    @Override
    public int insert(SyUnits record) {
        return 0;
    }

    @Override
    public int insertSelective(SyUnits record) {
        return 0;
    }

    @Override
    public SyUnits selectByPrimaryKey(Short id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(SyUnits record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SyUnits record) {
        return 0;
    }
}
