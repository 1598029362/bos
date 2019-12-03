package com.ssm.service.impl;

import com.ssm.mapper.SorPackageMapper11;
import com.ssm.model.SorPackage;
import com.ssm.service.SorPackageService11;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SorPackageServiceImpl11 implements SorPackageService11 {
   @Autowired
   private SorPackageMapper11 mapper;

    @Override
    public List<SorPackage> finAllSorPackage() {
        return mapper.finAllSorPackage();
    }

    @Override
    public int deleteByPrimaryKey(Short id) {
        return 0;
    }

    @Override
    public int insert(SorPackage record) {
        return 0;
    }

    @Override
    public int insertSelective(SorPackage record) {
        return 0;
    }

    @Override
    public SorPackage selectByPrimaryKey(Short id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(SorPackage record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SorPackage record) {
        return 0;
    }
}