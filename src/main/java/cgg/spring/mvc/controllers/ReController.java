package cgg.spring.mvc.controllers;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class ReController {
	
	@RequestMapping("/one")
//	public String one() {
	public RedirectView one() {
		System.out.println("This is first Handler");
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("two");
		return redirectView;
	}
	@RequestMapping("/two")
	public String two() {
		System.out.println("This is second Handler");
		return "contact";
	}
	
	
	//HttpServletResponse
	@RequestMapping("/three")
	public void three(HttpServletResponse response) throws IOException {
		response.sendRedirect("one");
		
	}
}
