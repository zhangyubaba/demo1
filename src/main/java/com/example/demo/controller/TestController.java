package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
        @GetMapping("demo")
        public String demo()
        {
            return "demo 项目经理3";
        }
}
