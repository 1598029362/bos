package com.ssm.controller;

import com.ssm.model.IaeLineresource;
import com.ssm.service.IaeLineresourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IaeLineresourceController {
     @Autowired
     private IaeLineresourceService service;
    @RequestMapping("finAllIaeLineresource")
    public List<IaeLineresource> finAllIaeLineresource()
   {
      return service.finAllIaeLineresource();
   }
}
