package com.shadowshop.app.rest;

import java.util.List;
import java.util.Map;

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

import com.shadowshop.app.dto.MemberInfoAdminDTO;
import com.shadowshop.app.dto.PagingDTO;
import com.shadowshop.app.dto.UserInfoListAdminDTO;
import com.shadowshop.app.service.MemberService;
import com.shadowshop.app.utils.PagingUtil;

@RestController
@RequestMapping("/userAdminRest")
public class MemberAdminRestController {

	private static final Logger logger = LoggerFactory.getLogger(MemberAdminRestController.class);
	
	@Autowired
	private MemberService memberService;
	
	/**
	 * 유저 목록
	 * @param dto
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public UserInfoListAdminDTO userList(@ModelAttribute("paging") PagingDTO dto,
			Model model) {
		logger.info("Welcome to UserAdminList");
		logger.info(dto.toString());
		UserInfoListAdminDTO returnDto = new UserInfoListAdminDTO();
		
		Map map = memberService.getMembers(dto);
		PagingUtil pu = new PagingUtil();
		
		pu.setDto((PagingDTO) map.get("pagingDTO"));
		pu.setTotalCount((int) map.get("totalCount"));

		logger.info(pu.toString());
		
		returnDto.setPagingUtil(pu);
		returnDto.setUserInfoList((List<MemberInfoAdminDTO>) map.get("memberInfoList"));
		
		return returnDto;
	}
	
	/**
	 * 유저 블럭 처리
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/block/{id}" , method = RequestMethod.PUT)
	public MemberInfoAdminDTO userBlock(@PathVariable("id") String id) {
		
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
