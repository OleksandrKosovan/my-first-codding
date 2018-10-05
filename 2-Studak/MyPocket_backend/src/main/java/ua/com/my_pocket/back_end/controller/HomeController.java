package ua.com.my_pocket.back_end.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String homeGet(){
		return "views-home-home";
	}
	
	@GetMapping("/home")
	public String homeGett(){
		return "views-home-home";
	}
}
