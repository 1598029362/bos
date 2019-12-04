package com.ssm.service.impl;

import com.ssm.mapper.BasAssociatemember2Mapper;
import com.ssm.model.BasAssociatemember;
import com.ssm.service.BasAssociatemember2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasAssociatemember2ServiceImpl implements BasAssociatemember2Service {
    @Autowired
    private BasAssociatemember2Mapper basAssociatemember2Mapper;

    @Override
    public BasAssociatemember selectBasAssociatemember23(int subordinateunit) {
        return basAssociatemember2Mapper.selectBasAssociatemember23(subordinateunit);
    }

    @Override
    public BasAssociatemember selectBasAssociatememberEmpNo(String EmpNo) {
        return basAssociatemember2Mapper.selectBasAssociatememberEmpNo(EmpNo);
    }
}
