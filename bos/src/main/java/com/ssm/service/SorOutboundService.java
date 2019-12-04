package com.ssm.service;

import com.ssm.model.SorOutbound;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SorOutboundService {

    List<SorOutbound> findAllSorOutbound();

    short selectSorOutbound();

    int deleteByPrimaryKey(Short id);

     int insert(SorOutbound record);

     int updateByPrimaryKeySelective(SorOutbound record);

}