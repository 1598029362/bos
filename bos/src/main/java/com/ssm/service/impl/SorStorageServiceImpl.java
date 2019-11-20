package com.ssm.service.impl;

import com.ssm.mapper.SorStorageMapper;
import com.ssm.model.SorStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SorStorageServiceImpl implements com.ssm.service.SorStorageService {
    @Autowired
    private SorStorageMapper mapper;

    @Override
    public List<SorStorage> findAllSorStorage() {
        return mapper.findAllSorStorage();
    }

    @Override
    public int deleteByPrimaryKey(Short id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SorStorage record) {
        return mapper.insert(record);
    }

    @Override
    public SorStorage selectByPrimaryKey(Short id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SorStorage record) {
        return mapper.updateByPrimaryKeySelective(record);
    }
}
