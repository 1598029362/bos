package com.ssm.service.impl;

import com.ssm.mapper.SyMenusMapper;
import com.ssm.model.SyMenus;
import com.ssm.service.SyMenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SyMenusServiceImpl implements SyMenusService {
    @Autowired
    private SyMenusMapper syMenusMapper;

    @Override
    public int deleteByPrimaryKey(Short id) {
        return syMenusMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SyMenus record) {
        return syMenusMapper.insert(record);
    }

    @Override
    public List<SyMenus> findAllModule() {
        return syMenusMapper.findAllModule();
    }

    @Override
    public List<SyMenus> findChildModule(int parentid,int roleid) {
        return syMenusMapper.findChildModule(parentid,roleid);
    }

    @Override
    public List<SyMenus> selectByPrimaryKeyLike(int start, int end, String text) {
        return syMenusMapper.selectByPrimaryKeyLike(start,end,text);
    }

    @Override
    public List<SyMenus> selectByPrimaryKey(int start, int end) {
        return syMenusMapper.selectByPrimaryKey(start,end);
    }

    @Override
    public int selectCount(String text) {
        return syMenusMapper.selectCount(text);
    }

    @Override
    public int updateByPrimaryKey(SyMenus record) {
        return syMenusMapper.updateByPrimaryKey(record);
    }
}
