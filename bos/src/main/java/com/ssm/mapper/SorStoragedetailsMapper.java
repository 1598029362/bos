package com.ssm.mapper;

import com.ssm.model.SorStoragedetails;

public interface SorStoragedetailsMapper {
    int deleteByPrimaryKey(Short id);

    int insert(SorStoragedetails record);

    int insertSelective(SorStoragedetails record);

    SorStoragedetails selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(SorStoragedetails record);

    int updateByPrimaryKey(SorStoragedetails record);
}