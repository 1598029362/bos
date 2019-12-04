package com.ssm.service.impl;

import com.ssm.mapper.PacPackagingMapper;
import com.ssm.model.PacPackaging;
import com.ssm.service.PacPackagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PacPackagingServiceimpl implements PacPackagingService {

    @Autowired
    private PacPackagingMapper pm;

    @Override
    public List<PacPackaging> fess() {
        return pm.fess();
    }

    @Override
    public int insert(PacPackaging record) {
        return pm.insert(record);
    }

    @Override
    public int updateByPrimaryKeySelective(PacPackaging record) {
        return pm.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Short id) {
        return pm.deleteByPrimaryKey(id);
    }

    @Override
    public List<PacPackaging> selectByPrimaryKey(PacPackaging packaging) {
        return pm.selectByPrimaryKey(packaging);
    }
}
