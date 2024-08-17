package com.example.project_x;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/welcome")
	public String welcome(@RequestParam("username") String username, Model model) {
		model.addAttribute("username", username);
		return "welcome";
	}
}
