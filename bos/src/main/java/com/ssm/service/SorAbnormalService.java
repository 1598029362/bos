package com.ssm.service;

import com.ssm.model.SorAbnormal;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SorAbnormalService {

    int deleteByPrimaryKey(Short id);

    int insert(SorAbnormal record);

    int updateByPrimaryKey(SorAbnormal record);

    List<SorAbnormal> findAllSOR_Abnormal();

}