package com.ssm.mapper;

import com.ssm.model.DisDispatchhistory;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DisDispatchhistoryMapper {
    @Delete("delete from DIS_DispatchHistory where id=#{id}")
    int deleteByPrimaryKey(Short id);

    @Insert("insert into DIS_DispatchHistory(id,businessnoticeno,reservationtime,customname,pickupaddress,customcode,linkman,telphone,weight,volume,importanthints,arrivecity)" +
            " values(DIS_DispatchHistory_id.Nextval,#{businessnoticeno},#{reservationtime},#{customname},#{pickupaddress},#{customcode},#{linkman},#{telphone},#{weight},#{volume},#{importanthints},#{arrivecity})")
    int insert(DisDispatchhistory record);


    @Select("select * from (select d.*, ROWNUM ROWNUM_  from (select * from DIS_DispatchHistory) d where ROWNUM <=#{end})where ROWNUM_>#{start} and businessnoticeno like #{businessnoticeno} and customcode like #{customcode}")
    List<DisDispatchhistory> selectByPrimaryKeyLike(int start, int end, String businessnoticeno, String customcode);

    @Select("select count(*) from DIS_DispatchHistory where businessnoticeno like #{businessnoticeno} and customcode like #{customcode}")
    public int selectCount(String businessnoticeno, String customcode);

    @Update("update DIS_DispatchHistory set businessnoticeno=#{businessnoticeno},reservationtime=#{reservationtime},pickupaddress=#{pickupaddress},linkman=#{linkman},telphone=#{telphone},weight=#{weight},volume=#{volume},importanthints=#{importanthints},arrivecity=#{arrivecity} where id=#{id}")
    int updateByPrimaryKey(DisDispatchhistory record);
}