package cgg.spring.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cgg.spring.mvc.modal.User1;
import cgg.spring.mvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header","Learning Spring MVC");
		m.addAttribute("Desc", "Home for Programmers");
		System.out.println("Adding common data");
	}
	
	
	@RequestMapping("/contacts")
	public String showForm() {
		System.out.println("Creating form");
		return "contact";
	}
	
	@RequestMapping(path="/processForm",method=RequestMethod.POST)
//	public String handleForm(@RequestParam(name="email", required=true) String email,
//			@RequestParam("username") String username,
//			@RequestParam("password") String password,Model model) {
	
	public String handleForm(@ModelAttribute ("user") User1 user,Model model) {
		/*
		 * String email = request.getParameter("email"); System.out.println(email);
		 */
		
//		System.out.println("userEmail: "+email);
//		System.out.println("userName: "+username);
//		System.out.println("userPassword: "+password);
//		
//		model.addAttribute("email",email);
//		model.addAttribute("name",username);
//		model.addAttribute("password",password);
		
		
//		User user = new User();
//		user.setEmail(email);
//		user.setUsername(username);
//		user.setPassword(password);
		
		System.out.println(user);
		int createUser = this.userService.createUser(user);
		model.addAttribute("msg", "User created with id: "+createUser);
		System.out.println("");
		
		//model.addAttribute("user", user);
		
		if(user.getUsername().isBlank()) {
			System.out.println("enter details");
			return "redirect:/contacts";
		}
		
		return "success";
	}
}
