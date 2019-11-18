package com.ssm.mapper;

import com.ssm.model.PacStock;

public interface PacStockMapper {
    int deleteByPrimaryKey(Short id);

    int insert(PacStock record);

    int insertSelective(PacStock record);

    PacStock selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(PacStock record);

    int updateByPrimaryKey(PacStock record);
}