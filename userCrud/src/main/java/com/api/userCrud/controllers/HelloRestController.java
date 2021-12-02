package com.api.userCrud.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("hello")
public class HelloRestController {

    @GetMapping("user")
    public String helloUser(){
        return "<marquee>Hola usuario</marquee>";
    }
    
}
