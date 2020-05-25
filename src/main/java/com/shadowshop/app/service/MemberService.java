package com.shadowshop.app.service;

import java.util.List;

import com.shadowshop.app.dto.MemberInfoAdminDTO;
import com.shadowshop.app.dto.PagingDTO;
import com.shadowshop.app.vo.MemberVO;

public interface MemberService {

	/**
	 * 유저 목록
	 * @param dto
	 * @return
	 */
	List<MemberInfoAdminDTO> getMembers(PagingDTO dto);
	
	/**
	 * 유저 상세
	 * @param no
	 * @return
	 */
	MemberInfoAdminDTO getMember(int no);
	
	/**
	 * 유저 생성
	 * @param userinfo
	 * @return
	 */
	MemberInfoAdminDTO createMember(MemberVO userinfo);
	
	/**
	 * 유저 갱신
	 * @param dto
	 * @return
	 */
	MemberInfoAdminDTO updateMember(MemberInfoAdminDTO dto);
	
}
