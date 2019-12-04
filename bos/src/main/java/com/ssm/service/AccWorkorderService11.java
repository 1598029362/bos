package com.ssm.service;

import com.ssm.model.AccWorkorder;
import org.apache.ibatis.annotations.Select;

public interface AccWorkorderService11 {
    int deleteByPrimaryKey(Short id);

    int insert(AccWorkorder record);

    int insertSelective(AccWorkorder record);

    AccWorkorder selectByPrimaryKey(String businessnoticeno);

    int updateByPrimaryKeySelective(AccWorkorder record);

    int updateByPrimaryKey(AccWorkorder record);
}