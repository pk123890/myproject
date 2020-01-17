package com.example.demoHelloWorld.controller;

import com.example.demoHelloWorld.repository.HelloWorldRepository;
import com.example.demoHelloWorld.service.HelloWorldService;
import com.example.demoHelloWorld.service.impl.HelloWorldServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/helloWorld")
public class HelloWorld {
    public HelloWorld(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
        System.out.println("controller");
    }

    @PostConstruct
    public void initController() {
        System.out.println("HELLO CONTROLLER");

    }

    @Autowired
    HelloWorldService helloWorldService;

    @GetMapping("/getmessage")
    public String helloWorld() {
        System.out.println("Hash code Of controller"+this.hashCode());
        return helloWorldService.getMessage();
    }
}
