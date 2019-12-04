package com.ssm.service.impl;

import com.ssm.mapper.DisWorkordersignMapper;
import com.ssm.model.DisWorkordersign;
import com.ssm.service.DisWorkordersignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisWorkordersignServiceImpl implements DisWorkordersignService {
    @Autowired
    private DisWorkordersignMapper disWorkordersignMapper;

    @Override
    public int deleteByPrimaryKey(Short id) {
        return disWorkordersignMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(DisWorkordersign record) {
        return disWorkordersignMapper.insert(record);
    }

    @Override
    public List<DisWorkordersign> selectByPrimaryKeyLike(int start, int end, String worksheetno) {
        return disWorkordersignMapper.selectByPrimaryKeyLike(start,end,worksheetno);
    }

    @Override
    public int selectCount(String worksheetno) {
        return disWorkordersignMapper.selectCount(worksheetno);
    }

    @Override
    public int updateByPrimaryKey(DisWorkordersign record) {
        return disWorkordersignMapper.updateByPrimaryKey(record);
    }
}
