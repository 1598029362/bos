package com.ssm.service.impl;

import com.ssm.mapper.DisDispatchhistoryMapper;
import com.ssm.model.DisDispatchhistory;
import com.ssm.service.DisDispatchhistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisDispatchhistoryServiceImpl implements DisDispatchhistoryService {
    @Autowired
    private DisDispatchhistoryMapper disDispatchhistoryMapper;

    @Override
    public int deleteByPrimaryKey(Short id) {
        return disDispatchhistoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(DisDispatchhistory record) {
        return disDispatchhistoryMapper.insert(record);
    }


    @Override
    public List<DisDispatchhistory> selectByPrimaryKeyLike(int start, int end, String businessnoticeno, String customcode) {
        return disDispatchhistoryMapper.selectByPrimaryKeyLike(start,end,businessnoticeno,customcode);
    }

    @Override
    public int selectCount(String businessnoticeno, String customcode) {
        return disDispatchhistoryMapper.selectCount(businessnoticeno,customcode);
    }

    @Override
    public int updateByPrimaryKey(DisDispatchhistory record) {
        return disDispatchhistoryMapper.updateByPrimaryKey(record);
    }

}
