package com.boystyle.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private static Logger log = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping("/list")
	public String userlist(){
		
		log.debug("this is use lsit -------------------------------");
		return "hello";
	}
	

}
