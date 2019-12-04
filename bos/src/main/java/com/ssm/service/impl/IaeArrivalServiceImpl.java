package com.ssm.service.impl;

import com.ssm.mapper.IaeArrivalMapper;
import com.ssm.model.IaeArrival;
import com.ssm.service.IaeArrivalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IaeArrivalServiceImpl implements IaeArrivalService {
    @Autowired
    private IaeArrivalMapper mapper;
    @Override
    public List<IaeArrival> findAllIaeArrival() {
        return mapper.findAllIaeArrival();
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    @Override
    public int insert(IaeArrival record) {
        return 0;
    }

    @Override
    public int insertSelective(IaeArrival record) {
        return 0;
    }

    @Override
    public IaeArrival selectByPrimaryKey(String id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(IaeArrival record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(IaeArrival record) {
        return 0;
    }
}
