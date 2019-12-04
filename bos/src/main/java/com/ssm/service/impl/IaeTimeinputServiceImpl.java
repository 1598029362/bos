package com.ssm.service.impl;

import com.ssm.mapper.IaeTimeinputMapper;
import com.ssm.model.IaeTimeinput;
import com.ssm.service.IaeTimeinputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IaeTimeinputServiceImpl implements IaeTimeinputService {
    @Autowired
    private IaeTimeinputMapper mapper;

    @Override
    public List<IaeTimeinput> finAllIaeTimeinput() {
        return mapper.finAllIaeTimeinput();
    }

    @Override
    public int deleteByPrimaryKey(Short id) {
        return 0;
    }

    @Override
    public int insert(IaeTimeinput record) {
        return 0;
    }

    @Override
    public int insertSelective(IaeTimeinput record) {
        return 0;
    }

    @Override
    public IaeTimeinput selectByPrimaryKey(Short id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(IaeTimeinput record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(IaeTimeinput record) {
        return 0;
    }
}
