package com.shadowshop.app.serviceimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.shadowshop.app.dto.PagingDTO;
import com.shadowshop.app.dto.UserInfoAdminDTO;
import com.shadowshop.app.service.UserService;
import com.shadowshop.app.vo.UserVO;

@Service
public class UserAdminServiceImpl implements UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserAdminServiceImpl.class);
	
	List<UserInfoAdminDTO> list = null;
	
	public UserAdminServiceImpl() {
		list = new ArrayList<UserInfoAdminDTO>();
		UserInfoAdminDTO dto1 = new UserInfoAdminDTO();
		UserInfoAdminDTO dto2 = new UserInfoAdminDTO();
		UserInfoAdminDTO dto3 = new UserInfoAdminDTO();
		UserInfoAdminDTO dto4 = new UserInfoAdminDTO();
		UserInfoAdminDTO dto5 = new UserInfoAdminDTO();
		UserInfoAdminDTO dto6 = new UserInfoAdminDTO();
		UserInfoAdminDTO dto7 = new UserInfoAdminDTO();
		UserInfoAdminDTO dto8 = new UserInfoAdminDTO();
		UserInfoAdminDTO dto9 = new UserInfoAdminDTO();
		UserInfoAdminDTO dto10 = new UserInfoAdminDTO();
		UserInfoAdminDTO dto11 = new UserInfoAdminDTO();
		UserInfoAdminDTO dto12 = new UserInfoAdminDTO();
		UserInfoAdminDTO dto13 = new UserInfoAdminDTO();
		UserInfoAdminDTO dto14 = new UserInfoAdminDTO();
		UserInfoAdminDTO dto15 = new UserInfoAdminDTO();
		UserVO vo1 = new UserVO();
		vo1.setNo(1);
		vo1.setId("lee-y0001@gmail.com");
		vo1.setName("Lee");
		vo1.setNickname("Build Tiger");
		vo1.setJoineddate(new Date());
		dto1.setUser(vo1);
		
		list.add(dto1);
		list.add(dto1);
		list.add(dto1);
		list.add(dto1);
		list.add(dto1);
		list.add(dto1);
		list.add(dto1);
		list.add(dto1);
		list.add(dto1);
		list.add(dto1);
		list.add(dto1);
		list.add(dto1);
		list.add(dto1);
		list.add(dto1);
		list.add(dto1);
		
	}

	@Override
	public List<UserInfoAdminDTO> getUsers(PagingDTO dto) {

		
		int start = dto.getPageStart();
		int perCount = dto.getPerPageCount(); //5개 까지 출력
		int size = list.size();     //전체 사이즈
		int maxCountSu = perCount * dto.getCurrentPage();

		List<UserInfoAdminDTO> returnList = new ArrayList<UserInfoAdminDTO>();
		int su = 0;
		for(UserInfoAdminDTO var : list) {
			logger.info("[1] su : "+su+", start : "+start+", perCount : "+perCount);
			if(su < start) {
				su++;
				continue;
			}
			if (maxCountSu <= su) {
				break;
			}
			returnList.add(var);
			su++;
		}
		
		return returnList;
	}

	@Override
	public UserInfoAdminDTO getUser(int id) {
		UserInfoAdminDTO dto = null; 
//		for (UserInfoAdminDTO var : list) {
//			if (var.getUserNo() == id) {
//				dto = var;
//				break;
//			}
//		}
		
		return dto;
	}

	@Override
	public UserInfoAdminDTO createUser(UserVO userinfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserInfoAdminDTO updateUser(UserInfoAdminDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
