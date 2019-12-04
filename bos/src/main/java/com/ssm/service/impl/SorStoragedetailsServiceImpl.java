package com.ssm.service.impl;

import com.ssm.mapper.SorStoragedetailsMapper;
import com.ssm.model.SorStoragedetails;
import com.ssm.service.SorStoragedetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SorStoragedetailsServiceImpl implements SorStoragedetailsService {
    @Autowired
    private SorStoragedetailsMapper mapper;
    @Override
    public List<SorStoragedetails> findAllSorStoragedetails() {
        return mapper.findAllSorStoragedetails();
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SorStoragedetails record) {
        return mapper.insert(record);
    }

    @Override
    public int update(SorStoragedetails record) {
        return mapper.update(record);
    }

    @Override
    public int deleteByLike(String packageid) {
        return mapper.deleteByLike(packageid);
    }

    @Override
    public List<SorStoragedetails> selectSorStoragedetailsById(Integer contractnumber) {
        return mapper.selectSorStoragedetailsById(contractnumber);
    }


}
