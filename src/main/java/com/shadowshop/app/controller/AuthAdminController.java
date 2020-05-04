package com.shadowshop.app.controller;

import javax.sound.midi.MidiDevice.Info;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.shadowshop.app.auth.service.AuthAdminService;
import com.shadowshop.app.config.ValidConfig;
import com.shadowshop.app.dto.AdminLoginDTO;
import com.shadowshop.app.utils.ValidUtil;

@Controller
@RequestMapping("/auth")
public class AuthAdminController {

	private static final Logger logger = LoggerFactory.getLogger(AuthAdminController.class);
	
	@Autowired
	AuthAdminService authAdminServie;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		logger.info("Move to Login Page");
		model.addAttribute("loginForm", new AdminLoginDTO());
		return "/auth/loginForm";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(AdminLoginDTO dto, Model model, BindingResult result) {
		logger.info("1.Check Validation");
		if(dto == null) { return "redirect:/auth/login"; }
		if(dto.getWebid().equals("") || 
			dto.getPassword().equals("")||
			dto.getWebid() == null ||
			dto.getPassword() == null) {
			logger.info(dto.toString());
			return "redirect:/auth/login";
		}
		
		if (!ValidUtil.validation(ValidConfig.EMAIL, dto.getWebid()) ||
			!ValidUtil.validation(ValidConfig.PASSWORD, dto.getPassword())
			) {
			logger.info(dto.toString());
			return "redirect:/auth/login";
		}
		
		logger.info("2.Check Value From DB");
		AdminLoginDTO adminDTO = authAdminServie.login(dto);
		
		model.addAttribute("dto", adminDTO);
		return "forward:/adminMain";
	}
}
