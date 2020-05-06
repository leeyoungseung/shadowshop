package com.shadowshop.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
import com.shadowshop.app.dto.LoginAdminDTO;
import com.shadowshop.app.utils.ValidUtil;

@Controller
@RequestMapping("/auth")
public class AuthAdminController {

	private static final Logger logger = LoggerFactory.getLogger(AuthAdminController.class);
	
	@Autowired
	AuthAdminService authAdminServie;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		logger.info("Welcome to Login Page");
		model.addAttribute("loginForm", new LoginAdminDTO());
		return "/auth/loginForm";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(LoginAdminDTO dto, HttpServletRequest req, BindingResult result) {
		logger.info("Welcome to Login Post");
		logger.info("1.Check Validation");
		if(dto == null) {
			logger.info(dto.toString());
			req.setAttribute("msg", "Validation Check Error(1)");
			return "redirect:/auth/login";
		}
		if(dto.getWebid().equals("") || 
			dto.getPassword().equals("")||
			dto.getWebid() == null ||
			dto.getPassword() == null) {
			logger.info(dto.toString());
			req.setAttribute("msg", "Validation Check Error(2)");
			return "redirect:/auth/login";
		}
		
		if (!ValidUtil.validation(ValidConfig.EMAIL, dto.getWebid()) ||
			!ValidUtil.validation(ValidConfig.PASSWORD, dto.getPassword())
			) {
			logger.info(dto.toString());
			req.setAttribute("msg", "Validation Check Error(3)");
			return "redirect:/auth/login";
		}
		
		logger.info("2.Check Value From DB");
		LoginAdminDTO adminDTO = authAdminServie.login(dto);
		HttpSession session = req.getSession();
		
		session.setAttribute("logined_dto", adminDTO);
		return "forward:/adminMain";
	}
	
	@RequestMapping(value= "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest req) {
		logger.info("Welcome to logout");
		HttpSession session = req.getSession();
		LoginAdminDTO dto = (LoginAdminDTO)session.getAttribute("logined_dto");
		req.setAttribute("msg", "Administrator [ "+dto.getWebid()+" ] Logout");
		session.removeAttribute("logined_dto");
		
		return "forward:/auth/login";
	}
}
