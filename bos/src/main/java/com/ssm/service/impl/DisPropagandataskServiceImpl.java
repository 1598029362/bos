package com.ssm.service.impl;

import com.ssm.mapper.DisPropagandataskMapper;
import com.ssm.model.DisPropagandatask;
import com.ssm.service.DisPropagandataskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisPropagandataskServiceImpl implements DisPropagandataskService {
    @Autowired
    private DisPropagandataskMapper disPropagandataskMapper;

    @Override
    public int deleteByPrimaryKey(Short id) {
        return disPropagandataskMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(DisPropagandatask record) {
        return disPropagandataskMapper.insert(record);
    }

    @Override
    public List<DisPropagandatask> selectByPrimaryKeyLike(int start, int end, String businessnoticeno, String customcode) {
        return disPropagandataskMapper.selectByPrimaryKeyLike(start,end,businessnoticeno,customcode);
    }

    @Override
    public int selectCount(String businessnoticeno, String customcode) {
        return disPropagandataskMapper.selectCount(businessnoticeno,customcode);
    }

    @Override
    public int updateByPrimaryKey(DisPropagandatask record) {
        return disPropagandataskMapper.updateByPrimaryKey(record);
    }

}
