package com.shadowshop.app.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shadowshop.app.dto.PagingDTO;
import com.shadowshop.app.dto.UserInfoAdminDTO;
import com.shadowshop.app.dto.UserInfosAdminDTO;
import com.shadowshop.app.user.service.UserAdminService;
import com.shadowshop.app.utils.PagingUtil;

@RestController
@RequestMapping("/userAdminRest")
public class UserAdminRestController {

	private static final Logger logger = LoggerFactory.getLogger(UserAdminRestController.class);
	
	@Autowired
	private UserAdminService userAdminService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public UserInfosAdminDTO UserAdminList(@ModelAttribute("paging") PagingDTO dto,
			Model model) {
		logger.info("Welcome to UserAdminList");
		logger.info(dto.toString());
		UserInfosAdminDTO returnDto = new UserInfosAdminDTO();
		
		List<UserInfoAdminDTO> list = userAdminService.getUsers(dto);
		PagingUtil pu = new PagingUtil();
		pu.setDto(dto);
		pu.setTotalCount(15);
		model.addAttribute("paging", pu);
		logger.info(pu.toString());
		
		returnDto.setPagingUtil(pu);
		returnDto.setUserInfoList(list);
		
		return returnDto;
	}
}
