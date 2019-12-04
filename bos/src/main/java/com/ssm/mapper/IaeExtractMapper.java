package com.ssm.mapper;

import com.ssm.model.IaeExtract;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IaeExtractMapper {

    @Select("select * from IAE_Extract")
    List<IaeExtract> finAllIaeExtract();

    int deleteByPrimaryKey(String id);

    int insert(IaeExtract record);

    int insertSelective(IaeExtract record);

    IaeExtract selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(IaeExtract record);

    int updateByPrimaryKey(IaeExtract record);
}