package com.ssm.service;

import com.ssm.model.SorStorage;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SorStorageService {

    List<SorStorage> findAllSorStorage();


    int deleteByPrimaryKey(Short id);

    int insert(SorStorage record);



    SorStorage selectByPrimaryKey(Short id);

   int updateByPrimaryKeySelective(SorStorage record);


}