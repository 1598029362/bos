package com.ssm.mapper;

import com.ssm.model.SorStorage;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface SorStorageMapper {
    @Select("select count(*) from SOR_Storage")
    int finAllSorStorageSize();
    @Select("select * from SOR_Storage")
    List<SorStorage> findAllSorStorage();

    @Select("select * from (select d.*, ROWNUM ROWNUM_  from (select * from sor_storage) d where ROWNUM <=#{end})where ROWNUM_>#{start} and id like #{id} and acceptdate <= #{acceptdate}")
    List<SorStorage> selectByPrimaryKeyLike(int start, int end, long id, Date acceptdate);

    @Select("select count(*) from sor_storage where id like #{id} and acceptdate <= #{acceptdate}")
    public int selectCount(Long id, Date acceptdate);




    @Delete("delete from SOR_Storage where ID=#{id}")
    int deleteByPrimaryKey(long id);

    @Insert("insert into SOR_Storage values(#{id},#{acceptdate},#{acceptperson},#{acceptcompany},#{deliveryperson},#{deliverycompany})")
    int insert(SorStorage record);


    @Select("select * from SOR_Storage where ID=#{id}")
    SorStorage selectByPrimaryKey(Short id);

    @Update("update  SOR_Storage set acceptdate=#{acceptdate},acceptperson=#{acceptperson},acceptcompany=#{acceptcompany},deliveryperson=#{deliveryperson},deliverycompany=#{deliverycompany} where ID=#{id}")
    int updateByPrimaryKeySelective(SorStorage record);


}