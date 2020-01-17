package com.example.demoHelloWorld.service.impl;

import com.example.demoHelloWorld.repository.HelloWorldRepository;
import com.example.demoHelloWorld.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class HelloWorldServiceimpl implements HelloWorldService {
    @Autowired
    public HelloWorldServiceimpl(HelloWorldRepository helloWorldRepository) {
        this.helloWorldRepository = helloWorldRepository;
        System.out.println("Service");
    }
@PostConstruct
    public void initService()  {
        System.out.println("HELLO KOUL");

    }

    HelloWorldRepository helloWorldRepository;

    @Override
    public String getMessage() {
        System.out.println("hash code of service"+this.hashCode());
        return helloWorldRepository.getMessage();
    }
}
