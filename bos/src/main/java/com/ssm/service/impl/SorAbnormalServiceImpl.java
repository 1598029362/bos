package com.ssm.service.impl;

import com.ssm.mapper.SorAbnormalMapper;
import com.ssm.model.SorAbnormal;
import com.ssm.service.SorAbnormalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SorAbnormalServiceImpl  implements SorAbnormalService {
   @Autowired
   private SorAbnormalMapper mapper;



    @Override
    public int deleteByPrimaryKey(Short id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SorAbnormal record) {
        return mapper.insert(record);
    }

    @Override
    public int updateByPrimaryKey(SorAbnormal record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public List<SorAbnormal> findAllSOR_Abnormal() {
        return mapper.findAllSOR_Abnormal();
    }
}