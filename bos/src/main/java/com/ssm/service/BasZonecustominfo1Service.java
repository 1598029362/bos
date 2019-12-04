package com.ssm.service;

import com.ssm.model.BasPartition;
import com.ssm.model.BasZonecustominfo1;

import java.util.List;

public interface BasZonecustominfo1Service {
    List<BasZonecustominfo1> selectZonecustominfo();

    BasZonecustominfo1 selectZonecustominfoByID(short customcode);

    int selectPartition(BasPartition record);

    int updateByPrimaryKey(BasZonecustominfo1 record);
}
