package com.shadowshop.app.service;

import java.util.List;

import com.shadowshop.app.dto.PagingDTO;
import com.shadowshop.app.dto.UserInfoAdminDTO;
import com.shadowshop.app.vo.UserVO;

public interface UserService {

	/**
	 * 유저 목록
	 * @param dto
	 * @return
	 */
	List<UserInfoAdminDTO> getUsers(PagingDTO dto);
	
	/**
	 * 유저 상세
	 * @param no
	 * @return
	 */
	UserInfoAdminDTO getUser(int no);
	
	/**
	 * 유저 생성
	 * @param userinfo
	 * @return
	 */
	UserInfoAdminDTO createUser(UserVO userinfo);
	
	/**
	 * 유저 갱신
	 * @param dto
	 * @return
	 */
	UserInfoAdminDTO updateUser(UserInfoAdminDTO dto);
	
}
