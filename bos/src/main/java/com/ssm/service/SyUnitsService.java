package com.ssm.service;

import com.ssm.model.SyUnits;

import java.util.List;

public interface SyUnitsService {

    int deleteByPrimaryKey(Short id);

    int insert(SyUnits record);


    List<SyUnits> selectByPrimaryKeyLike(int start, int end, String name);

    public int selectCount(String name);

    int updateByPrimaryKey(SyUnits record);

    List<SyUnits> selectUnits();

     SyUnits selectSyUnits(int operatorid);

    SyUnits selectSyUnitsAddress(String addresss);

}
