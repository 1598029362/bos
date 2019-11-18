package com.ssm.mapper;

import com.ssm.model.AccBusinessadmissibility;

public interface AccBusinessadmissibilityMapper {
    int deleteByPrimaryKey(Short id);

    int insert(AccBusinessadmissibility record);

    int insertSelective(AccBusinessadmissibility record);

    AccBusinessadmissibility selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(AccBusinessadmissibility record);

    int updateByPrimaryKey(AccBusinessadmissibility record);
}