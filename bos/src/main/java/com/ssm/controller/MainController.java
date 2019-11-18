package com.ssm.controller;




import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MainController {
    //注入UsersServices的Bean

    //王景琪帅哥
    @RequestMapping("test")
    public String test(){
        System.out.println("测试成功");
        return "index";
    }







}
