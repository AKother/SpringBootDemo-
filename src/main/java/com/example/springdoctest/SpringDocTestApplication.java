package com.example.springdoctest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringDocTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDocTestApplication.class, args);
    }


    //answer requests that get sent to the http://localhost:8080/hello
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name",defaultValue = "World")String name){
        return String.format("Hello %s",name);
    }
    //RequestParam:telling Spring to expect a "name" value in the request
    //if there is no name,it will use the word "World" (defaultValue = "World")
}
