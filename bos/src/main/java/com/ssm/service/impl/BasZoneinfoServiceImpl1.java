package com.ssm.service.impl;

import com.ssm.mapper.BasZoneinfoMapper1;
import com.ssm.model.BasZoneinfo;
import com.ssm.service.BasZoneinfoService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasZoneinfoServiceImpl1 implements BasZoneinfoService1 {
     @Autowired
    private    BasZoneinfoMapper1 mapper;
    @Override
    public List<BasZoneinfo> findAllBasZoneinfo() {
        return mapper.findAllBasZoneinfo();
    }

    @Override
    public int deleteByPrimaryKey(Short id) {
        return 0;
    }

    @Override
    public int insert(BasZoneinfo record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(BasZoneinfo record) {
        return 0;
    }
}
