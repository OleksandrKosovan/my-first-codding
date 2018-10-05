package ua.com.my_pocket.user_database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
/**
 * 
 * @author Kosovan Olexandr
 * @version 1.0
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ua.com.my_pocket.user_database.entity.UserDataBase;
import ua.com.my_pocket.user_database.service.UserDataBaseService;

/**
 * @author Kosovan Olexandr
 * @version 1.0
 */
@Controller
public class State_RegistrationController {

	@Autowired
	private UserDataBaseService userDataBaseService;

	@GetMapping("/addObject")
	public String object() {
		return "views-state_registration-addObject";
	}

	@GetMapping("/main_panel")
	public String main_panel() {
		return "views-state_registration-main_panel";
	}

	@GetMapping("/addUserToDB")
	public String newPerson(Model model) {
		model.addAttribute("userDataBase", new UserDataBase());
		return "views-state_registration-addUserToDB";
	}

	@PostMapping("/addUserToDB")
	public String addPerson(@ModelAttribute UserDataBase userDataBase, Model model) {
		try {
			userDataBaseService.save(userDataBase);
		} catch (Exception e) {
			model.addAttribute("exception", e.getMessage() + " LOL");
			return "views-state_registration-addUserToDB";
		}
		return "redirect:/addUserToDB";
	}
}
