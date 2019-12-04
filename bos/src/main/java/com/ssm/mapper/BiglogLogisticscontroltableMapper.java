package com.ssm.mapper;

import com.ssm.model.BiglogLogisticscontroltable;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BiglogLogisticscontroltableMapper {
    //大物流管理
    @Select("select * from BIGLOG_LogisticsControlTable")
    List<BiglogLogisticscontroltable> feaa();

    @Delete("delete from BIGLOG_LogisticsControlTable where id=#{id}")
    int deleteByPrimaryKey(Short id);

    @Insert("insert into BIGLOG_LogisticsControlTable values(btg_id.nextval,#{worksheetno},#{ctype},#{corporation},#{waybillid},#{remarks},1,sysdate,2)")
    int insert(BiglogLogisticscontroltable record);

    int insertSelective(BiglogLogisticscontroltable record);

    @Select("select * from BIGLOG_LogisticsControlTable where worksheetno like '%'||#{worksheetno}||'%' and corporation like '%'||#{corporation}||'%'")
   List<BiglogLogisticscontroltable> selectByPrimaryKey(BiglogLogisticscontroltable biglogLogisticscontroltable);
    @Update("update BIGLOG_LogisticsControlTable set worksheetno=#{worksheetno},ctype=#{ctype},corporation=#{corporation},waybillid=#{waybillid},remarks=#{remarks} where id=#{id}")
    int updateByPrimaryKeySelective(BiglogLogisticscontroltable record);

    int updateByPrimaryKey(BiglogLogisticscontroltable record);
}