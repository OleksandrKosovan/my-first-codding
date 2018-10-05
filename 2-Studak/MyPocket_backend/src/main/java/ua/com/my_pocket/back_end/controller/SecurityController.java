package ua.com.my_pocket.back_end.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

	@GetMapping("/registration")
	public String registration(){
		
		return "views-security-registration";
	}
	
	@GetMapping("/login")
	public String login(){
		
		return "views-security-login";
	}
}
