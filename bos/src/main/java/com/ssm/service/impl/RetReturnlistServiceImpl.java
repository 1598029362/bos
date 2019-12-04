package com.ssm.service.impl;

import com.ssm.mapper.RetReturnlistMapper;
import com.ssm.model.RetReturnlist;
import com.ssm.service.RetReturnlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RetReturnlistServiceImpl implements RetReturnlistService {
    @Autowired
    private RetReturnlistMapper retReturnlistMapper;

    @Override
    public int deleteByPrimaryKey(Short id) {
        return retReturnlistMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(RetReturnlist record) {
        return retReturnlistMapper.insert(record);
    }


    @Override
    public List<RetReturnlist> selectByPrimaryKeyLike(int start, int end, String businessnoticeno, String customcode,String apreturnstatus) {
        return retReturnlistMapper.selectByPrimaryKeyLike(start,end,businessnoticeno,customcode,apreturnstatus);
    }

    @Override
    public int selectCount(String businessnoticeno, String customcode,String apreturnstatus) {
        return retReturnlistMapper.selectCount(businessnoticeno,customcode,apreturnstatus);
    }

    @Override
    public int updateByPrimaryKey(RetReturnlist record) {
        return retReturnlistMapper.updateByPrimaryKey(record);
    }

    @Override
    public int selectMax() {
        return retReturnlistMapper.selectMax();
    }
    @Override
    public List<RetReturnlist> selectByPrimaryKeyLike2(int start, int end, String businessnoticeno, String customcode,String apreturnstatus) {
        return retReturnlistMapper.selectByPrimaryKeyLike2(start,end,businessnoticeno,customcode,apreturnstatus);
    }

    @Override
    public int selectCount2(String businessnoticeno, String customcode,String apreturnstatus) {
        return retReturnlistMapper.selectCount2(businessnoticeno,customcode,apreturnstatus);
    }

    @Override
    public int update(RetReturnlist record) {
        return retReturnlistMapper.update(record);
    }

    @Override
    public int update2(RetReturnlist record) {
        return retReturnlistMapper.update2(record);
    }


}
