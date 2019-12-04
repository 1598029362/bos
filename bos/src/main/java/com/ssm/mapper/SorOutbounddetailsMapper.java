package com.ssm.mapper;

import com.ssm.model.SorOutbounddetails;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SorOutbounddetailsMapper {
    @Select("select * from SOR_OutBoundDetails")
    List<SorOutbounddetails> finAllSorOutbounddetails();

    @Select("select * from SOR_OutBoundDetails where packageid = #{packageid}")
    List<SorOutbounddetails> selectSorOutbounddetailsByIdLike(String packageid);

    @Delete("delete from SOR_OutBoundDetails where packageid=#{packageid}")
    int deleteByPrimaryKey(String packageid);

    @Insert("insert into SOR_OutBoundDetails values(SOR_OutBoundDetails_id.Nextval,#{packageid},#{weight},#{volume},#{scandate},#{isscan},#{isnextstorage},#{isdoublestorage})")
    int insert(SorOutbounddetails record);

    @Update("update SOR_OutBoundDetails set packageid=#{packageid},weight=#{weight},volume=#{volume},scandate=#{scandate},isscan=#{isscan},isnextstorage=#{isnextstorage},isdoublestorage=#{isdoublestorage} where id = #{id}")
    int updateByPrimaryKeySelective(SorOutbounddetails record);



}