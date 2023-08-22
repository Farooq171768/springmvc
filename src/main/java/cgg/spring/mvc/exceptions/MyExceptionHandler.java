package cgg.spring.mvc.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {

	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value= NullPointerException.class)
	public String exceptionalHandlerNull(Model m) {
		System.out.println("exceptionalHandlerNull");
		m.addAttribute("msg", "Null Pointer exception occurred");
		return "error_page";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value= NumberFormatException.class)
	public String exceptionalHandlerNumberFormat(Model m) {
		System.out.println("exceptionalHandlerNumberFormat");
		m.addAttribute("msg", "Number Format exception occurred");
		return "error_page";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value= Exception.class)
	public String exceptionalHandlerGeneric(Model m) {
		System.out.println("exceptionalHandlerGeneric");
		m.addAttribute("msg", "Generic exception occurred");
		return "error_page";
	}
}
