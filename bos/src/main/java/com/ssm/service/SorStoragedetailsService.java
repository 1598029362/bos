package com.ssm.service;

import com.ssm.model.SorStoragedetails;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;


public interface SorStoragedetailsService {

    List<SorStoragedetails> findAllSorStoragedetails();


    int deleteByPrimaryKey(Integer id);

    int insert(SorStoragedetails record);


     int update(SorStoragedetails record);

    int deleteByLike(String packageid);

    List<SorStoragedetails> selectSorStoragedetailsById(String packageid);








}