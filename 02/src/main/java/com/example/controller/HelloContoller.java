package com.example.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContoller {
    @RequestMapping(value = "/hello/{name}")
    String hello(@PathVariable String name) {
        return String.format("Hello %s", name);
    }
}