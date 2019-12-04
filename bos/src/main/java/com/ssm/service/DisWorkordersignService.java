package com.ssm.service;

import com.ssm.model.DisWorkordersign;

import java.util.List;

public interface DisWorkordersignService {
    int deleteByPrimaryKey(Short id);

    int insert(DisWorkordersign record);

    List<DisWorkordersign> selectByPrimaryKeyLike(int start, int end, String worksheetno);

    public int selectCount(String worksheetno);

    int updateByPrimaryKey(DisWorkordersign record);
}
