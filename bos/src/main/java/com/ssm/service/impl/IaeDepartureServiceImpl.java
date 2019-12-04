package com.ssm.service.impl;

import com.ssm.mapper.IaeDepartureMapper;
import com.ssm.model.IaeDeparture;
import com.ssm.service.IaeDepartureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IaeDepartureServiceImpl implements IaeDepartureService {
    @Autowired
    private IaeDepartureMapper mapper;
    @Override
    public List<IaeDeparture> finAllIaeDeparture() {
        return mapper.finAllIaeDeparture();
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    @Override
    public int insert(IaeDeparture record) {
        return 0;
    }

    @Override
    public int insertSelective(IaeDeparture record) {
        return 0;
    }

    @Override
    public IaeDeparture selectByPrimaryKey(String id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(IaeDeparture record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(IaeDeparture record) {
        return 0;
    }
}
