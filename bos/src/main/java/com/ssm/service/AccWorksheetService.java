package com.ssm.service;

import com.ssm.model.AccWorksheet;

import java.util.List;

public interface AccWorksheetService {
    int deleteByPrimaryKey(Short id);

    int insert(AccWorksheet record);

    List<AccWorksheet> selectByPrimaryKeyLike(int start, int end, String worksheetno);

    public int selectCount(String worksheetno);

    int updateByPrimaryKey(AccWorksheet record);

    AccWorksheet selectAccWorksheetById(String worksheetno);
}
