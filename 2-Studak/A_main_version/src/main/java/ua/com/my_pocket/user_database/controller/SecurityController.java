package ua.com.my_pocket.user_database.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ua.com.my_pocket.user_database.entity.User;
import ua.com.my_pocket.user_database.service.MailSenderService;
import ua.com.my_pocket.user_database.service.UserService;

/**
 * 
 * @author Kosovan Olexandr
 * @version 1.1
 * @class that controls security link
 */

@Controller
public class SecurityController {

	@Autowired
	private MailSenderService mailSenderService;

	@Autowired
	private UserService userService;

	@GetMapping("/login")
	public String login() {
		return "views-security-login";
	}

	@GetMapping("/registration")
	public String registration(Model model) {
		model.addAttribute("user", new User());
		return "views-security-registration";
	}

	@PostMapping("/logout")
	public String logout() {
		return "redirect:/";
	}

	@PostMapping("/registration")
	public String registrationUser(@ModelAttribute User user, Model model) {

		String uuid = UUID.randomUUID().toString();

		user.setUUID(uuid);
		try {
			userService.save(user);
		} catch (Exception e) {
			model.addAttribute("exception", e.getMessage() + " !!!! ");
			return "views-security-registration";
		}

		String theme = "thank`s for registration";
		String messege = "ql & hf http://localhost:8080/User_and_mainDB/confirm/" + uuid;

		mailSenderService.sendMail(theme, messege, user.getEmail());

		return "redirect:/registration";
	}

	@GetMapping("/confirm/{uuid}")
	public String saveSave(@PathVariable String uuid) {

		User user = userService.findByUuid(uuid);
		user.setEnabled(true);

		userService.update(user);

		return "redirect:/";
	}

	@PostMapping("/home")
	public String loginprocesing() {

		return "redirect:/home";
	}

}
