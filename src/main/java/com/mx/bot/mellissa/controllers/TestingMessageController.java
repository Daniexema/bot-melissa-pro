package com.mx.bot.mellissa.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestingMessageController {

	
	@GetMapping("name")
	public List<String>reponseTesting(){
		
		List<String> names = new  ArrayList<>();
		
		names.add("KATY");
		names.add("KAREN");
		names.add("PERLA");
		names.add("deploy successful");
		
		return names;
	}
	
}
