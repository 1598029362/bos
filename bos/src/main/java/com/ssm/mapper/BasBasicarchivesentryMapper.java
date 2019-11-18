package com.ssm.mapper;

import com.ssm.model.BasBasicarchivesentry;

public interface BasBasicarchivesentryMapper {
    int deleteByPrimaryKey(Short id);

    int insert(BasBasicarchivesentry record);

    int insertSelective(BasBasicarchivesentry record);

    BasBasicarchivesentry selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(BasBasicarchivesentry record);

    int updateByPrimaryKey(BasBasicarchivesentry record);
}