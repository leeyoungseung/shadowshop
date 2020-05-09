package com.shadowshop.app.vo;

import java.util.Date;


public class UserVO extends BaseVO{


	private String id;
	private String password;
	private String name;
	private String cpNumber;
	private String phoneNumber;
	private String country;
	private String postal_code;
	private String address_1;
	private String address_2;
	private String address_3;
	private String address_4;
    private String sex;
    private String birthday;
	private String nickname;
	private Date joinedDate;
	private Date lastLoginDate;
	private String userStatus;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpNumber() {
		return cpNumber;
	}
	public void setCpNumber(String cpNumber) {
		this.cpNumber = cpNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	public String getAddress_1() {
		return address_1;
	}
	public void setAddress_1(String address_1) {
		this.address_1 = address_1;
	}
	public String getAddress_2() {
		return address_2;
	}
	public void setAddress_2(String address_2) {
		this.address_2 = address_2;
	}
	public String getAddress_3() {
		return address_3;
	}
	public void setAddress_3(String address_3) {
		this.address_3 = address_3;
	}
	public String getAddress_4() {
		return address_4;
	}
	public void setAddress_4(String address_4) {
		this.address_4 = address_4;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	public Date getLastLoginDate() {
		return lastLoginDate;
	}
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", password=" + password + ", name=" + name + ", cpNumber=" + cpNumber
				+ ", phoneNumber=" + phoneNumber + ", country=" + country + ", postal_code=" + postal_code
				+ ", address_1=" + address_1 + ", address_2=" + address_2 + ", address_3=" + address_3 + ", address_4="
				+ address_4 + ", sex=" + sex + ", birthday=" + birthday + ", nickname=" + nickname + ", joinedDate="
				+ joinedDate + ", lastLoginDate=" + lastLoginDate + ", userStatus=" + userStatus + ", no=" + no
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}

	

}
