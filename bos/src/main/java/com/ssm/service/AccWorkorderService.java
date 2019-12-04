package com.ssm.service;

import com.ssm.model.AccWorkorder;

import java.util.List;

public interface AccWorkorderService {
    int deleteByPrimaryKey(String businessnoticeno);

    int insert(AccWorkorder record);

    List<AccWorkorder> selectByPrimaryKeyLike(int start, int end, String businessnoticeno, String customcode);

    public int selectCount(String businessnoticeno, String customcode);

    int updateByPrimaryKey(AccWorkorder record);

    //调度
    int updateByPrimaryKey2(int typeName, String businessnoticeno);

    //单位 更改单位 清除小件员编号
    int updateByPrimaryKey3(int typeName, String businessnoticeno);

    AccWorkorder selectAccWorkorder(String businessnoticeno);
}
