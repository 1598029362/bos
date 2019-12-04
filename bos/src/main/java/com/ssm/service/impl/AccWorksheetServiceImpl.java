package com.ssm.service.impl;

import com.ssm.mapper.AccWorksheetMapper;
import com.ssm.model.AccWorksheet;
import com.ssm.service.AccWorksheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccWorksheetServiceImpl implements AccWorksheetService {
    @Autowired
    private AccWorksheetMapper accWorksheetMapper;

    @Override
    public int deleteByPrimaryKey(Short id) {
        return accWorksheetMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(AccWorksheet record) {
        return accWorksheetMapper.insert(record);
    }

    @Override
    public List<AccWorksheet> selectByPrimaryKeyLike(int start, int end, String worksheetno) {
        return accWorksheetMapper.selectByPrimaryKeyLike(start,end,worksheetno);
    }

    @Override
    public int selectCount(String worksheetno) {
        return accWorksheetMapper.selectCount(worksheetno);
    }

    @Override
    public int updateByPrimaryKey(AccWorksheet record) {
        return accWorksheetMapper.updateByPrimaryKey(record);
    }

    @Override
    public AccWorksheet selectAccWorksheetById(String worksheetno) {
        return accWorksheetMapper.selectAccWorksheetById(worksheetno);
    }
}
