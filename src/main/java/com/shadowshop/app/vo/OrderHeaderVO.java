package com.shadowshop.app.vo;

import java.util.Date;

//주문 
public class OrderHeaderVO {

	// 번호
	private Integer no;

	// 주문번호
	private String orderNo;

	// 주문일
	private Date orderDate;

	// 주문자ID
	private String id;

	// 주문자명
	private String name;

	// 받는사람명
	private String recipientName;

	// 이메일
	private String email;

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

	// 연락처1
	private String phonenumber1;

	// 연락처2
	private String phonenumber2;

	// 결제방법코드
	private Integer paymentMethodCode;

	// 결제수수료
	private Integer paymentCommission;

	// 결제수수료세율
	private Integer paymentCommissionTax;

	// 결제완료일
	private Date paymentCompleteDate;

	// 결제완료제한일
	private Date paymentLimitDate;

	// 결제상태 0:미결제,1:결제완료
	private Integer paymentStatus;

	// 주문상태 0:가주문,1:정상주문,2:주문취소,3:주문강제취소
	private Integer orderStatus;

	// 주문취소일
	private Date cancelDate;

	// 주문수정일(가장최신)
	private Date lastUpdateDate;

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

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Integer getPaymentMethodCode() {
		return paymentMethodCode;
	}

	public void setPaymentMethodCode(Integer paymentMethodCode) {
		this.paymentMethodCode = paymentMethodCode;
	}

	public Integer getPaymentCommission() {
		return paymentCommission;
	}

	public void setPaymentCommission(Integer paymentCommission) {
		this.paymentCommission = paymentCommission;
	}

	public Integer getPaymentCommissionTax() {
		return paymentCommissionTax;
	}

	public void setPaymentCommissionTax(Integer paymentCommissionTax) {
		this.paymentCommissionTax = paymentCommissionTax;
	}

	public Date getPaymentCompleteDate() {
		return paymentCompleteDate;
	}

	public void setPaymentCompleteDate(Date paymentCompleteDate) {
		this.paymentCompleteDate = paymentCompleteDate;
	}

	public Date getPaymentLimitDate() {
		return paymentLimitDate;
	}

	public void setPaymentLimitDate(Date paymentLimitDate) {
		this.paymentLimitDate = paymentLimitDate;
	}

	public Integer getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(Integer paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getCancelDate() {
		return cancelDate;
	}

	public void setCancelDate(Date cancelDate) {
		this.cancelDate = cancelDate;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
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

	// OrderHeader 모델 복사
	public void CopyData(OrderHeaderVO param) {
		this.no = param.getNo();
		this.orderNo = param.getOrderNo();
		this.orderDate = param.getOrderDate();
		this.id = param.getId();
		this.name = param.getName();
		this.recipientName = param.getRecipientName();
		this.email = param.getEmail();
		this.postalCode = param.getPostalCode();
		this.address1 = param.getAddress1();
		this.address2 = param.getAddress2();
		this.address3 = param.getAddress3();
		this.address4 = param.getAddress4();
		this.phonenumber1 = param.getPhonenumber1();
		this.phonenumber2 = param.getPhonenumber2();
		this.paymentMethodCode = param.getPaymentMethodCode();
		this.paymentCommission = param.getPaymentCommission();
		this.paymentCommissionTax = param.getPaymentCommissionTax();
		this.paymentCompleteDate = param.getPaymentCompleteDate();
		this.paymentLimitDate = param.getPaymentLimitDate();
		this.paymentStatus = param.getPaymentStatus();
		this.orderStatus = param.getOrderStatus();
		this.cancelDate = param.getCancelDate();
		this.lastUpdateDate = param.getLastUpdateDate();
		this.createddate = param.getCreateddate();
		this.updateddate = param.getUpdateddate();
	}

	@Override
	public String toString() {
		return "OrderHeaderVO [no=" + no + ", orderNo=" + orderNo + ", orderDate=" + orderDate + ", id=" + id
				+ ", name=" + name + ", recipientName=" + recipientName + ", email=" + email + ", postalCode="
				+ postalCode + ", address1=" + address1 + ", address2=" + address2 + ", address3=" + address3
				+ ", address4=" + address4 + ", phonenumber1=" + phonenumber1 + ", phonenumber2=" + phonenumber2
				+ ", paymentMethodCode=" + paymentMethodCode + ", paymentCommission=" + paymentCommission
				+ ", paymentCommissionTax=" + paymentCommissionTax + ", paymentCompleteDate=" + paymentCompleteDate
				+ ", paymentLimitDate=" + paymentLimitDate + ", paymentStatus=" + paymentStatus + ", orderStatus="
				+ orderStatus + ", cancelDate=" + cancelDate + ", lastUpdateDate=" + lastUpdateDate + ", createddate="
				+ createddate + ", updateddate=" + updateddate + "]";
	}

}
