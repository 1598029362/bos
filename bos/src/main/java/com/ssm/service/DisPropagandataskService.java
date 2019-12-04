package com.ssm.service;

import com.ssm.model.DisPropagandatask;

import java.util.List;

public interface DisPropagandataskService {
    int deleteByPrimaryKey(Short id);

    int insert(DisPropagandatask record);

    List<DisPropagandatask> selectByPrimaryKeyLike(int start, int end, String businessnoticeno, String customcode);

    public int selectCount(String businessnoticeno, String customcode);

    int updateByPrimaryKey(DisPropagandatask record);
}
