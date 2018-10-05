package ua.com.kosovan.bookset.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ua.com.kosovan.bookset.entity.User;
import ua.com.kosovan.bookset.service.MailSenderService;
import ua.com.kosovan.bookset.service.UserService;


@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private MailSenderService mailSenderService;

	@PostMapping("/logout")
	public String logout() {
		return "redirect:/";
	}

	@PostMapping("/index")
	public String loginprocesing() {
		return "redirect:/index";
	}

	@GetMapping("/registration")
	public String registration(Model model) {
		model.addAttribute("user", new User());
		return "views-user-registration";
	}

	@PostMapping("/registration")
	public String regPost(@ModelAttribute User user, Model model) {
		String uuid = UUID.randomUUID().toString();

		user.setUUID(uuid);
		userService.save(user);
		String theme = "thank`s for registration";
		String messege = "click on link http://localhost:8080/BookSet/confirm/" + uuid;

		mailSenderService.sendMail(theme, messege, user.getEmail());

		return "redirect:/registration";
	}

	@GetMapping("/loginpage")
	public String login() {

		return "views-user-loginpage";
	}
	
	@GetMapping("/confirm/{uuid}")
	public String saveSave (@PathVariable String uuid){
		
		User user = userService.findByUuid(uuid);
		user.setEnabled(true);
		
		userService.update(user);
		
		return "redirect:/";
	}

}
