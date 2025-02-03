package com.api.portfolio.game;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/api")
public class GameController {
	
	@GetMapping("/game")
	public String getUSer(Model model) {
		
		return "game";
	}

}
