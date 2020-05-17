package com.shadowshop.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shadowshop.app.dto.UserInfoAdminDTO;
import com.shadowshop.app.service.UserService;

@Controller
@RequestMapping("/userAdmin")
public class UserAdminController {

	private static final Logger logger = LoggerFactory.getLogger(UserAdminController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String UserAdminMain(Model model) {
		logger.info("Welcome to UserAdminMain Page");
		
		return "/userAdmin/userAdminMain";
	}
	
	@RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
	public String getUserInfoOne(@PathVariable("id") int id,Model model) {
		logger.info("Welcome to getUserInfoOne Page");
		UserInfoAdminDTO user = userService.getUser(id);
		model.addAttribute("user", user);
		
		return "/userAdmin/userAdminRead";
	}
	
	
	
}
