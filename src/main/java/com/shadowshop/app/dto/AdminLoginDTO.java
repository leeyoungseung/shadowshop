package com.shadowshop.app.dto;

import java.util.Date;

public class AdminLoginDTO {

	private String webid;
	private String password;
	private Date lastLoginTime;

	public String getWebid() {
		return webid;
	}

	public void setWebid(String webid) {
		this.webid = webid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	@Override
	public String toString() {
		return "AdminLoginDTO [webid=" + webid + ", password=" + password + ", lastLoginTime=" + lastLoginTime + "]";
	}
	
	
}
