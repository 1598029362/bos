package com.ssm.mapper;

import com.ssm.model.PacStock;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Service;

@Service
public interface PacStockMapper11 {

    @Insert("insert into PAC_Stock values(PAC_Stock_id.Nextval,#{warehouseno},#{reservoirtype},#{transport},#{subordinateunit},#{drawerno},#{drawername},#{drawertime},#{remark})")
    int insert(PacStock record);


}