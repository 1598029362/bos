package com.ssm.service;

import com.ssm.controller.SorStorageController;

import java.util.List;

public interface SyRolesMenusService {
    int deleteByPrimaryKey(Short roleid);

    int insert(SorStorageController.SyRolesMenus record);

    int insert2(SorStorageController.SyRolesMenus record);

    List<SorStorageController.SyRolesMenus> selectByPrimaryKeyLike(int roleid);
}
