package com.ssm.mapper;

import com.ssm.model.Dept;
import com.ssm.model.Substitute;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubstituteMapper {
    @Select("select * from BAS_Substitute")
    public List<Substitute> selectSubstitute();

    @Select("select * from Dept")
    public List<Dept> selectDept();

   /* @Delete("delete from Dept where deptno=7369")
    public List<Dept> selectDept();*/
}
