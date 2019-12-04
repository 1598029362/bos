package com.ssm.mapper;

import com.ssm.model.IaeArrival;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IaeArrivalMapper {
    @Select("select * from IAE_Arrival")
    List<IaeArrival> findAllIaeArrival();
    int deleteByPrimaryKey(String id);

    int insert(IaeArrival record);

    int insertSelective(IaeArrival record);

    IaeArrival selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(IaeArrival record);

    int updateByPrimaryKey(IaeArrival record);
}