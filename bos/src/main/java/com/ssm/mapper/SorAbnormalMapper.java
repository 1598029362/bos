package com.ssm.mapper;

import com.ssm.model.SorAbnormal;
import com.ssm.model.SorStorage;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SorAbnormalMapper {
    @Delete("delete from SOR_Abnormal where ID=#{id}")
    int deleteByPrimaryKey(Short id);

    @Insert("insert into SOR_Abnormal values(#{id},#{launchdate},#{launchperson},#{launchcompany},#{abnormaltype},#{transferint},#{cargoint},#{packageint},#{hedgeabnint},#{abostate})")
    int insert(SorAbnormal record);

    @Update("update  SOR_Abnormal set launchdate=#{launchdate},launchperson=#{launchperson},launchcompany=#{launchcompany},abnormaltype=#{abnormaltype},transferint=#{transferint},cargoint=#{cargoint},packageint=#{packageint},hedgeabnint=#{hedgeabnint},abostate=#{abostate} where ID=#{id}")
    int updateByPrimaryKey(SorAbnormal record);

    @Select("select * from SOR_Abnormal")
    List<SorAbnormal> findAllSOR_Abnormal();

}