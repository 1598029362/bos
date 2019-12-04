package com.ssm.service.impl;

import com.ssm.mapper.AccWorkorderMapper;
import com.ssm.model.AccWorkorder;
import com.ssm.service.AccWorkorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccWorkorderServiceImpl implements AccWorkorderService {
    @Autowired
    private AccWorkorderMapper accWorkorderMapper;

    @Override
    public int deleteByPrimaryKey(String businessnoticeno) {
        return accWorkorderMapper.deleteByPrimaryKey(businessnoticeno);
    }

    @Override
    public int insert(AccWorkorder record) {
        return accWorkorderMapper.insert(record);
    }

    @Override
    public List<AccWorkorder> selectByPrimaryKeyLike(int start, int end, String businessnoticeno, String customcode) {
        return accWorkorderMapper.selectByPrimaryKeyLike(start,end,businessnoticeno,customcode);
    }

    @Override
    public int selectCount(String businessnoticeno, String customcode) {
        return accWorkorderMapper.selectCount(businessnoticeno,customcode);
    }

    @Override
    public int updateByPrimaryKey(AccWorkorder record) {
        return accWorkorderMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKey2(int typeName, String businessnoticeno) {
        return accWorkorderMapper.updateByPrimaryKey2(typeName, businessnoticeno);
    }

    @Override
    public int updateByPrimaryKey3(int typeName, String businessnoticeno) {
        return accWorkorderMapper.updateByPrimaryKey3(typeName, businessnoticeno);
    }

    @Override
    public AccWorkorder selectAccWorkorder(String businessnoticeno) {
        return accWorkorderMapper.selectAccWorkorder(businessnoticeno);
    }
}
