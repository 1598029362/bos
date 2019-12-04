package com.ssm.service;

import com.ssm.model.PacStockc;

import java.util.List;

public interface PacStockcService {

    List<PacStockc> fAll();

    int insert(PacStockc pacStockc);

    int updatekc(PacStockc pacStockc);

    List<PacStockc> selectid(PacStockc pacStock);

}
