package com.shadowshop.app.vo;

import java.util.Date;

//주문상세 주문 테이블과 1:N 관계, 상품상세종류별로 1개의 레코드가 생성됨
public class OrderDetailVO {

	// 번호
	private Integer no;

	// 주문상세번호
	private String orderDetailNo;

	// 주문번호
	private String orderNo;

	// 메이커코드
	private String makerCode;

	// 상품상세번호
	private String itemDetailNo;

	// 상품명
	private String itemDetailName;

	// 상품구입수량
	private Integer orderQuantity;

	// 주문금액
	private Integer orderPrice;

	// 단가금액 할인등이 적용되지 않았을때의 가격
	private Integer basicOrderPrice;

	// 세율
	private Integer orderTaxRate;

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

	public String getOrderDetailNo() {
		return orderDetailNo;
	}

	public void setOrderDetailNo(String orderDetailNo) {
		this.orderDetailNo = orderDetailNo;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getMakerCode() {
		return makerCode;
	}

	public void setMakerCode(String makerCode) {
		this.makerCode = makerCode;
	}

	public String getItemDetailNo() {
		return itemDetailNo;
	}

	public void setItemDetailNo(String itemDetailNo) {
		this.itemDetailNo = itemDetailNo;
	}

	public String getItemDetailName() {
		return itemDetailName;
	}

	public void setItemDetailName(String itemDetailName) {
		this.itemDetailName = itemDetailName;
	}

	public Integer getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(Integer orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public Integer getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(Integer orderPrice) {
		this.orderPrice = orderPrice;
	}

	public Integer getBasicOrderPrice() {
		return basicOrderPrice;
	}

	public void setBasicOrderPrice(Integer basicOrderPrice) {
		this.basicOrderPrice = basicOrderPrice;
	}

	public Integer getOrderTaxRate() {
		return orderTaxRate;
	}

	public void setOrderTaxRate(Integer orderTaxRate) {
		this.orderTaxRate = orderTaxRate;
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

	// OrderDetail 모델 복사
	public void CopyData(OrderDetailVO param) {
		this.no = param.getNo();
		this.orderDetailNo = param.getOrderDetailNo();
		this.orderNo = param.getOrderNo();
		this.makerCode = param.getMakerCode();
		this.itemDetailNo = param.getItemDetailNo();
		this.itemDetailName = param.getItemDetailName();
		this.orderQuantity = param.getOrderQuantity();
		this.orderPrice = param.getOrderPrice();
		this.basicOrderPrice = param.getBasicOrderPrice();
		this.orderTaxRate = param.getOrderTaxRate();
		this.createddate = param.getCreateddate();
		this.updateddate = param.getUpdateddate();
	}

	@Override
	public String toString() {
		return "OrderDetailVO [no=" + no + ", orderDetailNo=" + orderDetailNo + ", orderNo=" + orderNo + ", makerCode="
				+ makerCode + ", itemDetailNo=" + itemDetailNo + ", itemDetailName=" + itemDetailName
				+ ", orderQuantity=" + orderQuantity + ", orderPrice=" + orderPrice + ", basicOrderPrice="
				+ basicOrderPrice + ", orderTaxRate=" + orderTaxRate + ", createddate=" + createddate + ", updateddate="
				+ updateddate + "]";
	}

}
