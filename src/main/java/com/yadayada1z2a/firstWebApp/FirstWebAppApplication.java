package com.yadayada1z2a.firstWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class FirstWebAppApplication {

	@Controller
	public class HelloWorldController {
		@RequestMapping("/hello")
		public String hello(){
			return "Hello World";
		}

		@RequestMapping("/capitalize/{text}")
		public String upperCaseHello(@PathVariable String text){ ;
			return text.toUpperCase();
		}


	}


	public static void main(String[] args) {
		SpringApplication.run(FirstWebAppApplication.class, args);
	}

}
