package com.shadowshop.app.vo;

import java.util.Date;

public class ShippingHeaderVO extends BaseVO{

	String shippingNo;           // 송장번호
	String orderNo;              // 주문번호
	String id;                   // 주문자 ID
	String name;                 // 주문자 명
	String recipientName;        // 수령자 명
	String postalCode;           // 우편 번호
	String address_1;            // 주소 1
	String address_2;            // 주소 2
	String address_3;            // 주소 3
	String address_4;            // 주소 4
	String phoneNumber;          // 연락처
	String deliveryCompanyName;  // 배송회사 명
    Date deliveryAppointedDate;  // 배송 지정 요청일
    String deliveryRequestedMsg; // 배송 요청 메시지
    int shippingCharge;          // 배송료
	int shippingStatus;          // 배송 상태
	Date shippingStartDate;      // 출하일
	Date shippingArrivalDate;    // 착하일(배송완료일)
	Date returnDate;             // 반품일
	int returnReasonType;        // 반품사유 타입
	String returnReasonContents; // 반품사유 상세
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
	public String getDeliveryCompanyName() {
		return deliveryCompanyName;
	}
	public void setDeliveryCompanyName(String deliveryCompanyName) {
		this.deliveryCompanyName = deliveryCompanyName;
	}
	public Date getDeliveryAppointedDate() {
		return deliveryAppointedDate;
	}
	public void setDeliveryAppointedDate(Date deliveryAppointedDate) {
		this.deliveryAppointedDate = deliveryAppointedDate;
	}
	public String getDeliveryRequestedMsg() {
		return deliveryRequestedMsg;
	}
	public void setDeliveryRequestedMsg(String deliveryRequestedMsg) {
		this.deliveryRequestedMsg = deliveryRequestedMsg;
	}
	public int getShippingCharge() {
		return shippingCharge;
	}
	public void setShippingCharge(int shippingCharge) {
		this.shippingCharge = shippingCharge;
	}
	public int getShippingStatus() {
		return shippingStatus;
	}
	public void setShippingStatus(int shippingStatus) {
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
	public int getReturnReasonType() {
		return returnReasonType;
	}
	public void setReturnReasonType(int returnReasonType) {
		this.returnReasonType = returnReasonType;
	}
	public String getReturnReasonContents() {
		return returnReasonContents;
	}
	public void setReturnReasonContents(String returnReasonContents) {
		this.returnReasonContents = returnReasonContents;
	}
	@Override
	public String toString() {
		return "ShippingHeaderVO [shippingNo=" + shippingNo + ", orderNo=" + orderNo + ", id=" + id + ", name=" + name
				+ ", recipientName=" + recipientName + ", postalCode=" + postalCode + ", address_1=" + address_1
				+ ", address_2=" + address_2 + ", address_3=" + address_3 + ", address_4=" + address_4
				+ ", phoneNumber=" + phoneNumber + ", deliveryCompanyName=" + deliveryCompanyName
				+ ", deliveryAppointedDate=" + deliveryAppointedDate + ", deliveryRequestedMsg=" + deliveryRequestedMsg
				+ ", shippingCharge=" + shippingCharge + ", shippingStatus=" + shippingStatus + ", shippingStartDate="
				+ shippingStartDate + ", shippingArrivalDate=" + shippingArrivalDate + ", returnDate=" + returnDate
				+ ", returnReasonType=" + returnReasonType + ", returnReasonContents=" + returnReasonContents + ", no="
				+ no + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}
	
	
}
