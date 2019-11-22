package com.ssm.service;

import com.ssm.model.SorStorage;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SorStorageService {
    int finAllSorStorageSize();

    List<SorStorage> findAllSorStorage();


    int deleteByPrimaryKey(long id);

    int insert(SorStorage record);



    SorStorage selectByPrimaryKey(Short id);

   int updateByPrimaryKeySelective(SorStorage record);


}