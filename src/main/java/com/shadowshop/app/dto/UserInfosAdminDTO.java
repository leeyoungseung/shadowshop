package com.shadowshop.app.dto;

import java.util.List;

import com.shadowshop.app.utils.PagingUtil;

public class UserInfosAdminDTO extends BaseDTO {

	PagingUtil pagingUtil;
	List<UserInfoAdminDTO> userInfoList;
	
	public PagingUtil getPagingUtil() {
		return pagingUtil;
	}
	public void setPagingUtil(PagingUtil pagingUtil) {
		this.pagingUtil = pagingUtil;
	}
	public List<UserInfoAdminDTO> getUserInfoList() {
		return userInfoList;
	}
	public void setUserInfoList(List<UserInfoAdminDTO> userInfoList) {
		this.userInfoList = userInfoList;
	}
	@Override
	public String toString() {
		return "UserInfosAdminDTO [pagingUtil=" + pagingUtil + ", userInfoList=" + userInfoList + ", resMsg=" + resMsg
				+ ", errMsg=" + errMsg + "]";
	}
	
}
