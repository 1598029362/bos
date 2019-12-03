package com.ssm.mapper;

import com.ssm.model.PacStockitem;

public interface PacStockitemMapper {

    int deleteByPrimaryKey(Short id);

    int insert(PacStockitem record);

    int insertSelective(PacStockitem record);

    PacStockitem selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(PacStockitem record);

    int updateByPrimaryKey(PacStockitem record);
}