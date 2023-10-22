package com.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.ui.Model;

// For Marking class as Controller
@Controller

//  Acts a outside door , relative mappings
@RequestMapping("/default")
public class HomeController {
	
	@RequestMapping(path = "/home" , method = RequestMethod.GET )
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
//		Redirect via redirect keyword 
		return "redirect:help" ;
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
	
	@RequestMapping("/book/{bookId}")
	public RedirectView book(@PathVariable("bookId") int bookId) 
	{
		System.out.println(bookId);
		RedirectView redirectView = new RedirectView() ;
		redirectView.setUrl("help") ;
		return redirectView ;
	}
	
//	 Error handling if exception occurs 
	@ExceptionHandler(NullPointerException.class)
	public String nullExceptionHandler() 
	{
		return "nullPointer" ;
	}
	
}
