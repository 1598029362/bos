package com.ssm.mapper;

import com.ssm.model.PacStockitemxx;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PacStockitemxxMapper {

    @Select("select * from Pac_Stockitemxx")
    List<PacStockitemxx> FeAll();

    @Select("select * from Pac_Stockitemxx where worksheetno like '%'||#{worksheetno}||'%' and storagedate like '%'||#{storagedate}||'%'")
    List<PacStockitemxx> FellMh(PacStockitemxx pacStockitemxx);
}
