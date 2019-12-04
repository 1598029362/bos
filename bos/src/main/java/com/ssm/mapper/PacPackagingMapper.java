package com.ssm.mapper;

import com.ssm.model.PacPackaging;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PacPackagingMapper {
    //包装材料表
    @Select("select * from PAC_Packaging")
    List<PacPackaging> fess();

    @Delete("delete from PAC_Packaging where id=#{id}")
    int deleteByPrimaryKey(Short id);

    @Insert("insert into PAC_Packaging values(pacp_id.nextval,#{itemcode},#{itemname},#{plannedprice},#{specifications},#{type},'三个',#{status},2,sysdate,sysdate,2,sysdate)")
    int insert(PacPackaging record);

    int insertSelective(PacPackaging record);

    @Select("select * from PAC_Packaging where itemcode like '%'||#{itemcode}||'%' and itemname like '%'||#{itemname}||'%'")
    List<PacPackaging> selectByPrimaryKey(PacPackaging packaging);

    @Update("update PAC_Packaging set itemcode=#{itemcode},itemname=#{itemname},plannedprice=#{plannedprice},specifications=#{specifications},type=#{type},status=#{status} where id=#{id}")
    int updateByPrimaryKeySelective(PacPackaging record);

    int updateByPrimaryKey(PacPackaging record);
}