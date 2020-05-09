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
		list.add(new UserInfoAdminDTO(2,"lee-y2@gmail.com","lee-y2","david2",new Date(),new Date(),"block"));
		list.add(new UserInfoAdminDTO(3,"lee-y3@gmail.com","lee-y3","david3",new Date(),new Date(),"special"));
		list.add(new UserInfoAdminDTO(4,"lee-y4@gmail.com","lee-y4","david4",new Date(),new Date(),"removed"));
		list.add(new UserInfoAdminDTO(5,"lee-y5@gmail.com","lee-y5","david5",new Date(),new Date(),"normal"));
		list.add(new UserInfoAdminDTO(6,"lee-y6@gmail.com","lee-y6","david6",new Date(),new Date(),"normal"));
		list.add(new UserInfoAdminDTO(7,"lee-y7@gmail.com","lee-y7","david7",new Date(),new Date(),"block"));
		list.add(new UserInfoAdminDTO(8,"lee-y8@gmail.com","lee-y8","david8",new Date(),new Date(),"special"));
		list.add(new UserInfoAdminDTO(9,"lee-y9@gmail.com","lee-y9","david9",new Date(),new Date(),"removed"));
		list.add(new UserInfoAdminDTO(10,"lee-y10@gmail.com","lee-y10","david10",new Date(),new Date(),"normal"));
		list.add(new UserInfoAdminDTO(11,"lee-y11@gmail.com","lee-y11","david11",new Date(),new Date(),"normal"));
		list.add(new UserInfoAdminDTO(12,"lee-y12@gmail.com","lee-y12","david12",new Date(),new Date(),"block"));
		list.add(new UserInfoAdminDTO(13,"lee-y13@gmail.com","lee-y13","david13",new Date(),new Date(),"special"));
		list.add(new UserInfoAdminDTO(14,"lee-y14@gmail.com","lee-y14","david14",new Date(),new Date(),"removed"));
		list.add(new UserInfoAdminDTO(15,"lee-y15@gmail.com","lee-y15","david15",new Date(),new Date(),"normal"));
		return list;
	}

	@Override
	public UserInfoAdminDTO getUser() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
