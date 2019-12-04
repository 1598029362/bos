package com.ssm.mapper;

import com.ssm.model.AccBusinessadmissibility;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

@Service
public interface AccBusinessadmissibilityMapper11 {
    int deleteByPrimaryKey(Short id);

    int insert(AccBusinessadmissibility record);

    int insertSelective(AccBusinessadmissibility record);
    //根据id查询业务受理的去查询
    @Select("select * from ACC_BusinessAdmissibility where id=#{id}")
    AccBusinessadmissibility selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AccBusinessadmissibility record);

    int updateByPrimaryKey(AccBusinessadmissibility record);
}