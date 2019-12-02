package com.ssm.controller;

import com.ssm.model.IaeExtract;
import com.ssm.service.IaeExtractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IaeExtractController {
 @Autowired
 private IaeExtractService service;

 @RequestMapping("findAllIaeExtract")
 public List<IaeExtract> findAllIaeExtract()
 {
     return service.finAllIaeExtract();
 }
}
