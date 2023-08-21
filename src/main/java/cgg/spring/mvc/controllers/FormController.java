package cgg.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cgg.spring.mvc.modal.Student;

@Controller
public class FormController {

	@RequestMapping("/complex")
	public String showForm() {
		System.out.println("Complex form running....");
		return "complex_form";
	}
	
	@RequestMapping(path="/handleForm", method=RequestMethod.POST)
	public String formHandler(@ModelAttribute Student student, BindingResult result) {
		if(result.hasErrors()) {
			//System.out.println(result.hasErrors());
			return "complex_form";
		}
		System.out.println(student);
		System.out.println(student.getAddress());
		return "form_success";
	}
}
