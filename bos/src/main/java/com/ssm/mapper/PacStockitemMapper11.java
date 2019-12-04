package com.ssm.mapper;

import com.ssm.model.PacStockitem;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Service;

@Service
public interface PacStockitemMapper11 {


    @Insert("insert into PAC_StockItem values(PAC_StockItem_id.Nextval,#{warehouseno},#{goodscode},#{goodsname},#{storagenum},#{actualnum},#{plannedprice},#{specifications},#{type},#{status})")
    int insert(PacStockitem record);


}