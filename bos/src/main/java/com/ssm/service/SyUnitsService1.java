package com.ssm.service;

import com.ssm.model.SyUnits;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SyUnitsService1 {

    List<SyUnits> findAllSyUnits();

    int deleteByPrimaryKey(Short id);

    int insert(SyUnits record);

    int insertSelective(SyUnits record);

    SyUnits selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(SyUnits record);

    int updateByPrimaryKey(SyUnits record);
}