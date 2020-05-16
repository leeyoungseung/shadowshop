package com.shadowshop.app.vo;

import java.util.Date;

//송장테이블 주문 테이블과 1:N관계 
public class ShippingHeaderVO {

	// 번호
	private Integer no;

	// 송장번호
	private String shippingNo;

	// 주문번호
	private String orderNo;

	// 주문자ID
	private String id;

	// 받는사람명
	private String recipientName;

	// 이메일(받는사람)
	private String email;

	// 우편번호(받는사람)
	private String postalCode;

	// 주소1(받는사람)
	private String address1;

	// 주소2(받는사람)
	private String address2;

	// 주소3(받는사람)
	private String address3;

	// 주소4(받는사람)
	private String address4;

	// 연락처1(받는사람)
	private String phonenumber1;

	// 연락처2(받는사람)
	private String phonenumber2;

	// 택배배송회사명
	private String deliveryCompanyName;

	// 배송지정요청일
	private String deliveryAppointedDate;

	// 배송시요청메시지
	private String deliveryRequestedMsg;

	// 배송료
	private Integer shippingCharge;

	// 배송상태 0:주문완료시,1:출하준비,2:출하완료,3:착하완료,4:주문취소
	private Integer shippingStatus;

	// 출하일
	private Date shippingStartDate;

	// 착하일(배송완료일)
	private Date shippingArrivalDate;

	// 반품일
	private Date returnDate;

	// 반품사유 타입 0:단순변심,1:상품문제
	private Integer returnReasonType;

	// 반품사유 상세
	private String returnReasonContents;

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

	public String getShippingNo() {
		return shippingNo;
	}

	public void setShippingNo(String shippingNo) {
		this.shippingNo = shippingNo;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRecipientName() {
		return recipientName;
	}

	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getPhonenumber1() {
		return phonenumber1;
	}

	public void setPhonenumber1(String phonenumber1) {
		this.phonenumber1 = phonenumber1;
	}

	public String getPhonenumber2() {
		return phonenumber2;
	}

	public void setPhonenumber2(String phonenumber2) {
		this.phonenumber2 = phonenumber2;
	}

	public String getDeliveryCompanyName() {
		return deliveryCompanyName;
	}

	public void setDeliveryCompanyName(String deliveryCompanyName) {
		this.deliveryCompanyName = deliveryCompanyName;
	}

	public String getDeliveryAppointedDate() {
		return deliveryAppointedDate;
	}

	public void setDeliveryAppointedDate(String deliveryAppointedDate) {
		this.deliveryAppointedDate = deliveryAppointedDate;
	}

	public String getDeliveryRequestedMsg() {
		return deliveryRequestedMsg;
	}

	public void setDeliveryRequestedMsg(String deliveryRequestedMsg) {
		this.deliveryRequestedMsg = deliveryRequestedMsg;
	}

	public Integer getShippingCharge() {
		return shippingCharge;
	}

	public void setShippingCharge(Integer shippingCharge) {
		this.shippingCharge = shippingCharge;
	}

	public Integer getShippingStatus() {
		return shippingStatus;
	}

	public void setShippingStatus(Integer shippingStatus) {
		this.shippingStatus = shippingStatus;
	}

	public Date getShippingStartDate() {
		return shippingStartDate;
	}

	public void setShippingStartDate(Date shippingStartDate) {
		this.shippingStartDate = shippingStartDate;
	}

	public Date getShippingArrivalDate() {
		return shippingArrivalDate;
	}

	public void setShippingArrivalDate(Date shippingArrivalDate) {
		this.shippingArrivalDate = shippingArrivalDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public Integer getReturnReasonType() {
		return returnReasonType;
	}

	public void setReturnReasonType(Integer returnReasonType) {
		this.returnReasonType = returnReasonType;
	}

	public String getReturnReasonContents() {
		return returnReasonContents;
	}

	public void setReturnReasonContents(String returnReasonContents) {
		this.returnReasonContents = returnReasonContents;
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

	// ShippingHeader 모델 복사
	public void CopyData(ShippingHeaderVO param) {
		this.no = param.getNo();
		this.shippingNo = param.getShippingNo();
		this.orderNo = param.getOrderNo();
		this.id = param.getId();
		this.recipientName = param.getRecipientName();
		this.email = param.getEmail();
		this.postalCode = param.getPostalCode();
		this.address1 = param.getAddress1();
		this.address2 = param.getAddress2();
		this.address3 = param.getAddress3();
		this.address4 = param.getAddress4();
		this.phonenumber1 = param.getPhonenumber1();
		this.phonenumber2 = param.getPhonenumber2();
		this.deliveryCompanyName = param.getDeliveryCompanyName();
		this.deliveryAppointedDate = param.getDeliveryAppointedDate();
		this.deliveryRequestedMsg = param.getDeliveryRequestedMsg();
		this.shippingCharge = param.getShippingCharge();
		this.shippingStatus = param.getShippingStatus();
		this.shippingStartDate = param.getShippingStartDate();
		this.shippingArrivalDate = param.getShippingArrivalDate();
		this.returnDate = param.getReturnDate();
		this.returnReasonType = param.getReturnReasonType();
		this.returnReasonContents = param.getReturnReasonContents();
		this.createddate = param.getCreateddate();
		this.updateddate = param.getUpdateddate();
	}

	@Override
	public String toString() {
		return "ShippingHeaderVO [no=" + no + ", shippingNo=" + shippingNo + ", orderNo=" + orderNo + ", id=" + id
				+ ", recipientName=" + recipientName + ", email=" + email + ", postalCode=" + postalCode + ", address1="
				+ address1 + ", address2=" + address2 + ", address3=" + address3 + ", address4=" + address4
				+ ", phonenumber1=" + phonenumber1 + ", phonenumber2=" + phonenumber2 + ", deliveryCompanyName="
				+ deliveryCompanyName + ", deliveryAppointedDate=" + deliveryAppointedDate + ", deliveryRequestedMsg="
				+ deliveryRequestedMsg + ", shippingCharge=" + shippingCharge + ", shippingStatus=" + shippingStatus
				+ ", shippingStartDate=" + shippingStartDate + ", shippingArrivalDate=" + shippingArrivalDate
				+ ", returnDate=" + returnDate + ", returnReasonType=" + returnReasonType + ", returnReasonContents="
				+ returnReasonContents + ", createddate=" + createddate + ", updateddate=" + updateddate + "]";
	}

}