package com.ssm.service;

import com.ssm.model.SyRole;

import java.util.List;

public interface SyRoleService {

    int deleteByPrimaryKey(Short id);

    int insert(SyRole record);

    List<SyRole> selectByPrimaryKeyLike(int start, int end, String rolename, String disabled);

    public int selectCount(String rolename, String disabled);

    int updateByPrimaryKey(SyRole record);

    List<SyRole> selectRole();

    SyRole byid(short id);
}
