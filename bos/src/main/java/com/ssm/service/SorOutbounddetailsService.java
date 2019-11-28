package com.ssm.service;

import com.ssm.model.SorOutbounddetails;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SorOutbounddetailsService {

    List<SorOutbounddetails> finAllSorOutbounddetails();

    List<SorOutbounddetails> selectSorOutbounddetailsByIdLike(String packageid);

    int deleteByPrimaryKey(String packageid);

      int insert(SorOutbounddetails record);

    int updateByPrimaryKeySelective(SorOutbounddetails record);

}