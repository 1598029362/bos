package com.ssm.controller;


import com.ssm.model.IaeDeparture;
import com.ssm.service.IaeDepartureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IaeDepartureController {

    @Autowired
    private IaeDepartureService service;

    @RequestMapping("findAllIaeDeparture")
    public List<IaeDeparture> findAllIaeDeparture()
    {
        return service.finAllIaeDeparture();
    }


}
