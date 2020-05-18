package com.shadowshop.app.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shadowshop.app.dto.PagingDTO;
import com.shadowshop.app.dto.UserInfoAdminDTO;
import com.shadowshop.app.dto.UserInfosAdminDTO;
import com.shadowshop.app.service.UserService;
import com.shadowshop.app.utils.PagingUtil;

@RestController
@RequestMapping("/userAdminRest")
public class UserAdminRestController {

	private static final Logger logger = LoggerFactory.getLogger(UserAdminRestController.class);
	
	@Autowired
	private UserService userService;
	
	/**
	 * 유저 목록
	 * @param dto
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public UserInfosAdminDTO userList(@ModelAttribute("paging") PagingDTO dto,
			Model model) {
		logger.info("Welcome to UserAdminList");
		logger.info(dto.toString());
		UserInfosAdminDTO returnDto = new UserInfosAdminDTO();
		
		List<UserInfoAdminDTO> list = userService.getUsers(dto);
		PagingUtil pu = new PagingUtil();
		pu.setDto(dto);
		//pu.setStartPage(dto.getCurrentPage());
		//pu.setEndPage(dto);
		pu.setTotalCount(15);
		model.addAttribute("paging", pu);
		logger.info(pu.toString());
		
		returnDto.setPagingUtil(pu);
		returnDto.setUserInfoList(list);
		
		return returnDto;
	}
	
	/**
	 * 유저 블럭 처리
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/block/{id}" , method = RequestMethod.PUT)
	public UserInfoAdminDTO userBlock(@PathVariable("id") String id) {
		
		return null;
	}
	
	/**
	 * 유저 삭제
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/delete/{id}" , method = RequestMethod.DELETE)
	public String deleteUserInfo(@PathVariable("id") int id,
			Model model) {
		
		
		return null;
	}
	
	
}
