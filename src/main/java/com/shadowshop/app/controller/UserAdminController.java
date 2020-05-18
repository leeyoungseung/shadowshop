package com.shadowshop.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shadowshop.app.dto.UserInfoAdminDTO;
import com.shadowshop.app.dto.UserInfosAdminDTO;
import com.shadowshop.app.service.UserService;

@Controller
@RequestMapping("/userAdmin")
public class UserAdminController {

	private static final Logger logger = LoggerFactory.getLogger(UserAdminController.class);
	
	@Autowired
	private UserService userService;
	
	/**
	 * 회원 관리 메인
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String UserAdminMain(Model model) {
		logger.info("Welcome to UserAdminMain Page");
		
		return "/userAdmin/userAdminMain";
	}
	
    /**
     * 회원정보 상세
     * @param id
     * @param model
     * @return
     */
	@RequestMapping(value = "/info/{id}", method = RequestMethod.GET)
	public String getUserInfoOne(@PathVariable("id") int id,Model model) {
		logger.info("Welcome to getUserInfoOne Page");
		UserInfoAdminDTO user = userService.getUser(id);
		model.addAttribute("user", user);
		
		return "/userAdmin/userAdminRead";
	}
	
    /**
     * 회원정보 수정 페이지 이동
     * @param id
     * @param model
     * @return
     */
	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String updateUserInfo(@PathVariable("id") int id,Model model) {
		logger.info("Welcome to getUserInfoOne Page");
		UserInfoAdminDTO user = userService.getUser(id);
		model.addAttribute("user", user);
		
		return "/userAdmin/userAdminUpdate";
	}
	
	/**
	 * 회원정보 수정
	 * @param dto
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
	public String updateUserInfo(@RequestAttribute UserInfosAdminDTO dto,
			BindingResult result){
		
		int id = 0;
		return "forward:/userAdmin/update/"+id;
	}
	

	
	
}
