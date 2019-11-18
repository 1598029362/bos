package com.ssm.service.impl;

import com.ssm.model.Dept;
import com.ssm.mapper.SubstituteMapper;
import com.ssm.model.Substitute;
import com.ssm.service.SubstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubstituteServiceImpl implements SubstituteService {
    @Autowired
    private SubstituteMapper substituteMapper;

    @Override
    public List<Substitute> selectSubstitute() {
        return substituteMapper.selectSubstitute();
    }

    @Override
    public List<Dept> selectDept() {
        return substituteMapper.selectDept();
    }
}
