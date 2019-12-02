package com.ssm.service.impl;

import com.ssm.mapper.IaeLineresourceMapper;
import com.ssm.model.IaeLineresource;
import com.ssm.service.IaeLineresourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IaeLineresourceServiceImpl implements IaeLineresourceService {
    @Autowired
    private IaeLineresourceMapper mapper;
    @Override
    public List<IaeLineresource> finAllIaeLineresource() {
        return mapper.finAllIaeLineresource();
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    @Override
    public int insert(IaeLineresource record) {
        return 0;
    }

    @Override
    public int insertSelective(IaeLineresource record) {
        return 0;
    }

    @Override
    public IaeLineresource selectByPrimaryKey(String id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(IaeLineresource record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(IaeLineresource record) {
        return 0;
    }
}
