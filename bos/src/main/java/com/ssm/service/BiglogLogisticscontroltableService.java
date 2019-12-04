package com.ssm.service;

import com.ssm.model.BiglogLogisticscontroltable;

import java.util.List;

public interface BiglogLogisticscontroltableService {

    List<BiglogLogisticscontroltable> feaa();

    int insert(BiglogLogisticscontroltable record);

    int updateByPrimaryKeySelective(BiglogLogisticscontroltable record);

    int deleteByPrimaryKey(Short id);

    List<BiglogLogisticscontroltable> selectByPrimaryKey(BiglogLogisticscontroltable biglogLogisticscontroltable);
}
