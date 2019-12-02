package com.ssm.controller;

import com.ssm.model.IaeTimeinput;
import com.ssm.service.IaeTimeinputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IaeTimeinputController {
@Autowired
private     IaeTimeinputService service;

@RequestMapping("finAllIaeTimeinput")
   public List<IaeTimeinput> finAllIaeTimeinput()
   {
    return  service.finAllIaeTimeinput();
   }

}
