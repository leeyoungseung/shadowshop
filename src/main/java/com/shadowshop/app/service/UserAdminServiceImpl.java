package com.shadowshop.app.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.shadowshop.app.dto.UserInfoAdminDTO;
import com.shadowshop.app.user.service.UserAdminService;

@Service
public class UserAdminServiceImpl implements UserAdminService {

	@Override
	public List<UserInfoAdminDTO> getUsers() {
		List<UserInfoAdminDTO> list = new ArrayList<UserInfoAdminDTO>();
		list.add(new UserInfoAdminDTO(1,"lee-y1@gmail.com","lee-y1","david1",new Date(),new Date(),"normal"));
		list.add(new UserInfoAdminDTO(1,"lee-y2@gmail.com","lee-y2","david2",new Date(),new Date(),"block"));
		list.add(new UserInfoAdminDTO(1,"lee-y3@gmail.com","lee-y3","david3",new Date(),new Date(),"special"));
		list.add(new UserInfoAdminDTO(1,"lee-y4@gmail.com","lee-y4","david4",new Date(),new Date(),"removed"));
		list.add(new UserInfoAdminDTO(1,"lee-y5@gmail.com","lee-y5","david5",new Date(),new Date(),"normal"));
		return list;
	}

	@Override
	public UserInfoAdminDTO getUser() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
