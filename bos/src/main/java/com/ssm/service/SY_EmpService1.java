package com.ssm.service;

import com.ssm.model.SY_Emp;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;


public interface SY_EmpService1 {

    List<SY_Emp> emplist();
}
