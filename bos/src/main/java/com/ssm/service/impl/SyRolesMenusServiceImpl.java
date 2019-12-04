package com.ssm.service.impl;

import com.ssm.mapper.SyRolesMenusMapper;
import com.ssm.model.SyRolesMenus;
import com.ssm.service.SyRolesMenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SyRolesMenusServiceImpl implements SyRolesMenusService {
    @Autowired
    private SyRolesMenusMapper syRolesMenusMapper;

    @Override
    public int deleteByPrimaryKey(Short roleid) {
        return syRolesMenusMapper.deleteByPrimaryKey(roleid);
    }

    @Override
    public int insert(SyRolesMenus record) {
        return syRolesMenusMapper.insert(record);
    }

    @Override
    public int insert2(SyRolesMenus record) {
        return syRolesMenusMapper.insert2(record);
    }

    @Override
    public List<SyRolesMenus> selectByPrimaryKeyLike(int roleid) {
        return syRolesMenusMapper.selectByPrimaryKeyLike(roleid);
    }
}
