package com.shadowshop.app.dto;

import java.io.Serializable;
import java.util.Date;

public class UserInfoAdminDTO extends BaseDTO {

	int userNo;
	String userWebId;
	String userName;
	String userNickName;
	Date userJoinedDate;
	Date userLastLoginDate;
	String userStatus;
	
	
	public UserInfoAdminDTO() {};
	
	public UserInfoAdminDTO(int userNo, String userWebId, String userName, String userNickName, Date userJoinedDate,
			Date userLastLoginDate, String userStatus) {
		super();
		this.userNo = userNo;
		this.userWebId = userWebId;
		this.userName = userName;
		this.userNickName = userNickName;
		this.userJoinedDate = userJoinedDate;
		this.userLastLoginDate = userLastLoginDate;
		this.userStatus = userStatus;
	}
	
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getUserWebId() {
		return userWebId;
	}
	public void setUserWebId(String userWebId) {
		this.userWebId = userWebId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserNickName() {
		return userNickName;
	}
	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}
	public Date getUserJoinedDate() {
		return userJoinedDate;
	}
	public void setUserJoinedDate(Date userJoinedDate) {
		this.userJoinedDate = userJoinedDate;
	}
	public Date getUserLastLoginDate() {
		return userLastLoginDate;
	}
	public void setUserLastLoginDate(Date userLastLoginDate) {
		this.userLastLoginDate = userLastLoginDate;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	@Override
	public String toString() {
		return "UserInfoAdminDTO [userNo=" + userNo + ", userWebId=" + userWebId + ", userName=" + userName
				+ ", userNickName=" + userNickName + ", userJoinedDate=" + userJoinedDate + ", userLastLoginDate="
				+ userLastLoginDate + ", userStatus=" + userStatus + "]";
	}
	
	
	
}
