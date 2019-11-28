package com.ssm.service.impl;

import com.ssm.mapper.SorOutbounddetailsMapper;
import com.ssm.model.SorOutbounddetails;
import com.ssm.service.SorOutbounddetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SorOutbounddetailsServiceImpl implements SorOutbounddetailsService {
    @Autowired
    private SorOutbounddetailsMapper mapper;

    @Override
    public List<SorOutbounddetails> finAllSorOutbounddetails() {
        return mapper.finAllSorOutbounddetails();
    }

    @Override
    public List<SorOutbounddetails> selectSorOutbounddetailsByIdLike(String packageid) {
        return mapper.selectSorOutbounddetailsByIdLike(packageid);
    }

    @Override
    public int deleteByPrimaryKey(String packageid) {
        return mapper.deleteByPrimaryKey(packageid);
    }

    @Override
    public int insert(SorOutbounddetails record) {
        return mapper.insert(record);
    }

    @Override
    public int updateByPrimaryKeySelective(SorOutbounddetails record) {
        return mapper.updateByPrimaryKeySelective(record);
    }
}
