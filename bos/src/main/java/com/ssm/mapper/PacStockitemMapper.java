package com.ssm.mapper;

import com.ssm.model.PacStockitem;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public interface PacStockitemMapper {
    @Select("select * from PAC_StockItem")
    @Results({
            @Result(column ="id",property = "id",id = true),
            @Result(column ="warehouseno",property = "warehouseno"),
            @Result(property = "pacStock", column ="warehouseno", one = @One(select = "com.ssm.mapper.PacStockMapper.selectByPrimaryKey"))
    })
    List<PacStockitem> Fess();

    int deleteByPrimaryKey(Short id);

    @Insert("insert into PAC_StockItem values(kag_id.nextval,3,#{goodscode},#{goodsname},#{storagenum},#{actualnum},#{plannedprice},#{specifications},#{type},#{status})")
    int insert(PacStockitem record);

    int insertSelective(PacStockitem record);

    @Select("select u.*,P.SUBORDINATEUNIT from PAC_StockItem u " +
            "inner join Pac_Stock P " +
            "ON u.warehouseno=p.warehouseno " +
            "where goodscode like '%'||#{goodscode}||'%' and P.subordinateunit like '%'||#{goodsname}||'%'")
    @Results({
            @Result(column ="id",property = "id",id = true),
            @Result(column ="GOODSCODE",property = "goodscode"),
            @Result(column ="GOODSNAME",property = "goodsname"),
            @Result(column ="STORAGENUM",property = "storagenum"),
            @Result(column ="PLANNEDPRICE",property = "plannedprice"),
            @Result(column ="SPECIFICATIONS",property = "specifications"),
            @Result(column ="TYPE",property = "type"),
            @Result(column ="SUBORDINATEUNIT",property = "pacStock.subordinateunit"),
    })
    List<PacStockitem> selectByPrimaryKey(PacStockitem pacStockitem);

    @Update("update PAC_StockItem set goodscode=#{goodscode},goodsname=#{goodsname},storagenum=#{storagenum},actualnum=#{actualnum},plannedprice=#{plannedprice},specifications=#{specifications},type=#{type},status=#{status} where id=#{id}")
    int updateByPrimaryKeySelective(PacStockitem record);

    int updateByPrimaryKey(PacStockitem record);
}