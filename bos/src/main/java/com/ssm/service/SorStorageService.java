package com.ssm.service;

import com.ssm.model.SorStorage;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Date;
import java.util.List;

public interface SorStorageService {
    int finAllSorStorageSize();

    List<SorStorage> findAllSorStorage();


    int deleteByPrimaryKey(Integer id);

    int insert(SorStorage record);



    SorStorage selectByPrimaryKey(Integer id);

   int updateByPrimaryKeySelective(SorStorage record);



      List<SorStorage> selectByPrimaryKeyLike(int start, int end, Integer id, Date acceptdate);

      public int selectCount(Integer id, Date acceptdate);


}