package com.rama.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "Rama Boot, My First boot Controller";
	}
	
	@RequestMapping("/blog")
	public String blog() {
		return "Blog page";
	}
}
