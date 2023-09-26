package com.maven.web.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MavenController {


	@GetMapping("/hello")
	public String application() {
		return "Welcome to SpringBoot Application...";
	}
}
