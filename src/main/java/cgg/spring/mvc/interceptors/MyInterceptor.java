package cgg.spring.mvc.interceptors;

import java.io.PrintWriter;

import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor{
	
	 @Override
	    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
	        // Your interceptor logic before the request is handled by the controller
		 System.out.println("this is pre handler");
		 if(request.getParameter("user").startsWith("d")) {
			 response.setContentType("text/html");
			 PrintWriter writer = response.getWriter();
			 writer.println("<h1>Invalid name.. Name should not start with 'd'</h1>");
			 return false;
		 }
	        return true; // Return true to allow the request to proceed to the controller
	    }

}
