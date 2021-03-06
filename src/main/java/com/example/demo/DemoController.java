package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(path = "/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping(path = "/pong")
    public String pong() {
        return "ping";
    }

    @GetMapping(path="/pang")
    public String pang(){ return "pang"; }

    @GetMapping(path="/hello")
    public String hello(){ return "this is a wonderful world"; }
}


