package com.ssm.mapper;

import com.ssm.model.PacStock;
import com.ssm.model.PacStockc;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PacStockcMapper {

    @Select("select * from Pac_Stockc")
    List<PacStockc> fAll();

    @Insert("insert into Pac_Stockc values(Stockc_id.nextval,#{outboundno},#{outboundtype},#{transport},#{suborinateunit},#{issuedunit},#{handlingunit},#{handlingnumber},#{handlingname},#{customerid},#{customername},#{recipientnumber},sysdate,#{drawerno},#{drawername},sysdate)")
    int insert(PacStockc pacStockc);

    @Update("update Pac_Stockc set outboundno=#{outboundno},outboundtype=#{outboundtype},transport=#{transport},suborinateunit=#{suborinateunit},issuedunit=#{issuedunit},handlingunit=#{handlingunit},handlingnumber=#{handlingnumber},handlingname=#{handlingname},customerid=#{customerid},customername=#{customername},recipientnumber=#{recipientnumber},recipientname=#{recipientname},drawerno=#{drawerno},drawername=#{drawername},drawertime=#{drawertime} where id=#{id}")
    int updatekc(PacStockc pacStockc);

    @Select("select * from Pac_Stockc where outboundno like '%'||#{outboundno}||'%' and outboundtype like '%'||#{outboundtype}||'%'")
    List<PacStockc> selectid(PacStockc pacStock);

}
