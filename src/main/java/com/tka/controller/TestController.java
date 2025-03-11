package com.tka.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/one")
	public String msg() {
		return "hello";
	}
	@GetMapping("/get-user/{id}")
	public int getUser(@PathVariable int id) {
		return id;
	}

	@GetMapping("/login/{username}/{password}")
	public String getUsernamePassword(@PathVariable String username,@PathVariable String password) {
		return username + " " + password;
	}
	@GetMapping("/user_by_name")
	public String getUsername(@RequestParam String username , @RequestParam String password) {
		return username;
	
	}
	
	@PostMapping("/add-product")
	public Object addProduct( @RequestBody Product product) {
		return product;
	}
	
	@GetMapping("/show-product")
	public Object showProduct(@RequestBody Product product) {
		return product;
	}
	
}
