package com.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

// For Marking class as Controller
@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) 
	{
		model.addAttribute("name","Amarjeet");
		model.addAttribute("company","Xtreme softech") ;
		
		return "index" ;
	}
	
//	For linking with url request 
	@RequestMapping("/about")
	public String about() 
	{
		System.out.println("This is about url");
		return "about" ;
	}
	
//	 For model and view example
	@RequestMapping("/help")
	public ModelAndView help() 
	{
//		Set data and view into model and view object
		ModelAndView modelAndView = new ModelAndView() ;
		modelAndView.addObject("name","Amarjeet");
		modelAndView.setViewName("help") ;
		return modelAndView ;
	}
}
