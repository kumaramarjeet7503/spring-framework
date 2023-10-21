package com.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.User;

import org.springframework.ui.Model;


@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showForm() 
	{
		return "contact" ;
	}
	
//	@RequestMapping(path="/process", method=RequestMethod.POST)
//	Get parameter value via request param
//	public String processForm(@RequestParam("username") String name, @RequestParam("useremail") String email , @RequestParam("userpassword") String password, Model model  ) 
//	{
//		model.addAttribute("name",name) ;
//		model.addAttribute("email",email) ;
//		model.addAttribute("password",password) ;
//		return "success" ;
//	}
	
	@RequestMapping(path="/process", method=RequestMethod.POST)
	public String processForm( @ModelAttribute User user ,Model model  ) 
	{
				return "success" ;
	}
	
}
