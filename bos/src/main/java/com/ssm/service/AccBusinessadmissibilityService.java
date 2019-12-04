package com.ssm.service;

import com.ssm.model.AccBusinessadmissibility;
import com.ssm.model.AccWorkorder;

import java.util.List;

public interface AccBusinessadmissibilityService {
    int deleteByPrimaryKey(String businessnoticeno);

    int insert(AccBusinessadmissibility record);


    List<AccBusinessadmissibility> selectByPrimaryKeyLike(int start, int end, String businessnoticeno, String customcode);

    public int selectCount(String businessnoticeno, String customcode);

    public int selectMax();

    int updateByPrimaryKey(AccBusinessadmissibility record);

    public List<AccWorkorder> selectAccWorkorder();

    int updateByPrimaryKey2(String pickupaddress, String businessnoticeno);

    public List<AccBusinessadmissibility> selectAccBusinessadmissibility();

}
