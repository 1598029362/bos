package com.ssm.mapper;

import com.ssm.model.PacStock;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PacStockMapper {

    @Select("select * from PAC_Stock")
     List<PacStock> fess();


    int deleteByPrimaryKey(Integer id);

    @Insert("insert into PAC_Stock values(pac_id.nextval,1,#{reservoirtype},#{transport},#{subordinateunit},#{drawerno},#{drawername},sysdate,#{remark})")
    int insert(PacStock record);

    int insertSelective(PacStock record);

    @Select("select * from PAC_Stock where warehouseno=#{warehouseno}")
    PacStock selectByPrimaryKey(String warehouseno);

    @Select("select * from PAC_Stock where warehouseno like '%'||#{warehouseno}||'%' and reservoirtype like '%'||#{reservoirtype}||'%'")
    List<PacStock> selectMhc(PacStock pacStock);


    @Update("update PAC_Stock set reservoirtype=#{reservoirtype},transport=#{transport},subordinateunit=#{subordinateunit},drawerno=#{drawerno},drawername=#{drawername},drawertime=#{drawertime},remark=#{remark} where id=#{id}")
    int updateByPrimaryKeySelective(PacStock record);

    int updateByPrimaryKey(PacStock record);
}