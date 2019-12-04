package com.ssm.mapper;

import com.ssm.model.DisWorkordersign;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DisWorkordersignMapper {
    @Delete("delete from DIS_WorkOrderSign where id=#{id}")
    int deleteByPrimaryKey(Short id);

    @Insert("insert into DIS_WorkOrderSign(id,workorderid,worksheetno,workordertype,signtype,inputid,recipient,inputname,couriername,signunit,signtime,inputtime)" +
            " values(DIS_WorkOrderSign_id.Nextval,#{workorderid},#{worksheetno},#{workordertype},#{signtype},#{inputid},#{recipient},#{inputname},#{couriername},#{signunit},#{signtime},#{inputtime})")
    int insert(DisWorkordersign record);

    @Select("select * from (select d.*, ROWNUM ROWNUM_  from (select * from DIS_WorkOrderSign) d where ROWNUM <=#{end})where ROWNUM_>#{start} and worksheetno like #{worksheetno}")
    List<DisWorkordersign> selectByPrimaryKeyLike(int start, int end, String worksheetno);

    @Select("select count(*) from DIS_WorkOrderSign where worksheetno like #{worksheetno} ")
    public int selectCount(String worksheetno);

    @Update("update DIS_WorkOrderSign set recipient=#{recipient},signunit=#{signunit} where id=#{id}")
    int updateByPrimaryKey(DisWorkordersign record);
}