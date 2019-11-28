package com.ssm.mapper;

import com.ssm.model.SorOutbound;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SorOutboundMapper {
    @Select("select * from SOR_OutBound")
    List<SorOutbound> findAllSorOutbound();

    @Select("select max(id) from SOR_OutBound")
    short selectSorOutbound();
    @Delete("delete from SOR_OutBound where id=#{id}")
    int deleteByPrimaryKey(Short id);
    @Insert("insert into SOR_OutBound values(SOR_OutBound_id.Nextval,#{handovertype},#{line},#{direction},#{acceptperson},#{carriers},#{deliveryperson},#{deliverydate},#{deliverycompany},#{enterperson},sysdate)")
    int insert(SorOutbound record);

    @Update("update SOR_OutBound set handovertype=#{handovertype},line=#{line},direction=#{direction},acceptperson=#{acceptperson},carriers=#{carriers},deliveryperson=#{deliveryperson},deliverydate=#{deliverydate},deliverycompany=#{deliverycompany},enterperson=#{enterperson}  where id=#{id}")
    int updateByPrimaryKeySelective(SorOutbound record);


}