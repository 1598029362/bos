package com.ssm.mapper;

import com.ssm.model.BasZoneinfo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BasZoneinfoMapper1 {

    @Select("select * from BAS_ZoneInfo")
    List<BasZoneinfo> findAllBasZoneinfo();

    int deleteByPrimaryKey(Short id);

    int insert(BasZoneinfo record);


    int updateByPrimaryKey(BasZoneinfo record);
}