package com.example.demo.controller;

import com.example.demo.service.ControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@org.springframework.stereotype.Controller

public class Controller {

    @Autowired
    private ControllerService controllerService;

    @GetMapping("/")
    @ResponseBody
    public String test(){
        controllerService.asyncTest();
        System.out.println("哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈");
        return "hello world";
    }
}
