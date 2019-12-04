package com.ssm.controller;

import com.ssm.model.IaeArrival;
import com.ssm.service.IaeArrivalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IaeArrivalController {
  @Autowired
    private IaeArrivalService service;

  @RequestMapping("finallIaeArrival")
  public List<IaeArrival> finallIaeArrival()
  {
      return  service.findAllIaeArrival();
  }

}
