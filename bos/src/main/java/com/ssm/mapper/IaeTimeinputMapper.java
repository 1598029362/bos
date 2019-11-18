package com.ssm.mapper;

import com.ssm.model.IaeTimeinput;

public interface IaeTimeinputMapper {
    int deleteByPrimaryKey(Short id);

    int insert(IaeTimeinput record);

    int insertSelective(IaeTimeinput record);

    IaeTimeinput selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(IaeTimeinput record);

    int updateByPrimaryKey(IaeTimeinput record);
}