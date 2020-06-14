package com.shadowshop.app.serviceimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	public MemberServiceImpl() {
		
	}

	@Override
	public Map getMembers(PagingDTO dto) {
		Map res = new HashMap();
		List<MemberInfoAdminDTO> returnList = new ArrayList<MemberInfoAdminDTO>();
		
		
		Integer totalCount = dao.getMemberCount();
		
		
		
		Integer start = dto.getPageStart();
		Integer perCount = dto.getLimitCount();
		logger.info("start : "+start +", perCount : "+perCount);
		
		List<MemberVO> memberlist = dao.getMemberList(start, perCount);
		
		
		for (MemberVO vo : memberlist) {
			MemberInfoAdminDTO d = new MemberInfoAdminDTO(); 
			logger.info(vo.toString());
			d.setUser(vo);
			returnList.add(d);
		}
		
		res.put("pagingDTO", dto);
		res.put("totalCount",totalCount);
		res.put("memberInfoList", returnList);
		
		return res;
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
