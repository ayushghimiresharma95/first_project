package com.first_project.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping(path = "/index")
     public static String index(){
        return "This is the main page" ;
     }
     @GetMapping("/contact")
    public static String getContact(){
        return "this is the contact page";
    }
	@GetMapping("/hello")
    public static String hello(@RequestParam(name = "name" ) String name,@RequestParam("location") String location){

        return "Welcome to the "+location+", "+name+"!";
    }

}
