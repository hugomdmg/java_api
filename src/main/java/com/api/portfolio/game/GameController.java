package com.api.portfolio.game;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/api")
public class GameController {
	
	@GetMapping("/game/{id}")
	public String getUSer(@PathVariable("id") Long id, Model model) {
		
		model.addAttribute("id", id);
		return "game";
	}

}
