package com.ssm.mapper;

import com.ssm.model.DisPropagandatask;

public interface DisPropagandataskMapper {
    int deleteByPrimaryKey(Short id);

    int insert(DisPropagandatask record);

    int insertSelective(DisPropagandatask record);

    DisPropagandatask selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(DisPropagandatask record);

    int updateByPrimaryKey(DisPropagandatask record);
}