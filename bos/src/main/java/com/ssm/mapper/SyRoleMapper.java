package com.ssm.mapper;

import com.ssm.model.SyRole;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SyRoleMapper {

    @Delete("delete from sy_role where id=#{id}")
    int deleteByPrimaryKey(Short id);

    @Insert("insert into sy_role values(SY_Role_id.Nextval,#{rolename},#{roledesc},#{disabled})")
    int insert(SyRole record);

    @Select("select * from (select d.*, ROWNUM ROWNUM_  from (select * from sy_role) d where ROWNUM <=#{end})where ROWNUM_>#{start} and rolename like #{rolename} and disabled like #{disabled}")
    List<SyRole> selectByPrimaryKeyLike(int start, int end, String rolename, String disabled);

    @Select("select count(*) from sy_role where rolename like #{rolename} and disabled like #{disabled}")
    public int selectCount(String rolename, String disabled);

    @Update("update sy_role set rolename=#{rolename},roledesc=#{roledesc},disabled=#{disabled} where id=#{id}")
    int updateByPrimaryKey(SyRole record);

    @Select("select * from sy_role")
    List<SyRole> selectRole();

    @Select("select * from sy_role where id=#{id} ")
    SyRole byid(short id);


}
