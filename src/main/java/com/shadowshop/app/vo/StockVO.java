package com.shadowshop.app.vo;

import java.util.Date;

//재고 테이블 
public class StockVO {

	// 번호
	private Integer no;

	// 상품상세번호
	private String itemDetailNo;

	// 재고수량
	private Integer stockQuantity;

	// 판매활성수량
	private Integer activeStockQuantity;

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

	public Integer getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(Integer stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public Integer getActiveStockQuantity() {
		return activeStockQuantity;
	}

	public void setActiveStockQuantity(Integer activeStockQuantity) {
		this.activeStockQuantity = activeStockQuantity;
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

	// Stock 모델 복사
	public void CopyData(StockVO param) {
		this.no = param.getNo();
		this.itemDetailNo = param.getItemDetailNo();
		this.stockQuantity = param.getStockQuantity();
		this.activeStockQuantity = param.getActiveStockQuantity();
		this.createddate = param.getCreateddate();
		this.updateddate = param.getUpdateddate();
	}

	@Override
	public String toString() {
		return "StockVO [no=" + no + ", itemDetailNo=" + itemDetailNo + ", stockQuantity=" + stockQuantity
				+ ", activeStockQuantity=" + activeStockQuantity + ", createddate=" + createddate + ", updateddate="
				+ updateddate + "]";
	}

}