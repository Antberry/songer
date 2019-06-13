package com.yadayada1z2a.firstWebApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    public class HelloWorldController {
        @GetMapping("/hello")
        public String hello(){
            return "Hello World";
        }

        @GetMapping ("/capitalize/{text}")
        public String upperCaseHello(@PathVariable String text){
            return text.toUpperCase();
        }



    }

