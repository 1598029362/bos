package com.ssm.mapper;

import com.ssm.model.IaeArrival;

public interface IaeArrivalMapper {
    int deleteByPrimaryKey(String id);

    int insert(IaeArrival record);

    int insertSelective(IaeArrival record);

    IaeArrival selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(IaeArrival record);

    int updateByPrimaryKey(IaeArrival record);
}