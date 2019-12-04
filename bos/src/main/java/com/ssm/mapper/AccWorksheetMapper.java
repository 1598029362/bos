package com.ssm.mapper;

import com.ssm.model.AccWorksheet;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccWorksheetMapper {
    @Delete("delete from ACC_WorkSheet where id=#{id}")
    int deleteByPrimaryKey(Short id);

    @Insert("insert into ACC_WorkSheet values(ACC_WorkSheet_id.Nextval,#{worksheetno},#{destination},#{producttime},#{total},#{weight},#{stowagerequirements})")
    int insert(AccWorksheet record);


    @Select("select * from (select d.*, ROWNUM ROWNUM_  from (select * from ACC_WorkSheet) d where ROWNUM <=#{end})where ROWNUM_>#{start} and worksheetno like #{worksheetno}")
    List<AccWorksheet> selectByPrimaryKeyLike(int start, int end, String worksheetno);

    @Select("select count(*) from ACC_WorkSheet where worksheetno like #{worksheetno}")
    public int selectCount(String worksheetno);

    @Update("update ACC_WorkSheet set worksheetno=#{worksheetno},destination=#{destination},total=#{total},stowagerequirements=#{stowagerequirements} where id=#{id}")
    int updateByPrimaryKey(AccWorksheet record);

    @Select("select * from ACC_WorkSheet where worksheetno=#{worksheetno}")
    AccWorksheet selectAccWorksheetById(String worksheetno);

}