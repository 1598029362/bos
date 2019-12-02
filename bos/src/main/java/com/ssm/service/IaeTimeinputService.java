package com.ssm.service;

import com.ssm.model.IaeTimeinput;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IaeTimeinputService {

    List<IaeTimeinput> finAllIaeTimeinput();

    int deleteByPrimaryKey(Short id);

    int insert(IaeTimeinput record);

    int insertSelective(IaeTimeinput record);

    IaeTimeinput selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(IaeTimeinput record);

    int updateByPrimaryKey(IaeTimeinput record);
}