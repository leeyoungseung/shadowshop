package com.shadowshop.app.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shadowshop.app.dto.UserInfoAdminDTO;
import com.shadowshop.app.user.service.UserAdminService;

@RestController
@RequestMapping("/userAdminRest")
public class UserAdminRestController {

	private static final Logger logger = LoggerFactory.getLogger(UserAdminRestController.class);
	
	@Autowired
	private UserAdminService userAdminService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<UserInfoAdminDTO> UserAdminList(HttpServletRequest req) {
		logger.info("Welcome to UserAdminList");
		List<UserInfoAdminDTO> list = userAdminService.getUsers();
		int su = 0;
		for (UserInfoAdminDTO dto : list) {
			su++;
			logger.info("UserInfoAdminDTO ["+su+"]");
			logger.info(dto.toString());
		}
		
		return list;
	}
}
