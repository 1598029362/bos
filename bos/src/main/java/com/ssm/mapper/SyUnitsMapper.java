package com.ssm.mapper;

import com.ssm.model.SyUnits;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SyUnitsMapper {
    @Delete("delete from sy_units where id=#{id}")
    int deleteByPrimaryKey(Short id);

    @Insert("insert into sy_units(id,name,remarks) values(sy_units_id.Nextval,#{name},#{remarks})")
    int insert(SyUnits record);


    @Select("select * from (select d.*, ROWNUM ROWNUM_  from (select * from sy_units) d where ROWNUM <=#{end})where ROWNUM_>#{start} and name like #{name}")
    List<SyUnits> selectByPrimaryKeyLike(int start, int end, String name);

    @Select("select count(*) from sy_units where name like #{name}")
    public int selectCount(String name);

    @Update("update sy_units set name=#{name},remarks=#{remarks} where id=#{id}")
    int updateByPrimaryKey(SyUnits record);

    @Select("select * from sy_units")
    List<SyUnits> selectUnits();

}