package com.api.portfolio;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {
		return "hello world";
	}
	
	@GetMapping("/data")
	public Map<String, String> data(){
		Map<String, String> response = new HashMap<>();
		response.put("data", "value");
		return response;
	}

}
