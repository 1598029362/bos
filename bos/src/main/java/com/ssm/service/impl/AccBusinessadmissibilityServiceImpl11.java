package com.ssm.service.impl;

import com.ssm.mapper.AccBusinessadmissibilityMapper11;
import com.ssm.model.AccBusinessadmissibility;
import com.ssm.service.AccBusinessadmissibilityService11;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccBusinessadmissibilityServiceImpl11 implements AccBusinessadmissibilityService11 {
    @Autowired
    private AccBusinessadmissibilityMapper11 mapper;
    @Override
    public int deleteByPrimaryKey(Short id) {
        return 0;
    }

    @Override
    public int insert(AccBusinessadmissibility record) {
        return 0;
    }

    @Override
    public int insertSelective(AccBusinessadmissibility record) {
        return 0;
    }

    @Override
    public AccBusinessadmissibility selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(AccBusinessadmissibility record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(AccBusinessadmissibility record) {
        return 0;
    }
}
