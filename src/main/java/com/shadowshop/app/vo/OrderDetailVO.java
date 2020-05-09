package com.shadowshop.app.vo;

public class OrderDetailVO extends BaseVO{

	String orderNo;              // 주문번호
	String shopCode;             // 쇼핑몰 코드
	String itemNo;               // 상품 번호
	String itemName;             // 상품명
	int boughtCount;             // 상품 구입 수량
	int purchaseAmount;          // 매입 금액(단가)
	int retailPrice;             // 판매가격
	int taxRate;                 // 세율
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getShopCode() {
		return shopCode;
	}
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
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
	public int getBoughtCount() {
		return boughtCount;
	}
	public void setBoughtCount(int boughtCount) {
		this.boughtCount = boughtCount;
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
	@Override
	public String toString() {
		return "OrderDetailVO [orderNo=" + orderNo + ", shopCode=" + shopCode + ", itemNo=" + itemNo + ", itemName="
				+ itemName + ", boughtCount=" + boughtCount + ", purchaseAmount=" + purchaseAmount + ", retailPrice="
				+ retailPrice + ", taxRate=" + taxRate + ", no=" + no + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + "]";
	}
	
	
	
}
