package com.ssm.mapper;

import com.ssm.model.BasBasicarchives;

public interface BasBasicarchivesMapper {
    int deleteByPrimaryKey(Short id);

    int insert(BasBasicarchives record);

    int insertSelective(BasBasicarchives record);

    BasBasicarchives selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(BasBasicarchives record);

    int updateByPrimaryKey(BasBasicarchives record);
}