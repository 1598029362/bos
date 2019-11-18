package com.ssm.mapper;

import com.ssm.model.SorPackage;

public interface SorPackageMapper {
    int deleteByPrimaryKey(Short id);

    int insert(SorPackage record);

    int insertSelective(SorPackage record);

    SorPackage selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(SorPackage record);

    int updateByPrimaryKey(SorPackage record);
}