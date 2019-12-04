package com.ssm.service;

import com.ssm.model.IaeExtract;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IaeExtractService {


    List<IaeExtract> finAllIaeExtract();

    int deleteByPrimaryKey(String id);

    int insert(IaeExtract record);

    int insertSelective(IaeExtract record);

    IaeExtract selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(IaeExtract record);

    int updateByPrimaryKey(IaeExtract record);
}