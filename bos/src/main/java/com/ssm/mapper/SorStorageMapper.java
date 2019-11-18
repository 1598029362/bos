package com.ssm.mapper;

import com.ssm.model.SorStorage;

public interface SorStorageMapper {
    int deleteByPrimaryKey(Short id);

    int insert(SorStorage record);

    int insertSelective(SorStorage record);

    SorStorage selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(SorStorage record);

    int updateByPrimaryKey(SorStorage record);
}