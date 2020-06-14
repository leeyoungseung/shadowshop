package com.shadowshop.app.dao;

import java.util.List;

import com.shadowshop.app.vo.MemberVO;

public interface MemberDAO {
	
	public List<MemberVO> getMemberList(Integer start, Integer perCount);
	public Integer getMemberCount();
	public MemberVO getMemberOne(Integer no);

}
