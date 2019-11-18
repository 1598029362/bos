package com.ssm.mapper;

import com.ssm.model.Sy_role;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Sy_RoleMapper {
    //查询所有
    @Select("select * from sy_role")
    List<Sy_role> roles();

    @Select("select * from sy_role where id=#{id} ")
    Sy_role byid(Integer id);

    @Insert("insert into sy_role(id,rolename,roledesc,disabled) values(sy_role_id.nextval,#{rolename},#{roledesc},#{disabled})")
    int insertrole(Sy_role role);

}
