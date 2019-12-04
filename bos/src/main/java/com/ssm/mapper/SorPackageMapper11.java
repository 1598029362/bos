package com.ssm.mapper;

import com.ssm.model.SorPackage;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SorPackageMapper11 {
    @Select("select * from sor_package")
    List<SorPackage> finAllSorPackage();

    int deleteByPrimaryKey(Short id);

    int insert(SorPackage record);

    int insertSelective(SorPackage record);

    SorPackage selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(SorPackage record);

    int updateByPrimaryKey(SorPackage record);
}