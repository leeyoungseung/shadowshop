package com.shadowshop.app.vo;

import java.util.Date;

//상품 테이블 
public class ItemHeaderVO {

	// 번호
	private Integer no;

	// 상품번호
	private String itemNo;

	// 상품명
	private String itemName;

	// 상품설명
	private String itemContents;

	// 메이커명
	private String makerName;

	// 메이커코드
	private String makerCode;

	// 이벤트플래그 0:비활성,1:활성
	private Integer eventFlg;

	// 이벤트코드
	private String eventCode;

	// 판매여부플래그 0:비판매,1:판매
	private Integer saleFlg;

	// 상품가격(판매가)
	private Integer itemPrice;

	// 상품가격(도매가)
	private Integer itemOrderPrice;

	// 카테고리번호
	private String categoryNo;

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

	public String getItemContents() {
		return itemContents;
	}

	public void setItemContents(String itemContents) {
		this.itemContents = itemContents;
	}

	public String getMakerName() {
		return makerName;
	}

	public void setMakerName(String makerName) {
		this.makerName = makerName;
	}

	public String getMakerCode() {
		return makerCode;
	}

	public void setMakerCode(String makerCode) {
		this.makerCode = makerCode;
	}

	public Integer getEventFlg() {
		return eventFlg;
	}

	public void setEventFlg(Integer eventFlg) {
		this.eventFlg = eventFlg;
	}

	public String getEventCode() {
		return eventCode;
	}

	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public Integer getSaleFlg() {
		return saleFlg;
	}

	public void setSaleFlg(Integer saleFlg) {
		this.saleFlg = saleFlg;
	}

	public Integer getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Integer itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Integer getItemOrderPrice() {
		return itemOrderPrice;
	}

	public void setItemOrderPrice(Integer itemOrderPrice) {
		this.itemOrderPrice = itemOrderPrice;
	}

	public String getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(String categoryNo) {
		this.categoryNo = categoryNo;
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

	// ItemHeader 모델 복사
	public void CopyData(ItemHeaderVO param) {
		this.no = param.getNo();
		this.itemNo = param.getItemNo();
		this.itemName = param.getItemName();
		this.itemContents = param.getItemContents();
		this.makerName = param.getMakerName();
		this.makerCode = param.getMakerCode();
		this.eventFlg = param.getEventFlg();
		this.eventCode = param.getEventCode();
		this.saleFlg = param.getSaleFlg();
		this.itemPrice = param.getItemPrice();
		this.itemOrderPrice = param.getItemOrderPrice();
		this.categoryNo = param.getCategoryNo();
		this.createddate = param.getCreateddate();
		this.updateddate = param.getUpdateddate();
	}

	@Override
	public String toString() {
		return "ItemHeaderVO [no=" + no + ", itemNo=" + itemNo + ", itemName=" + itemName + ", itemContents="
				+ itemContents + ", makerName=" + makerName + ", makerCode=" + makerCode + ", eventFlg=" + eventFlg
				+ ", eventCode=" + eventCode + ", saleFlg=" + saleFlg + ", itemPrice=" + itemPrice + ", itemOrderPrice="
				+ itemOrderPrice + ", categoryNo=" + categoryNo + ", createddate=" + createddate + ", updateddate="
				+ updateddate + "]";
	}

}