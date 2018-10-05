package ua.com.kosovan.bookset.controller;

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

	@GetMapping("/firstpage")
	public String firstpage() {
		return "views-shop-firstpage";
	}

	@GetMapping("/map")
	public String map() {
		return "views-shop-map";
	}

	@GetMapping("/list")
	public String list() {
		return "views-shop-list";
	}

	@GetMapping("/adminpage")
	public String admin() {
		return "views-admin-adminpage";
	}

}
