package com.ssm.mapper;

import com.ssm.model.SyUnits;

public interface SyUnitsMapper {
    int deleteByPrimaryKey(Short id);

    int insert(SyUnits record);

    int insertSelective(SyUnits record);

    SyUnits selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(SyUnits record);

    int updateByPrimaryKey(SyUnits record);
}