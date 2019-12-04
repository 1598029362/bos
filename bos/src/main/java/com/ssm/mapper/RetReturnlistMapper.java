package com.ssm.mapper;

import com.ssm.model.RetReturnlist;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RetReturnlistMapper {
    @Delete("delete from RET_ReturnList where id=#{id}")
    int deleteByPrimaryKey(Short id);

    @Insert("insert into RET_ReturnList values(RET_ReturnList_id.Nextval,#{applicationno},#{worksheetno},#{returntype},#{apremark},#{aploss},#{entrytime},#{receivegunit},#{invalidatesign},#{returnunit},#{recordingtime},#{entryunit}," +
            "#{personname},#{confirmationtime},#{confirmationunit},#{confirmationpersonname},#{treatmentstate},#{apreturnstatus},#{identificationsign},#{handlingopinions},#{denialtype})")
    int insert(RetReturnlist record);


    @Select("select * from (select d.*, ROWNUM ROWNUM_  from (select * from RET_ReturnList) d where ROWNUM <=#{end})where ROWNUM_>#{start} and worksheetno like #{worksheetno} and to_char(entrytime,'yyyy-MM-dd') like #{entrytime} and apreturnstatus like #{apreturnstatus} order by entrytime desc")
    List<RetReturnlist> selectByPrimaryKeyLike(int start, int end, String worksheetno, String entrytime, String apreturnstatus);

    @Select("select count(*) from RET_ReturnList where worksheetno like #{worksheetno} and to_char(entrytime,'yyyy-MM-dd') like #{entrytime} and apreturnstatus like #{apreturnstatus}")
    public int selectCount(String worksheetno, String entrytime, String apreturnstatus);

    @Update("update RET_ReturnList set applicationno=#{applicationno},worksheetno=#{worksheetno},returntype=#{returntype},apremark=#{apremark},aploss=#{aploss},entrytime=#{entrytime},receivegunit=#{receivegunit},invalidatesign=#{invalidatesign},returnunit=#{returnunit},recordingtime=#{recordingtime}" +
            ",entryunit=#{entryunit},personname=#{personname},confirmationtime=#{confirmationtime},confirmationunit=#{confirmationunit},confirmationpersonname=#{confirmationpersonname},treatmentstate=#{treatmentstate},apreturnstatus=#{apreturnstatus},identificationsign=#{identificationsign},handlingopinions=#{handlingopinions},denialtype=#{denialtype} where id=#{id}")
    int updateByPrimaryKey(RetReturnlist record);

    @Select("select max(id) from RET_ReturnList")
    public int selectMax();



    //申请确认
    @Select("select * from (select d.*, ROWNUM ROWNUM_  from (select * from RET_ReturnList) d where ROWNUM <=#{end})where ROWNUM_>#{start} and worksheetno like #{worksheetno} and to_char(entrytime,'yyyy-MM-dd') like #{entrytime} and apreturnstatus like #{apreturnstatus} and treatmentstate=1 and invalidatesign!=1 order by entrytime desc")
    List<RetReturnlist> selectByPrimaryKeyLike2(int start, int end, String worksheetno, String entrytime, String apreturnstatus);

    @Select("select count(*) from RET_ReturnList where worksheetno like #{worksheetno} and to_char(entrytime,'yyyy-MM-dd') like #{entrytime} and apreturnstatus like #{apreturnstatus} and treatmentstate=1 and invalidatesign!=1")
    public int selectCount2(String worksheetno, String entrytime, String apreturnstatus);

    @Update("update RET_ReturnList set treatmentstate=3 where id=#{id}")
    int update(RetReturnlist record);

    @Update("update RET_ReturnList set treatmentstate=2 where id=#{id}")
    int update2(RetReturnlist record);


}