package com.spring.handler;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;

// Handles all controller errors within spring project 
@ControllerAdvice
public class ExceptionHandler {

	
//	 Error handling if exception occurs 
	@org.springframework.web.bind.annotation.ExceptionHandler(NullPointerException.class)
//	set configured Response status
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	public String nullExceptionHandler(Model model) 
	{
		return "nullPointer" ;
	}
	
	public ExceptionHandler() {
		// TODO Auto-generated constructor stub
	}

}
