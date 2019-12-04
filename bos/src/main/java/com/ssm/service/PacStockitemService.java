package com.ssm.service;

import com.ssm.model.PacStockitem;

import java.util.List;

public interface PacStockitemService {

    List<PacStockitem> Fess();

    List<PacStockitem> selectByPrimaryKey(PacStockitem pacStockitem);

    int updateByPrimaryKeySelective(PacStockitem record);

    int insert(PacStockitem record);

}
