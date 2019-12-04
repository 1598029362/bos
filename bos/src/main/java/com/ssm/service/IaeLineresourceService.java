package com.ssm.service;

import com.ssm.model.IaeLineresource;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IaeLineresourceService {

    List<IaeLineresource> finAllIaeLineresource();

    int deleteByPrimaryKey(String id);

    int insert(IaeLineresource record);

    int insertSelective(IaeLineresource record);

    IaeLineresource selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(IaeLineresource record);

    int updateByPrimaryKey(IaeLineresource record);
}