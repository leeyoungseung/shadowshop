package com.shadowshop.app.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shadowshop.app.dto.LoginAdminDTO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model, HttpServletRequest req) {
		logger.info("Welcome Shadow Shop! The client locale is {}.", locale);
		
		HttpSession session = req.getSession();
		LoginAdminDTO dto = (LoginAdminDTO)session.getAttribute("logined_dto");
		if (dto == null || dto.getWebid().equals("")) {
			logger.info("Move to Login");
			return "forward:/auth/login";
		}
		
		logger.info("Move to AdminMain");
		return "forward:/adminMain";
	}
	
	@RequestMapping(value = "/adminMain", method = RequestMethod.GET)
	public String AdminMainGet(Model model, HttpServletRequest req) {
		logger.info("Welcome to adminMain Page (GET)");
		HttpSession session = req.getSession();
		LoginAdminDTO dto = (LoginAdminDTO)session.getAttribute("logined_dto");
		if (dto == null || dto.getWebid().equals("")) {
			logger.info("Move to Login");
			return "forward:/auth/login";
		}
		return "adminMain";
	}
	
	@RequestMapping(value = "/adminMain", method = RequestMethod.POST)
	public String AdminMainPost(Model model, HttpServletRequest req) {
		logger.info("Welcome to adminMain Page (POST)");
		HttpSession session = req.getSession();
		LoginAdminDTO dto = (LoginAdminDTO)session.getAttribute("logined_dto");
		if (dto == null || dto.getWebid().equals("")) {
			logger.info("Move to Login");
			return "forward:/auth/login";
		}
		
		return "adminMain";
	}
	
}
