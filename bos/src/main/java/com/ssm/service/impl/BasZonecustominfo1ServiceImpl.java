package com.ssm.service.impl;

import com.ssm.mapper.BasZonecustominfo1Mapper;
import com.ssm.model.BasPartition;
import com.ssm.model.BasZonecustominfo1;
import com.ssm.service.BasZonecustominfo1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasZonecustominfo1ServiceImpl implements BasZonecustominfo1Service {
    @Autowired
    private BasZonecustominfo1Mapper basZonecustominfoMapper;
    @Override
    public List<BasZonecustominfo1> selectZonecustominfo() {
        return basZonecustominfoMapper.selectZonecustominfo();
    }

    @Override
    public BasZonecustominfo1 selectZonecustominfoByID(short customcode) {
        return basZonecustominfoMapper.selectZonecustominfoByID(customcode);
    }

    @Override
    public int selectPartition(BasPartition record) {
        return basZonecustominfoMapper.selectPartition(record);
    }

    @Override
    public int updateByPrimaryKey(BasZonecustominfo1 record) {
        return basZonecustominfoMapper.updateByPrimaryKey(record);
    }
}
