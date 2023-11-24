package com.cg.loginService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.loginService.model.User;
import com.cg.loginService.repository.LoginRepository;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginRepository repository;
	
	@GetMapping("/register")
	public String index() {
		return "registerPage";
	}
	
	@GetMapping("/login")
	public String loginUserPage() {
		return "loginPage";
	}
	
//	@RequestBody
//	public String saveDetails(@RequestBody User user){
//		repository.save(user);
//		return "User details added " + user.getEmail();
//	}
	
	@PostMapping("/registered")
	public String userRegistration(@ModelAttribute User user, Model model) {
		System.out.println(user.toString());
		// validate 
		System.out.println(user.getFname());
		System.out.println(user.getLname());
		System.out.println(user.getDob());
		System.out.println(user.getEmail());
		model.addAttribute("firstname", user.getFname());
		model.addAttribute("lastname", user.getLname());
		model.addAttribute("mailId",user.getEmail());
		repository.save(user);
		return "welcome";
	}
	
	@GetMapping("/loggedIn")
	public String loginUser(@ModelAttribute User user, Model model) {
		List<User> userList = repository.findAll();
		//System.out.println(userList);
		//System.out.println(user);
		for (User usr:userList) {
			//System.out.println(usr);
			if(usr.getEmail().equals(user.getEmail())) {
				if(usr.getPasswd().equals(user.getPasswd())) {
					//System.out.println(usr.getEmail());
					model.addAttribute("firstname", user.getFname());
					model.addAttribute("lastname", user.getLname());
					model.addAttribute("mailId",user.getEmail());
					return "welcome";
				}
			}
		}
		return "loginFailed";
	}

	
	
	
}
