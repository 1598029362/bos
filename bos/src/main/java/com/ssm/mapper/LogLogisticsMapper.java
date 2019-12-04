package com.ssm.mapper;

import com.ssm.model.LogLogistics;

public interface LogLogisticsMapper {
    //物流管理
    int deleteByPrimaryKey(Short id);

    int insert(LogLogistics record);

    int insertSelective(LogLogistics record);

    LogLogistics selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(LogLogistics record);

    int updateByPrimaryKey(LogLogistics record);
}