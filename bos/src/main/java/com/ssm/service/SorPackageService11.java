package com.ssm.service;

import com.ssm.model.SorPackage;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;


public interface SorPackageService11 {

    List<SorPackage> finAllSorPackage();

    int deleteByPrimaryKey(Short id);

    int insert(SorPackage record);

    int insertSelective(SorPackage record);

    SorPackage selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(SorPackage record);

    int updateByPrimaryKey(SorPackage record);
}