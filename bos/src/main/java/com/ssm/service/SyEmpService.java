package com.ssm.service;

import com.ssm.model.SyEmp;

import java.util.List;

public interface SyEmpService {
    int deleteByPrimaryKey(Short id);

    int insert(SyEmp record);


    List<SyEmp> selectByPrimaryKeyLike(int start, int end, String name, String disabled);

    public int selectCount(String name, String disabled);

    int updateByPrimaryKey(SyEmp record);

    public SyEmp selectSyEmp(int id);

    List<SyEmp> selectByPrimaryLike(String EmpNo, String Pwd);
}
