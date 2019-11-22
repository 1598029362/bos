package com.ssm.mapper;

import com.ssm.model.SyUnits;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SyUnitsMapper1 {
    @Select("select * from SY_Units")
    List<SyUnits> findAllSyUnits();

    int deleteByPrimaryKey(Short id);

    int insert(SyUnits record);

    int insertSelective(SyUnits record);

    SyUnits selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(SyUnits record);

    int updateByPrimaryKey(SyUnits record);
}