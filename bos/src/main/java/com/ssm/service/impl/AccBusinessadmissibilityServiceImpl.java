package com.ssm.service.impl;

import com.ssm.mapper.AccBusinessadmissibilityMapper;
import com.ssm.model.AccBusinessadmissibility;
import com.ssm.model.AccWorkorder;
import com.ssm.service.AccBusinessadmissibilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccBusinessadmissibilityServiceImpl implements AccBusinessadmissibilityService {
    @Autowired
    private AccBusinessadmissibilityMapper accBusinessadmissibilityMapper;

    @Override
    public int deleteByPrimaryKey(String businessnoticeno) {
        return accBusinessadmissibilityMapper.deleteByPrimaryKey(businessnoticeno);
    }

    @Override
    public int insert(AccBusinessadmissibility record) {
        return accBusinessadmissibilityMapper.insert(record);
    }

    @Override
    public List<AccBusinessadmissibility> selectByPrimaryKeyLike(int start, int end,String businessnoticeno,String customcode) {
        return accBusinessadmissibilityMapper.selectByPrimaryKeyLike(start,end,businessnoticeno,customcode);
    }

    @Override
    public int selectCount(String businessnoticeno,String customcode) {
        return accBusinessadmissibilityMapper.selectCount(businessnoticeno,customcode);
    }

    @Override
    public int selectMax() {
        return accBusinessadmissibilityMapper.selectMax();
    }

    @Override
    public int updateByPrimaryKey(AccBusinessadmissibility record) {
        return accBusinessadmissibilityMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<AccWorkorder> selectAccWorkorder() {
        return accBusinessadmissibilityMapper.selectAccWorkorder();
    }

    @Override
    public int updateByPrimaryKey2(String pickupaddress, String businessnoticeno) {
        return accBusinessadmissibilityMapper.updateByPrimaryKey2(pickupaddress, businessnoticeno);
    }

    @Override
    public List<AccBusinessadmissibility> selectAccBusinessadmissibility() {
        return accBusinessadmissibilityMapper.selectAccBusinessadmissibility();
    }


}
