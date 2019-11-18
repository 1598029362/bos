package com.ssm.service;

import com.ssm.model.Dept;
import com.ssm.model.Substitute;

import java.util.List;

public interface SubstituteService {
    public List<Substitute> selectSubstitute();

    public List<Dept> selectDept();
}
