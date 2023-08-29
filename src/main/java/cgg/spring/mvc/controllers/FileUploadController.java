package cgg.spring.mvc.controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
<<<<<<< HEAD
import org.springframework.web.multipart.commons.CommonsMultipartFile;
=======
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartFile;
>>>>>>> b082afec00a03bdf70adca081f438a340077f4e8

import jakarta.servlet.http.HttpSession;

@Controller
public class FileUploadController {
	
	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetails(@PathVariable("userId") int id,@PathVariable("userName") String name) {
		System.out.println(id);
		System.out.println(name);
		Integer.parseInt(name);
		String str= null;
		System.out.println(str.length());

		return "homie";
	}
	
	
	
	@RequestMapping("/fileform")
	public String showUploadForm() {
		int [] a= {1,2,3,4,5};
		a[13]=5;
		return "fileform";
	}
	
	@RequestMapping(path="/uploadimage", method=RequestMethod.POST)
<<<<<<< HEAD
	public String fileUpload(@RequestParam("profile") CommonsMultipartFile part) {
		if(!part.isEmpty()) {
			return "fileform";
		}
		else {
=======
	public String fileUpload(@RequestParam("profile") MultipartFile part, HttpSession s, Model m) {
>>>>>>> b082afec00a03bdf70adca081f438a340077f4e8
			System.out.println("file uploader handler");
			System.out.println(part.getSize());
			System.out.println(part.getContentType());
//			System.out.println(part.get);
			System.out.println(part.getName());
			System.out.println(part.getOriginalFilename());
			byte[] data=null;
			
			
			try {
				data = part.getBytes();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//we have to save file to server
			String path=s.getServletContext().getRealPath("/")+"WEB-INF"
					+File.separator+"resources"+File.separator+"images"+File.separator+part.getOriginalFilename();
			System.out.println(path);
			
			try {
				FileOutputStream fos = new FileOutputStream(path);
				try {
					fos.write(data);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("File uploaded successfully");
				m.addAttribute("msg", "File Uploaded");
				m.addAttribute("filename", part.getOriginalFilename());
			} 
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Uploading error");
				m.addAttribute("msg", "uploading error");
			}
			
			return "fileUploadSuccess";
		}
		
		//handling exception in springMVC:
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value= NullPointerException.class)
//	public String exceptionalHandlerNull(Model m) {
//		System.out.println("exceptionalHandlerNull");
//		m.addAttribute("msg", "Null Pointer exception occurred");
//		return "error_page";
//	}
//	
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value= NumberFormatException.class)
//	public String exceptionalHandlerNumberFormat(Model m) {
//		System.out.println("exceptionalHandlerNumberFormat");
//		m.addAttribute("msg", "Number Format exception occurred");
//		return "error_page";
//	}
//	
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value= Exception.class)
//	public String exceptionalHandlerGeneric(Model m) {
//		System.out.println("exceptionalHandlerGeneric");
//		m.addAttribute("msg", "Generic exception occurred");
//		return "error_page";
//	}
		
	}

