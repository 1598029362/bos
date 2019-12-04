package com.ssm.service.impl;

import com.ssm.mapper.SyUnitsMapper;
import com.ssm.model.SyUnits;
import com.ssm.service.SyUnitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SyUnitsServiceImpl implements SyUnitsService {
    @Autowired
    private SyUnitsMapper syUnitsMapper;

    @Override
    public int deleteByPrimaryKey(Short id) {
        return syUnitsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SyUnits record) {
        return syUnitsMapper.insert(record);
    }

    @Override
    public List<SyUnits> selectByPrimaryKeyLike(int start, int end, String name) {
        return syUnitsMapper.selectByPrimaryKeyLike(start,end,name);
    }

    @Override
    public int selectCount(String name) {
        return syUnitsMapper.selectCount(name);
    }

    @Override
    public int updateByPrimaryKey(SyUnits record) {
        return syUnitsMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<SyUnits> selectUnits() {
        return syUnitsMapper.selectUnits();
    }

    @Override
    public SyUnits selectSyUnits(int operatorid) {
        return syUnitsMapper.selectSyUnits(operatorid);
    }

    @Override
    public SyUnits selectSyUnitsAddress(String addresss) {
        return syUnitsMapper.selectSyUnitsAddress(addresss);
    }
}
