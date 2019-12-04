package com.ssm.service;

import com.ssm.model.BasZoneinfo;

import java.util.List;

public interface BasZoneinfoService1 {

    List<BasZoneinfo> findAllBasZoneinfo();

    int deleteByPrimaryKey(Short id);

    int insert(BasZoneinfo record);


    int updateByPrimaryKey(BasZoneinfo record);
}