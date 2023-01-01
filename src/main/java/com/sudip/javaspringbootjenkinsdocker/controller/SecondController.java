package com.sudip.javaspringbootjenkinsdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
    @GetMapping("/info")
    public String getInfo(){
        return "Info from spring boot application";
    }
}
