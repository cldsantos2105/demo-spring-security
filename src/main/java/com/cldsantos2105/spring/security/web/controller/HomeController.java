package com.cldsantos2105.spring.security.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	// abrir pagina home
	@GetMapping("/")
	public String home() {
		return "home";
	}	
}
