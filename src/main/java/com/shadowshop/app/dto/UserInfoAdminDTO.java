package com.shadowshop.app.dto;

import com.shadowshop.app.vo.UserVO;

public class UserInfoAdminDTO extends BaseDTO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7264937865594345273L;
	
	UserVO user;

	public UserVO getUser() {
		return user;
	}

	public void setUser(UserVO user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserInfoAdminDTO [user=" + user.toString() + "]";
	}
	
}
