package com.ssm.mapper;

import com.ssm.model.SorOutbound;

public interface SorOutboundMapper {
    int deleteByPrimaryKey(Short id);

    int insert(SorOutbound record);

    int insertSelective(SorOutbound record);

    SorOutbound selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(SorOutbound record);

    int updateByPrimaryKey(SorOutbound record);
}