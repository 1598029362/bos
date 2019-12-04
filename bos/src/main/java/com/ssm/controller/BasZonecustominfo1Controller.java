package com.ssm.controller;




import com.ssm.model.BasZonecustominfo1;
import com.ssm.service.BasZonecustominfo1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BasZonecustominfo1Controller {
    @Autowired
    private BasZonecustominfo1Service basZonecustominfoService;

    //栏目管理
    //分页


    @RequestMapping("selectZonecustominfo")
    public BasZonecustominfo1 selectZonecustominfo(short customcode){

        return  basZonecustominfoService.selectZonecustominfoByID(customcode);
    }




}
