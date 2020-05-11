package com.shadowshop.app.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.shadowshop.app.dto.PagingDTO;
import com.shadowshop.app.dto.UserInfoAdminDTO;
import com.shadowshop.app.user.service.UserAdminService;

@Service
public class UserAdminServiceImpl implements UserAdminService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserAdminServiceImpl.class);

	@Override
	public List<UserInfoAdminDTO> getUsers(PagingDTO dto) {
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
		
		int start = dto.getCurrentPage();
		int perCount = dto.getPerPageCount(); //5개 까지 출력
		int size = list.size();     //전체 사이즈
		int realPageSu = (int) Math.ceil(list.size() / perCount); //몇페이지가 나오는 지 
		//start가 2라면 6번째 요소부터 격납해야함
		//start가 3이면 11부터 격납해야함
		 
		//2 * 5 = 10 == (5) - (2 * 5) == 5 - 10 => 5+1 => 6
		//3 * 5 = 15 == (5) - (3 * 5) == 5 - 15 => 10 + 1 => 11
		//4 * 5 = 20 == (5) - (4 * 5) == 5 - 20 => 15 + 1 => 16
		//
		int startCountSu = ((start * perCount)+1) - perCount;
		int maxCountSu = (start * perCount);
		
		List<UserInfoAdminDTO> returnList = new ArrayList<UserInfoAdminDTO>();
		int su = 1;
		for(UserInfoAdminDTO var : list) {
			logger.info("[1] su : "+su+", start : "+start+", perCount : "+perCount);
			if(su < startCountSu) {
				su++;
				continue;
			}
			if (maxCountSu < su) {
				break;
			}
			returnList.add(var);
			su++;
		}
		
		return returnList;
	}

	@Override
	public UserInfoAdminDTO getUser() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
