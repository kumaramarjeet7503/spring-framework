package com.spring.controllers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileController {

	@RequestMapping("/file")
	public String form() 
	{
		
		return "file" ;
	}
	
	@RequestMapping(path="/upload",method=RequestMethod.POST)
	public String upload(@RequestParam("uploaded") CommonsMultipartFile file, HttpSession session ) throws IOException 
	{
		byte[] data = file.getBytes() ;
		String path = session.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"public"+File.separator+"image"+File.separator+file.getOriginalFilename() ;
		FileOutputStream fos = new FileOutputStream(path) ;
		fos.write(data) ;
		fos.close() ;
		System.out.println(path); 
		return "upload" ;
	}
	
	public FileController() {
		// TODO Auto-generated constructor stub
	}

}
