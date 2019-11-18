package com.ssm.mapper;

import com.ssm.model.BasZonecustominfo;

public interface BasZonecustominfoMapper {
    int deleteByPrimaryKey(Short customcode);

    int insert(BasZonecustominfo record);

    int insertSelective(BasZonecustominfo record);

    BasZonecustominfo selectByPrimaryKey(Short customcode);

    int updateByPrimaryKeySelective(BasZonecustominfo record);

    int updateByPrimaryKey(BasZonecustominfo record);
}