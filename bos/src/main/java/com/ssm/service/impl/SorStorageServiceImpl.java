package com.ssm.service.impl;

import com.ssm.mapper.SorStorageMapper;
import com.ssm.model.SorStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SorStorageServiceImpl implements com.ssm.service.SorStorageService {
    @Autowired
    private SorStorageMapper mapper;

    @Override
    public int finAllSorStorageSize() {
        return mapper.finAllSorStorageSize();
    }

    @Override
    public List<SorStorage> findAllSorStorage() {
        return mapper.findAllSorStorage();
    }

    @Override
    public int deleteByPrimaryKey(long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SorStorage record) {
        return mapper.insert(record);
    }

    @Override
    public SorStorage selectByPrimaryKey(Short id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SorStorage record) {
        System.out.println(record);
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<SorStorage> selectByPrimaryKeyLike(int start, int end, long id, Date acceptdate) {
        return mapper.selectByPrimaryKeyLike(start,end,id,acceptdate);
    }

    @Override
    public int selectCount(Long id, Date acceptdate) {
        return mapper.selectCount(id,acceptdate);
    }
}
