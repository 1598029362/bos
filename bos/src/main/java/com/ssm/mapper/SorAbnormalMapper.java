package com.ssm.mapper;

import com.ssm.model.SorAbnormal;
import com.ssm.model.SorStorage;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SorAbnormalMapper {
    @Delete("delete from SOR_Abnormal where ID=#{id}")
    int deleteByPrimaryKey(Integer id);

    @Insert("insert into SOR_Abnormal values(#{id},#{acceptdate},#{acceptperson},#{acceptcompany},#{deliveryperson},#{deliverycompany})")
    int insert(SorAbnormal record);

    @Update("update  SOR_Abnormal set acceptdate=#{acceptdate},acceptperson=#{acceptperson},acceptcompany=#{acceptcompany},deliveryperson=#{deliveryperson},deliverycompany=#{deliverycompany} where ID=#{id}")
    int updateByPrimaryKey(SorAbnormal record);

    @Select("select * from SOR_Abnormal")
    List<SorAbnormal> findAllSOR_Abnormal();

}