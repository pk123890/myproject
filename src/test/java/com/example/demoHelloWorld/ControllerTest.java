package com.example.demoHelloWorld;

import com.example.demoHelloWorld.controller.HelloWorld;
import com.example.demoHelloWorld.service.HelloWorldService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class ControllerTest {
    @InjectMocks
    HelloWorld helloWorld;

    @Mock
    HelloWorldService helloWorldService;

    @BeforeEach
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test_service(){
        Mockito.when(helloWorldService.getMessage()).thenReturn("123");
        String actual=helloWorldService.getMessage();
        Assertions.assertEquals("going to say: 123",actual);
        Mockito.verify(helloWorldService).getMessage();
    }
}
