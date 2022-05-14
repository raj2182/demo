package com.sarsandi.prbaa.demo.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class EmployeeController {

    @GetMapping
    public String hello(){
        return "hello from rajeev";
    }
}
