package com.ssm.mapper;

import com.ssm.model.IaeLineresource;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IaeLineresourceMapper {
    @Select("select * from IAE_LineResource")
    List<IaeLineresource> finAllIaeLineresource();

    int deleteByPrimaryKey(String id);

    int insert(IaeLineresource record);

    int insertSelective(IaeLineresource record);

    IaeLineresource selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(IaeLineresource record);

    int updateByPrimaryKey(IaeLineresource record);
}