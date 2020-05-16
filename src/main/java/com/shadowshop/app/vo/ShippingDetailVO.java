package com.shadowshop.app.vo;

import java.util.Date;

//송장상세 주문한 상품의 수량 만큼 레코드 생성; (주문1:송장N::송장상세N); (송장1:송장상세N) 
public class ShippingDetailVO {

	// 번호
	private Integer no;

	// 송장상세번호
	private String shippingDetailNo;

	// 송장번호
	private String shippingNo;

	// 단가금액
	private Integer basicOrderPrice;

	// 주문금액
	private Integer orderPrice;

	// 세율
	private Integer orderTaxRate;

	// 상품상세번호
	private String itemDetailNo;

	// 상품명 상품명 + 상품상세명
	private String itemName;

	// 송장상세상태 0:주문완료,1:출하준비중,2:출하완료,3:착하완료,4:강제캔슬,5:반품
	private Integer shippingStatus;

	// 주문연계상태 0:미연계,1:연계완료,2:연계실패
	private Integer orderLinkStatus;

	// 출하연계상태 0:미연계,1:연계완료,2:연계실패
	private Integer shippingLinkStatus;

	// 착하연계상태 0:미연계,1:연계완료,2:연계실패
	private Integer arrivalLinkStatus;

	// 주문연계일
	private Date orderLinkDate;

	// 출하연계일
	private Date shippingLinkDate;

	// 착하연계일
	private Date arrivalLinkDate;

	// 주문취소일
	private Date cancelDate;

	// 반품일
	private Date returnDate;

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

	public String getShippingDetailNo() {
		return shippingDetailNo;
	}

	public void setShippingDetailNo(String shippingDetailNo) {
		this.shippingDetailNo = shippingDetailNo;
	}

	public String getShippingNo() {
		return shippingNo;
	}

	public void setShippingNo(String shippingNo) {
		this.shippingNo = shippingNo;
	}

	public Integer getBasicOrderPrice() {
		return basicOrderPrice;
	}

	public void setBasicOrderPrice(Integer basicOrderPrice) {
		this.basicOrderPrice = basicOrderPrice;
	}

	public Integer getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(Integer orderPrice) {
		this.orderPrice = orderPrice;
	}

	public Integer getOrderTaxRate() {
		return orderTaxRate;
	}

	public void setOrderTaxRate(Integer orderTaxRate) {
		this.orderTaxRate = orderTaxRate;
	}

	public String getItemDetailNo() {
		return itemDetailNo;
	}

	public void setItemDetailNo(String itemDetailNo) {
		this.itemDetailNo = itemDetailNo;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getShippingStatus() {
		return shippingStatus;
	}

	public void setShippingStatus(Integer shippingStatus) {
		this.shippingStatus = shippingStatus;
	}

	public Integer getOrderLinkStatus() {
		return orderLinkStatus;
	}

	public void setOrderLinkStatus(Integer orderLinkStatus) {
		this.orderLinkStatus = orderLinkStatus;
	}

	public Integer getShippingLinkStatus() {
		return shippingLinkStatus;
	}

	public void setShippingLinkStatus(Integer shippingLinkStatus) {
		this.shippingLinkStatus = shippingLinkStatus;
	}

	public Integer getArrivalLinkStatus() {
		return arrivalLinkStatus;
	}

	public void setArrivalLinkStatus(Integer arrivalLinkStatus) {
		this.arrivalLinkStatus = arrivalLinkStatus;
	}

	public Date getOrderLinkDate() {
		return orderLinkDate;
	}

	public void setOrderLinkDate(Date orderLinkDate) {
		this.orderLinkDate = orderLinkDate;
	}

	public Date getShippingLinkDate() {
		return shippingLinkDate;
	}

	public void setShippingLinkDate(Date shippingLinkDate) {
		this.shippingLinkDate = shippingLinkDate;
	}

	public Date getArrivalLinkDate() {
		return arrivalLinkDate;
	}

	public void setArrivalLinkDate(Date arrivalLinkDate) {
		this.arrivalLinkDate = arrivalLinkDate;
	}

	public Date getCancelDate() {
		return cancelDate;
	}

	public void setCancelDate(Date cancelDate) {
		this.cancelDate = cancelDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
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

	// ShippingDetail 모델 복사
	public void CopyData(ShippingDetailVO param) {
		this.no = param.getNo();
		this.shippingDetailNo = param.getShippingDetailNo();
		this.shippingNo = param.getShippingNo();
		this.basicOrderPrice = param.getBasicOrderPrice();
		this.orderPrice = param.getOrderPrice();
		this.orderTaxRate = param.getOrderTaxRate();
		this.itemDetailNo = param.getItemDetailNo();
		this.itemName = param.getItemName();
		this.shippingStatus = param.getShippingStatus();
		this.orderLinkStatus = param.getOrderLinkStatus();
		this.shippingLinkStatus = param.getShippingLinkStatus();
		this.arrivalLinkStatus = param.getArrivalLinkStatus();
		this.orderLinkDate = param.getOrderLinkDate();
		this.shippingLinkDate = param.getShippingLinkDate();
		this.arrivalLinkDate = param.getArrivalLinkDate();
		this.cancelDate = param.getCancelDate();
		this.returnDate = param.getReturnDate();
		this.createddate = param.getCreateddate();
		this.updateddate = param.getUpdateddate();
	}

	@Override
	public String toString() {
		return "ShippingDetailVO [no=" + no + ", shippingDetailNo=" + shippingDetailNo + ", shippingNo=" + shippingNo
				+ ", basicOrderPrice=" + basicOrderPrice + ", orderPrice=" + orderPrice + ", orderTaxRate="
				+ orderTaxRate + ", itemDetailNo=" + itemDetailNo + ", itemName=" + itemName + ", shippingStatus="
				+ shippingStatus + ", orderLinkStatus=" + orderLinkStatus + ", shippingLinkStatus=" + shippingLinkStatus
				+ ", arrivalLinkStatus=" + arrivalLinkStatus + ", orderLinkDate=" + orderLinkDate
				+ ", shippingLinkDate=" + shippingLinkDate + ", arrivalLinkDate=" + arrivalLinkDate + ", cancelDate="
				+ cancelDate + ", returnDate=" + returnDate + ", createddate=" + createddate + ", updateddate="
				+ updateddate + "]";
	}

}