package com.ssm.mapper;

import com.ssm.model.SY_Emp;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SY_Emp1Mapper {
    @Select("select * from sy_emp")
    List<SY_Emp> emplist();
}
