package com.luke.lab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Luke
 */
@RestController
@RequestMapping("test")
public class IndexController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello Luke";
    }
}
