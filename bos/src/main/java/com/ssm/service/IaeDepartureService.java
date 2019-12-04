package com.ssm.service;

import com.ssm.model.IaeDeparture;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IaeDepartureService {

    List<IaeDeparture> finAllIaeDeparture();

    int deleteByPrimaryKey(String id);

    int insert(IaeDeparture record);

    int insertSelective(IaeDeparture record);

    IaeDeparture selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(IaeDeparture record);

    int updateByPrimaryKey(IaeDeparture record);
}