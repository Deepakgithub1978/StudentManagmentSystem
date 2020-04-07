package com.SpringBootExample.Controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home 
{
	@GetMapping
	public String home()
	{
		return "Welcome to Student Managment System"+ "\n" + new Date();
	}
}
