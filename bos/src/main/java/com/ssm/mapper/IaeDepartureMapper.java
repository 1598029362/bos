package com.ssm.mapper;

import com.ssm.model.IaeDeparture;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IaeDepartureMapper {
    @Select("select * from  IAE_Departure")
    List<IaeDeparture> finAllIaeDeparture();

    int deleteByPrimaryKey(String id);

    int insert(IaeDeparture record);

    int insertSelective(IaeDeparture record);

    IaeDeparture selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(IaeDeparture record);

    int updateByPrimaryKey(IaeDeparture record);
}