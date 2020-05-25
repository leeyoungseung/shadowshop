package com.shadowshop.app.dto;

import com.shadowshop.app.vo.MemberVO;

public class MemberInfoAdminDTO extends BaseDTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7264937865594345273L;
	
	MemberVO user;

	public MemberVO getUser() {
		return user;
	}

	public void setUser(MemberVO user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserInfoAdminDTO [user=" + user.toString() + "]";
	}
	
}
