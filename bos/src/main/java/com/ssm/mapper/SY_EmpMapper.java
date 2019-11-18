package com.ssm.mapper;

import com.ssm.model.SY_Emp;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SY_EmpMapper {
    @Select("select * from sy_emp")
    @Results({
            @Result(property ="emp_role",column = "roleid",one = @One(select = "com.vue.mapper.Sy_RoleMapper.byid"))
    })
    List<SY_Emp> emplist();

    @Insert("insert into sy_emp(id,empname,empno,pwd,querypwd,roleid,empunit,remark,disabled) values(SY_Emp_id.Nextval,#{empname},#{empno},#{pwd},#{querypwd},#{roleid},#{empunit},#{remark},#{disabled})")
    int insertemp(SY_Emp sy_emp);
}
