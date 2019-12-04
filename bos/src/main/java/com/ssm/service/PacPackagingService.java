package com.ssm.service;

import com.ssm.model.PacPackaging;

import java.util.List;

public interface PacPackagingService {

    List<PacPackaging> fess();

    int insert(PacPackaging record);

    int updateByPrimaryKeySelective(PacPackaging record);

    int deleteByPrimaryKey(Short id);

    List<PacPackaging> selectByPrimaryKey(PacPackaging packaging);

}
