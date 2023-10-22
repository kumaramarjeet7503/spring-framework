package com.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {


	@RequestMapping("/app")
	public String app( ) 
	{
		
		return "search_app" ;
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("queryBox") String query ) 
	{
		String url = "https://www.google.com/search?q="+query ;
		RedirectView redirectView = new RedirectView() ;
		redirectView.setUrl(url) ;
		
		return redirectView ;
	}
	
	public SearchController() {
		// TODO Auto-generated constructor stub
	}

}
