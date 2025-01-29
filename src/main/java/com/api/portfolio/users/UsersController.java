package com.api.portfolio.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UsersController {
    private final UserService userService;
    
    public UsersController(UserService userService) {
        this.userService = userService;
    }
	
	@GetMapping("/users")
	public String users() {
		String response = "hello world";
		return response;
	}
	
    @PostMapping("/create-user")
    public UserModel crearUsuario(@RequestBody UserModel user) {
        return userService.save(user);
    }

}