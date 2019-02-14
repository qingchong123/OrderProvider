package com.qfedu.orderprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hellofirst.do")
    public String hello1() {
        System.out.println("提供者");
        return "Hello,你好！";
    }
}