package com.example.demoHelloWorld.repository.impl;

import com.example.demoHelloWorld.repository.HelloWorldRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

@Repository
public class HelloWorldRepositoryimpl implements HelloWorldRepository {
    public HelloWorldRepositoryimpl() {
        System.out.println("Repository");
    }
@PostConstruct
    public void initRepository()  {
        System.out.println("HELLO PRATEEK");

    }

    @Override
    public String getMessage() {
        System.out.println("hash code of Repository is"+ this.hashCode());
        return "Hello From Repository";
    }
}
