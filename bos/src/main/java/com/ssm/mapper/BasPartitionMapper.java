package com.ssm.mapper;

import com.ssm.model.BasPartition;

public interface BasPartitionMapper {
    int deleteByPrimaryKey(Short id);

    int insert(BasPartition record);

    int insertSelective(BasPartition record);

    BasPartition selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(BasPartition record);

    int updateByPrimaryKey(BasPartition record);
}