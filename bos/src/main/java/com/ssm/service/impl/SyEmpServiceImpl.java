package com.ssm.service.impl;

import com.ssm.mapper.SyEmpMapper;
import com.ssm.model.SyEmp;
import com.ssm.service.SyEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SyEmpServiceImpl implements SyEmpService {
    @Autowired
    private SyEmpMapper syEmpMapper;

    @Override
    public int deleteByPrimaryKey(Short id) {
        return syEmpMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SyEmp record) {
        return syEmpMapper.insert(record);
    }

    @Override
    public List<SyEmp> selectByPrimaryKeyLike(int start, int end, String name,String disabled) {
        return syEmpMapper.selectByPrimaryKeyLike(start,end,name,disabled);
    }

    @Override
    public int selectCount(String name,String disabled) {
        return syEmpMapper.selectCount(name,disabled);
    }

    @Override
    public int updateByPrimaryKey(SyEmp record) {
        return syEmpMapper.updateByPrimaryKey(record);
    }
}
