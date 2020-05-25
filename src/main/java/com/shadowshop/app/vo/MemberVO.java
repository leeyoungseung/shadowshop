package com.shadowshop.app.vo;

import java.util.Date;

// 유저테이블 
public class MemberVO {

	// 번호
	private Integer no;

	// 아이디
	private String id;

	// 패스워드
	private String password;

	// 이름
	private String name;

	// 핸드폰번호
	private String cpnumber;

	// 전화번호
	private String phonenumber;

	// 국가
	private String country;

	// 우편번호
	private String postalCode;

	// 주소1
	private String address1;

	// 주소2
	private String address2;

	// 주소3
	private String address3;

	// 주소4
	private String address4;

	// 성별
	private Integer sex;

	// 생일
	private Date birthday;

	// 닉네임
	private String nickname;

	// 가입날자
	private Date joineddate;

	// 마지막로그인날자
	private Date lastlogindate;

	// 유저상태 0:정상유저,1:VIP유저,2:탈퇴유저,3:블럭유저
	private Integer userstatus;

	// 레코드생성일
	private Date createddate;

	// 레코드갱신일
	private Date updateddate;

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

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

	public String getCpnumber() {
		return cpnumber;
	}

	public void setCpnumber(String cpnumber) {
		this.cpnumber = cpnumber;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getAddress4() {
		return address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Date getJoineddate() {
		return joineddate;
	}

	public void setJoineddate(Date joineddate) {
		this.joineddate = joineddate;
	}

	public Date getLastlogindate() {
		return lastlogindate;
	}

	public void setLastlogindate(Date lastlogindate) {
		this.lastlogindate = lastlogindate;
	}

	public Integer getUserstatus() {
		return userstatus;
	}

	public void setUserstatus(Integer userstatus) {
		this.userstatus = userstatus;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public Date getUpdateddate() {
		return updateddate;
	}

	public void setUpdateddate(Date updateddate) {
		this.updateddate = updateddate;
	}

	// User 모델 복사
	public void CopyData(MemberVO param) {
		this.no = param.getNo();
		this.id = param.getId();
		this.password = param.getPassword();
		this.name = param.getName();
		this.cpnumber = param.getCpnumber();
		this.phonenumber = param.getPhonenumber();
		this.country = param.getCountry();
		this.postalCode = param.getPostalCode();
		this.address1 = param.getAddress1();
		this.address2 = param.getAddress2();
		this.address3 = param.getAddress3();
		this.address4 = param.getAddress4();
		this.sex = param.getSex();
		this.birthday = param.getBirthday();
		this.nickname = param.getNickname();
		this.joineddate = param.getJoineddate();
		this.lastlogindate = param.getLastlogindate();
		this.userstatus = param.getUserstatus();
		this.createddate = param.getCreateddate();
		this.updateddate = param.getUpdateddate();
	}

	@Override
	public String toString() {
		return "MemberVO [no=" + no + ", id=" + id + ", password=" + password + ", name=" + name + ", cpnumber="
				+ cpnumber + ", phonenumber=" + phonenumber + ", country=" + country + ", postalCode=" + postalCode
				+ ", address1=" + address1 + ", address2=" + address2 + ", address3=" + address3 + ", address4="
				+ address4 + ", sex=" + sex + ", birthday=" + birthday + ", nickname=" + nickname + ", joineddate="
				+ joineddate + ", lastlogindate=" + lastlogindate + ", userstatus=" + userstatus + ", createddate="
				+ createddate + ", updateddate=" + updateddate + "]";
	}

}