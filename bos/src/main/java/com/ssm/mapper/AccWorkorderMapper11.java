package com.ssm.mapper;

import com.ssm.model.AccWorkorder;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service
public interface AccWorkorderMapper11 {
    int deleteByPrimaryKey(Short id);

    int insert(AccWorkorder record);

    int insertSelective(AccWorkorder record);
     @Select("select * from ACC_WorkOrder where businessnoticeno=#{businessnoticeno}")
     AccWorkorder selectByPrimaryKey(String businessnoticeno);

    int updateByPrimaryKeySelective(AccWorkorder record);

    int updateByPrimaryKey(AccWorkorder record);
}