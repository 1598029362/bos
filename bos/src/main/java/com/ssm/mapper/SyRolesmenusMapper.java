package com.ssm.mapper;

import com.ssm.model.SyRolesmenus;

public interface SyRolesmenusMapper {
    int deleteByPrimaryKey(Short id);

    int insert(SyRolesmenus record);

    int insertSelective(SyRolesmenus record);

    SyRolesmenus selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(SyRolesmenus record);

    int updateByPrimaryKey(SyRolesmenus record);
}