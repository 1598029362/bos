package com.ssm.service.impl;

import com.ssm.mapper.PacStockMapper11;
import com.ssm.model.PacStock;
import com.ssm.service.PacStockService11;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacStockServiceImpl11  implements PacStockService11 {
   @Autowired
   private PacStockMapper11 mapper;
      @Override
      public int insert(PacStock record) {
            return mapper.insert(record);
      }
}