package com.ssm.service;

import com.ssm.model.DisDispatchhistory;

import java.util.List;

public interface DisDispatchhistoryService {
    int deleteByPrimaryKey(Short id);

    int insert(DisDispatchhistory record);

    List<DisDispatchhistory> selectByPrimaryKeyLike(int start, int end, String businessnoticeno, String customcode);

    public int selectCount(String businessnoticeno, String customcode);

    int updateByPrimaryKey(DisDispatchhistory record);
}
