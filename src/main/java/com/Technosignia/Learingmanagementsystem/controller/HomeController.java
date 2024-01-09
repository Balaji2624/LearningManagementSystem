package com.Technosignia.Learingmanagementsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/home")
     public String Welcome()
     {
    	 return "welcome to Spring Boot";
     }
}
