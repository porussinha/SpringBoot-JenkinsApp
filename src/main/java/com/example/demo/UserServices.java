package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServices {
	
	@RequestMapping(value = "/get/{name}",method = RequestMethod.GET)
	public String getMessage(@PathVariable String name )
	{
		return "Welcome to Mr. "+name;
	}

}
