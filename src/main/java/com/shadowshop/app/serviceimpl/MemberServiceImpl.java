package com.shadowshop.app.serviceimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shadowshop.app.dao.MemberDAO;
import com.shadowshop.app.dto.PagingDTO;
import com.shadowshop.app.dto.MemberInfoAdminDTO;
import com.shadowshop.app.service.MemberService;
import com.shadowshop.app.vo.MemberVO;


@Service
public class MemberServiceImpl implements MemberService {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);
	
	@Autowired
	private MemberDAO dao;
	
	List<MemberInfoAdminDTO> list = null;
	
	public MemberServiceImpl() {
		list = new ArrayList<MemberInfoAdminDTO>();
		MemberInfoAdminDTO dto1 = new MemberInfoAdminDTO();
		MemberInfoAdminDTO dto2 = new MemberInfoAdminDTO();
		MemberInfoAdminDTO dto3 = new MemberInfoAdminDTO();
		MemberInfoAdminDTO dto4 = new MemberInfoAdminDTO();
		MemberInfoAdminDTO dto5 = new MemberInfoAdminDTO();
		MemberInfoAdminDTO dto6 = new MemberInfoAdminDTO();
		MemberInfoAdminDTO dto7 = new MemberInfoAdminDTO();
		MemberInfoAdminDTO dto8 = new MemberInfoAdminDTO();
		MemberInfoAdminDTO dto9 = new MemberInfoAdminDTO();
		MemberInfoAdminDTO dto10 = new MemberInfoAdminDTO();
		MemberInfoAdminDTO dto11 = new MemberInfoAdminDTO();
		MemberInfoAdminDTO dto12 = new MemberInfoAdminDTO();
		MemberInfoAdminDTO dto13 = new MemberInfoAdminDTO();
		MemberInfoAdminDTO dto14 = new MemberInfoAdminDTO();
		MemberInfoAdminDTO dto15 = new MemberInfoAdminDTO();
		MemberVO vo1 = new MemberVO();
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
	public List<MemberInfoAdminDTO> getMembers(PagingDTO dto) {

		
		int start = dto.getPageStart();
		int perCount = dto.getPerPageCount(); //5개 까지 출력
		int size = list.size();     //전체 사이즈
		int maxCountSu = perCount * dto.getCurrentPage();

		List<MemberInfoAdminDTO> returnList = new ArrayList<MemberInfoAdminDTO>();
//		int su = 0;
//		for(MemberInfoAdminDTO var : list) {
//			logger.info("[1] su : "+su+", start : "+start+", perCount : "+perCount);
//			if(su < start) {
//				su++;
//				continue;
//			}
//			if (maxCountSu <= su) {
//				break;
//			}
//			returnList.add(var);
//			su++;
//		}
		List<MemberVO> memberlist = dao.getMemberList();
		for (MemberVO vo : memberlist) {
			MemberInfoAdminDTO d = new MemberInfoAdminDTO(); 
			logger.info(vo.toString());
			d.setUser(vo);
			returnList.add(d);
		}
		
		return returnList;
	}

	@Override
	public MemberInfoAdminDTO getMember(int id) {
		MemberInfoAdminDTO dto = null; 
//		for (MemberInfoAdminDTO var : list) {
//			if (var.getUserNo() == id) {
//				dto = var;
//				break;
//			}
//		}
		
		return dto;
	}

	@Override
	public MemberInfoAdminDTO createMember(MemberVO userinfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberInfoAdminDTO updateMember(MemberInfoAdminDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
