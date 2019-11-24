package com.ssm.service;

import com.ssm.model.SyMenus;

import java.util.List;

public interface SyMenusService {
    int deleteByPrimaryKey(Short id);

    int insert(SyMenus record);

    //查询模块的根目录
    public List<SyMenus> findAllModule();
    public List<SyMenus> findChildModule(int pid);

    List<SyMenus> selectByPrimaryKeyLike(int start, int end, String text);

    List<SyMenus> selectByPrimaryKey(int start, int end);

    public int selectCount(String text);

    int updateByPrimaryKey(SyMenus record);
}
