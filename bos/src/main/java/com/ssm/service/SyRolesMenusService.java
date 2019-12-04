package com.ssm.service;

import com.ssm.model.SyRolesMenus;

import java.util.List;

public interface SyRolesMenusService {
    int deleteByPrimaryKey(Short roleid);

    int insert(SyRolesMenus record);

    int insert2(SyRolesMenus record);

    List<SyRolesMenus> selectByPrimaryKeyLike(int roleid);
}
