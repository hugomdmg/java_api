package com.api.portfolio.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UsersController {
	
	@GetMapping("/users")
	public String users() {
		String url = System.getenv("MONGO_URL");
		return url;
	}

}