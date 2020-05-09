package com.shadowshop.app.vo;

import java.util.Date;

public class ShippingDetailVO extends BaseVO{

	String shippingDetailNo;     // 송장상세 번호
	String shippingNo;           // 송장번호
	int purchaseAmount;          // 매입 금액(단가)
	int retailPrice;             // 판매가격
	int taxRate;                 // 세율
	String itemNo;               // 상품 번호
	String itemName;             // 상품명
	int shippingDetailStatus;    // 송장상세 상태
	int orderLinkStatus;         // 주문 연계 상태
	int shippingLinkStatus;      // 주문 연계 상태
	int arrivalLinkStatus;       // 착하 상태
	Date orderLinkDate;          // 주문연계일
	Date shippingLinkDate;       // 출하연계일
	Date arrivalLinkDate;        // 착하연계일
	Date cancelDate;             // 취소일
	Date returnDate;             // 반품일
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
	public int getPurchaseAmount() {
		return purchaseAmount;
	}
	public void setPurchaseAmount(int purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}
	public int getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(int retailPrice) {
		this.retailPrice = retailPrice;
	}
	public int getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(int taxRate) {
		this.taxRate = taxRate;
	}
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getShippingDetailStatus() {
		return shippingDetailStatus;
	}
	public void setShippingDetailStatus(int shippingDetailStatus) {
		this.shippingDetailStatus = shippingDetailStatus;
	}
	public int getOrderLinkStatus() {
		return orderLinkStatus;
	}
	public void setOrderLinkStatus(int orderLinkStatus) {
		this.orderLinkStatus = orderLinkStatus;
	}
	public int getShippingLinkStatus() {
		return shippingLinkStatus;
	}
	public void setShippingLinkStatus(int shippingLinkStatus) {
		this.shippingLinkStatus = shippingLinkStatus;
	}
	public int getArrivalLinkStatus() {
		return arrivalLinkStatus;
	}
	public void setArrivalLinkStatus(int arrivalLinkStatus) {
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
	
	@Override
	public String toString() {
		return "ShippingDetailVO [shippingDetailNo=" + shippingDetailNo + ", shippingNo=" + shippingNo
				+ ", purchaseAmount=" + purchaseAmount + ", retailPrice=" + retailPrice + ", taxRate=" + taxRate
				+ ", itemNo=" + itemNo + ", itemName=" + itemName + ", shippingDetailStatus=" + shippingDetailStatus
				+ ", orderLinkStatus=" + orderLinkStatus + ", shippingLinkStatus=" + shippingLinkStatus
				+ ", arrivalLinkStatus=" + arrivalLinkStatus + ", orderLinkDate=" + orderLinkDate
				+ ", shippingLinkDate=" + shippingLinkDate + ", arrivalLinkDate=" + arrivalLinkDate + ", cancelDate="
				+ cancelDate + ", returnDate=" + returnDate + ", no=" + no + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + "]";
	}
	
	
	
}
