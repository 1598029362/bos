package com.ssm.mapper;

import com.ssm.model.LogLogisticstransfer;

public interface LogLogisticstransferMapper {
    int deleteByPrimaryKey(Short id);

    int insert(LogLogisticstransfer record);

    int insertSelective(LogLogisticstransfer record);

    LogLogisticstransfer selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(LogLogisticstransfer record);

    int updateByPrimaryKey(LogLogisticstransfer record);
}