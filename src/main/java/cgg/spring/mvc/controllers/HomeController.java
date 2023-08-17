package cgg.spring.mvc.controllers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is home url");
		
		model.addAttribute("name","Raju");
		model.addAttribute("id",1);
		
		List<String> friends= new ArrayList<>();
		friends.add("Farooq");
		friends.add("Raju");
		friends.add("Vamshi");
		friends.add("Ajay");
		friends.add("Sanjeeva");
		
		model.addAttribute("friends", friends);
		return "index";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help controller");
		//create ModelAndView object
		ModelAndView modelAndView = new ModelAndView();
		//setting the data:
		modelAndView.addObject("name","Farooq");
		modelAndView.addObject("rollNo",1768);
		
		
		modelAndView.addObject("time",LocalDateTime.now());
		List<Integer> marks = new ArrayList<>();
		marks.add(100);
		marks.add(95);
		marks.add(89);
		marks.add(76);
		
		modelAndView.addObject("marks",marks);
		
		//setting the view name
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
