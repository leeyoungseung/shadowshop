package com.shadowshop.app.vo;

import java.util.Date;

//상품상세 테이블 
public class ItemDetailVO {

	// 번호
	private Integer no;

	// 상품상세번호
	private String itemDetailNo;

	// 상품번호
	private String itemNo;

	// 상품상세명
	private String itemDetailName;

	// 상품상세설명
	private String itemDetailContents;

	// 상품상세가격(판매가)
	private Integer itemDetailPrice;

	// 상품상세가격(도매가)
	private Integer itemDetailOrderPrice;

	// 판매여부플래그 0:비판매,1:판매
	private Integer saleFlg;

	// 가격할인금액
	private Integer discountPrice;

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

	public String getItemDetailNo() {
		return itemDetailNo;
	}

	public void setItemDetailNo(String itemDetailNo) {
		this.itemDetailNo = itemDetailNo;
	}

	public String getItemNo() {
		return itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemDetailName() {
		return itemDetailName;
	}

	public void setItemDetailName(String itemDetailName) {
		this.itemDetailName = itemDetailName;
	}

	public String getItemDetailContents() {
		return itemDetailContents;
	}

	public void setItemDetailContents(String itemDetailContents) {
		this.itemDetailContents = itemDetailContents;
	}

	public Integer getItemDetailPrice() {
		return itemDetailPrice;
	}

	public void setItemDetailPrice(Integer itemDetailPrice) {
		this.itemDetailPrice = itemDetailPrice;
	}

	public Integer getItemDetailOrderPrice() {
		return itemDetailOrderPrice;
	}

	public void setItemDetailOrderPrice(Integer itemDetailOrderPrice) {
		this.itemDetailOrderPrice = itemDetailOrderPrice;
	}

	public Integer getSaleFlg() {
		return saleFlg;
	}

	public void setSaleFlg(Integer saleFlg) {
		this.saleFlg = saleFlg;
	}

	public Integer getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(Integer discountPrice) {
		this.discountPrice = discountPrice;
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

	// ItemDetail 모델 복사
	public void CopyData(ItemDetailVO param) {
		this.no = param.getNo();
		this.itemDetailNo = param.getItemDetailNo();
		this.itemNo = param.getItemNo();
		this.itemDetailName = param.getItemDetailName();
		this.itemDetailContents = param.getItemDetailContents();
		this.itemDetailPrice = param.getItemDetailPrice();
		this.itemDetailOrderPrice = param.getItemDetailOrderPrice();
		this.saleFlg = param.getSaleFlg();
		this.discountPrice = param.getDiscountPrice();
		this.createddate = param.getCreateddate();
		this.updateddate = param.getUpdateddate();
	}

	@Override
	public String toString() {
		return "ItemDetailVO [no=" + no + ", itemDetailNo=" + itemDetailNo + ", itemNo=" + itemNo + ", itemDetailName="
				+ itemDetailName + ", itemDetailContents=" + itemDetailContents + ", itemDetailPrice=" + itemDetailPrice
				+ ", itemDetailOrderPrice=" + itemDetailOrderPrice + ", saleFlg=" + saleFlg + ", discountPrice="
				+ discountPrice + ", createddate=" + createddate + ", updateddate=" + updateddate + "]";
	}

}