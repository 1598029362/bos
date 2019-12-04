package com.ssm.mapper;

import com.ssm.model.DisPropagandatask;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DisPropagandataskMapper {
    @Delete("delete from DIS_PropagandaTask where id=#{id}")
    int deleteByPrimaryKey(Short id);

    @Insert("insert into DIS_PropagandaTask values(DIS_PropagandaTask_id.Nextval,#{outline},#{releasetime},#{failuretime},#{status},#{content})")
    int insert(DisPropagandatask record);


    @Select("select * from (select d.*, ROWNUM ROWNUM_  from (select * from DIS_PropagandaTask) d where ROWNUM <=#{end})where ROWNUM_>#{start} and outline like #{outline} and to_char(releasetime,'yyyy-MM-dd') like #{releasetime}")
    List<DisPropagandatask> selectByPrimaryKeyLike(int start, int end, String outline, String releasetime);

    @Select("select count(*) from DIS_PropagandaTask where outline like #{outline} and to_char(releasetime,'yyyy-MM-dd') like #{releasetime}")
    public int selectCount(String outline, String releasetime);

    @Update("update DIS_PropagandaTask set outline=#{outline},releasetime=#{releasetime},status=#{status},failuretime=#{failuretime},content=#{content} where id=#{id}")
    int updateByPrimaryKey(DisPropagandatask record);
}