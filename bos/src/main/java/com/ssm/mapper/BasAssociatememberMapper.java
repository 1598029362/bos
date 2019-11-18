package com.ssm.mapper;

import com.ssm.model.BasAssociatemember;

public interface BasAssociatememberMapper {
    int deleteByPrimaryKey(Short id);

    int insert(BasAssociatemember record);

    int insertSelective(BasAssociatemember record);

    BasAssociatemember selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(BasAssociatemember record);

    int updateByPrimaryKey(BasAssociatemember record);
}