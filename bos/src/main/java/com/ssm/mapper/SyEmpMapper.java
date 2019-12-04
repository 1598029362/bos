package com.ssm.mapper;

import com.ssm.model.SyEmp;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SyEmpMapper {
    @Delete("delete from sy_emp where id=#{id}")
    int deleteByPrimaryKey(Short id);

    @Insert("insert into sy_emp values(sy_emp_id.Nextval,#{EmpName},#{EmpNo},#{Pwd},#{QueryPwd},#{RoleID},#{EmpUnit},#{Remark},#{Disabled})")
    int insert(SyEmp record);

    @Select("select * from (select d.*, ROWNUM ROWNUM_  from (select * from sy_emp) d where ROWNUM <=#{end})where ROWNUM_>#{start} and EmpName like #{EmpName} and disabled like #{disabled}")
    List<SyEmp> selectByPrimaryKeyLike(int start, int end, String EmpName, String disabled);

    @Select("select count(*) from sy_emp where EmpName like #{EmpName} and disabled like #{disabled}")
    public int selectCount(String EmpName, String disabled);

    @Update("update sy_emp set EmpName=#{EmpName},EmpNo=#{EmpNo},Pwd=#{Pwd},QueryPwd=#{QueryPwd},RoleID=#{RoleID},EmpUnit=#{EmpUnit},Remark=#{Remark},Disabled=#{Disabled} where ID=#{ID}")
    int updateByPrimaryKey(SyEmp record);

    @Select("select * from sy_emp where id=#{id}")
    public SyEmp selectSyEmp(int id);

    @Select("select * from sy_emp where EmpNo=#{EmpNo} and Pwd=#{Pwd}")
    List<SyEmp> selectByPrimaryLike(String EmpNo, String Pwd);

}
