package com.signimus.test.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping()
    public String hello() {
        return "Welcome To Spring Boot";
    }
}
