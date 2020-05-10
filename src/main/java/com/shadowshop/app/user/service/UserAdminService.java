package com.shadowshop.app.user.service;

import java.util.List;

import com.shadowshop.app.dto.PagingDTO;
import com.shadowshop.app.dto.UserInfoAdminDTO;

public interface UserAdminService {

	List<UserInfoAdminDTO> getUsers(PagingDTO dto);
	UserInfoAdminDTO getUser();
	
}
