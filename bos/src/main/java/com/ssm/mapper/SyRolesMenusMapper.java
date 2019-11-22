package com.ssm.mapper;

import com.ssm.model.SyRolesMenus;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SyRolesMenusMapper {
    @Delete("delete from SY_RolesMenus where roleid=#{roleid}")
    int deleteByPrimaryKey(Short roleid);

    @Insert("insert into SY_RolesMenus values(SY_RolesMenus_id.Nextval,SY_Role_id.currval,#{menuid})")
    int insert(SyRolesMenus record);

    @Insert("insert into SY_RolesMenus values(SY_RolesMenus_id.Nextval,#{roleid},#{menuid})")
    int insert2(SyRolesMenus record);

    @Select("select * from SY_RolesMenus where roleid=#{roleid}")
    List<SyRolesMenus> selectByPrimaryKeyLike(int roleid);


}