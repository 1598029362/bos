package com.ssm.service.impl;

import com.ssm.mapper.SY_Emp1Mapper;
import com.ssm.model.SY_Emp;
import com.ssm.service.SY_EmpService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SY_EmpServiceImpl1 implements SY_EmpService1 {
    @Autowired
    private SY_Emp1Mapper mapper;
    @Override
    public List<SY_Emp> emplist() {
        return mapper.emplist();
    }
}
