package com.ssm.mapper;

import com.ssm.model.PacPackaging;

public interface PacPackagingMapper {
    int deleteByPrimaryKey(Short id);

    int insert(PacPackaging record);

    int insertSelective(PacPackaging record);

    PacPackaging selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(PacPackaging record);

    int updateByPrimaryKey(PacPackaging record);
}