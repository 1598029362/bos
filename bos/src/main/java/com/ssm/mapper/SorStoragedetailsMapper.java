package com.ssm.mapper;

import com.ssm.model.SorStoragedetails;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SorStoragedetailsMapper {
    @Select("select * from SOR_StorageDetails")
    List<SorStoragedetails> findAllSorStoragedetails();

    @Delete("delete from SOR_StorageDetails where contractnumber=#{contractnumber}")
    int deleteByPrimaryKey(Integer contractnumber);

    @Delete("delete from SOR_StorageDetails where packageid=#{packageid}")
    int deleteByLike(String packageid);

    @Insert("insert into SOR_StorageDetails values(#{id},#{packageid},#{weight},#{outboundid},#{state},#{contractnumber})")
    int insert(SorStoragedetails record);

    @Select("select * from SOR_StorageDetails where contractnumber=#{contractnumber}")
    List<SorStoragedetails> selectSorStoragedetailsById(Integer contractnumber);

    @Update("update SOR_StorageDetails set packageid=#{packageid},weight=#{weight},outboundid=#{outboundid},state=#{state} where contractnumber=#{contractnumber}")
    int update(SorStoragedetails record);







}