package com.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;


@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showForm() 
	{
		return "contact" ;
	}
	
}
