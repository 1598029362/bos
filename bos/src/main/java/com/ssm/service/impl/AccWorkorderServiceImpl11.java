package com.ssm.service.impl;

import com.ssm.mapper.AccWorkorderMapper11;
import com.ssm.model.AccWorkorder;
import com.ssm.service.AccWorkorderService11;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccWorkorderServiceImpl11 implements AccWorkorderService11 {
    @Autowired
    private AccWorkorderMapper11 mapper;
    @Override
    public int deleteByPrimaryKey(Short id) {
        return 0;
    }

    @Override
    public int insert(AccWorkorder record) {
        return 0;
    }

    @Override
    public int insertSelective(AccWorkorder record) {
        return 0;
    }

    @Override
    public AccWorkorder selectByPrimaryKey(String businessnoticeno) {
        return mapper.selectByPrimaryKey(businessnoticeno);
    }

    @Override
    public int updateByPrimaryKeySelective(AccWorkorder record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(AccWorkorder record) {
        return 0;
    }
}
