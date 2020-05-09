package com.shadowshop.app.vo;

import java.util.Date;

public class OrderHeaderVO extends BaseVO {

	String orderNo;              // 주문번호
	Date orderDate;              // 주문일 
	String id;                   // 주문자 ID
	String name;                 // 주문자 명
	String email;                // e메일
	String postalCode;           // 우편 번호
	String address_1;            // 주소 1
	String address_2;            // 주소 2
	String address_3;            // 주소 3
	String address_4;            // 주소 4
	String phoneNumber;          // 연락처
	String paymentMethod;        // 결제방법
	String paymentCommission;    // 결제 수수료
	String paymentCommissionTax; // 결제 수수료세금
	Date paymentCompleteDate;    // 결제 완료일
	Date paymentLimitDate;       // 결제 완료 제한일
	int paymentStatus;           // 결제 상태
	int orderStatus;             // 주문 상태
	Date cancelDate;             // 주문 취소일
	Date lastUpdateDate;         // 마지막 수정일
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getPaymentCommission() {
		return paymentCommission;
	}
	public void setPaymentCommission(String paymentCommission) {
		this.paymentCommission = paymentCommission;
	}
	public String getPaymentCommissionTax() {
		return paymentCommissionTax;
	}
	public void setPaymentCommissionTax(String paymentCommissionTax) {
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
	public int getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(int paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public int getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(int orderStatus) {
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
	@Override
	public String toString() {
		return "OrderHeaderVO [orderNo=" + orderNo + ", orderDate=" + orderDate + ", id=" + id + ", name=" + name
				+ ", email=" + email + ", postalCode=" + postalCode + ", address_1=" + address_1 + ", address_2="
				+ address_2 + ", address_3=" + address_3 + ", address_4=" + address_4 + ", phoneNumber=" + phoneNumber
				+ ", paymentMethod=" + paymentMethod + ", paymentCommission=" + paymentCommission
				+ ", paymentCommissionTax=" + paymentCommissionTax + ", paymentCompleteDate=" + paymentCompleteDate
				+ ", paymentLimitDate=" + paymentLimitDate + ", paymentStatus=" + paymentStatus + ", orderStatus="
				+ orderStatus + ", cancelDate=" + cancelDate + ", lastUpdateDate=" + lastUpdateDate + ", no=" + no
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}

    
    
}
