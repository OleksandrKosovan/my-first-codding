package ua.com.my_pocket.user_database.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Kosovan Olexandr
 * @version 1.0
 * @class that controls main links and transfers date
 */

@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		return "views-home-home";
	}

	@GetMapping("/home")
	public String home() {
		return "views-home-home";
	}

}
