package ua.com.young_dream.stud_id.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Index_controller {

	@GetMapping("/")
	public String start() {

		return "views-main-index";
	}

	@GetMapping("/index")
	public String starth() {

		return "views-main-index";
	}

}
