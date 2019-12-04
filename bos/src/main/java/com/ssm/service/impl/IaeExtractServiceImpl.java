package com.ssm.service.impl;

import com.ssm.mapper.IaeExtractMapper;
import com.ssm.model.IaeExtract;
import com.ssm.service.IaeExtractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IaeExtractServiceImpl implements IaeExtractService {
    @Autowired
    private IaeExtractMapper mapper;
    @Override
    public List<IaeExtract> finAllIaeExtract() {
        return mapper.finAllIaeExtract();
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    @Override
    public int insert(IaeExtract record) {
        return 0;
    }

    @Override
    public int insertSelective(IaeExtract record) {
        return 0;
    }

    @Override
    public IaeExtract selectByPrimaryKey(String id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(IaeExtract record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(IaeExtract record) {
        return 0;
    }
}
