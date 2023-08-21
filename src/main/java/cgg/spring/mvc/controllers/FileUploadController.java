package cgg.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {
	
	@RequestMapping("/fileform")
	public String showUploadForm() {
		return "fileform";
	}
	
	@RequestMapping(path="/uploadimage", method=RequestMethod.POST)
	public String fileUpload(@RequestParam("profile") MultipartFile part) {
		if(!part.isEmpty()) {
			return "fileform";
		}
		else {
			System.out.println("file uploader handler");
			System.out.println(part.getSize());
			System.out.println(part.getContentType());
//			System.out.println(part.get);
			System.out.println(part.getName());
			return "fileUploadSuccess";
		}
		
		
		
	}

}
