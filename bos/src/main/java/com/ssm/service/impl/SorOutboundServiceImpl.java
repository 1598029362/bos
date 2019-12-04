package com.ssm.service.impl;

import com.ssm.mapper.SorOutboundMapper;
import com.ssm.model.SorOutbound;
import com.ssm.service.SorOutboundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SorOutboundServiceImpl  implements SorOutboundService {
    @Autowired
    private SorOutboundMapper mapper;
    @Override
    public List<SorOutbound> findAllSorOutbound() {
        return mapper.findAllSorOutbound();
    }

    @Override
    public short selectSorOutbound() {
        return mapper.selectSorOutbound();
    }

    @Override
    public int deleteByPrimaryKey(Short id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SorOutbound record) {
        return mapper.insert(record);
    }

    @Override
    public int updateByPrimaryKeySelective(SorOutbound record) {
        return mapper.updateByPrimaryKeySelective(record);
    }
}
