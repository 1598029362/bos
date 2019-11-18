package com.ssm.mapper;

import com.ssm.model.AccWorkorder;

public interface AccWorkorderMapper {
    int deleteByPrimaryKey(Short id);

    int insert(AccWorkorder record);

    int insertSelective(AccWorkorder record);

    AccWorkorder selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(AccWorkorder record);

    int updateByPrimaryKey(AccWorkorder record);
}