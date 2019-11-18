package com.ssm.mapper;

import com.ssm.model.BasArea;

public interface BasAreaMapper {
    int deleteByPrimaryKey(Short id);

    int insert(BasArea record);

    int insertSelective(BasArea record);

    BasArea selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(BasArea record);

    int updateByPrimaryKey(BasArea record);
}