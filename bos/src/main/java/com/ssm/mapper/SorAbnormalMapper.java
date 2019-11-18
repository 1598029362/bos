package com.ssm.mapper;

import com.ssm.model.SorAbnormal;

public interface SorAbnormalMapper {
    int deleteByPrimaryKey(Short id);

    int insert(SorAbnormal record);

    int insertSelective(SorAbnormal record);

    SorAbnormal selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(SorAbnormal record);

    int updateByPrimaryKey(SorAbnormal record);
}