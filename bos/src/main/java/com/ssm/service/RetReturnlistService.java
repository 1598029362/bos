package com.ssm.service;

import com.ssm.model.RetReturnlist;

import java.util.List;

public interface RetReturnlistService {
    int deleteByPrimaryKey(Short id);

    int insert(RetReturnlist record);

    List<RetReturnlist> selectByPrimaryKeyLike(int start, int end, String businessnoticeno, String customcode, String apreturnstatus);

    public int selectCount(String businessnoticeno, String customcode, String apreturnstatus);

    int updateByPrimaryKey(RetReturnlist record);

    public int selectMax();


    //申请返货
    List<RetReturnlist> selectByPrimaryKeyLike2(int start, int end, String businessnoticeno, String customcode, String apreturnstatus);

    public int selectCount2(String businessnoticeno, String customcode, String apreturnstatus);

    int update(RetReturnlist record);

    int update2(RetReturnlist record);
}
