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

    @Delete("delete from SOR_StorageDetails where id=#{id}")
    int deleteByPrimaryKey(Integer id);

    @Delete("delete from SOR_StorageDetails where packageid=#{packageid}")
    int deleteByLike(String packageid);

    @Insert("insert into SOR_StorageDetails values(SOR_StorageDetails_id.nextval,#{packageid},#{weight},#{outboundid},#{state})")
    int insert(SorStoragedetails record);

    @Select("select * from SOR_StorageDetails where packageid=#{packageid}")
    List<SorStoragedetails> selectSorStoragedetailsById(String packageid);

    @Update("update SOR_StorageDetails set packageid=#{packageid},weight=#{weight},outboundid=#{outboundid},state=#{state} where id=#{id}")
    int update(SorStoragedetails record);







}