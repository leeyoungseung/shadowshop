package com.shadowshop.app.vo;

import java.util.Date;

//카테고리 테이블 
public class CategoryVO {

	// 번호
	private Integer no;

	// 카테고리번호
	private String categoryNo;

	// 상위카테고리번호
	private String parentCategoryNo;

	// 카테고리명
	private String categoryName;

	// 카테고리설명
	private String categoryContents;

	// 카테고리할인률
	private Integer categoryDiscount;

	// 카테고리상태 0:비표시,1:표시
	private Integer categoryStatus;

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

	public String getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(String categoryNo) {
		this.categoryNo = categoryNo;
	}

	public String getParentCategoryNo() {
		return parentCategoryNo;
	}

	public void setParentCategoryNo(String parentCategoryNo) {
		this.parentCategoryNo = parentCategoryNo;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryContents() {
		return categoryContents;
	}

	public void setCategoryContents(String categoryContents) {
		this.categoryContents = categoryContents;
	}

	public Integer getCategoryDiscount() {
		return categoryDiscount;
	}

	public void setCategoryDiscount(Integer categoryDiscount) {
		this.categoryDiscount = categoryDiscount;
	}

	public Integer getCategoryStatus() {
		return categoryStatus;
	}

	public void setCategoryStatus(Integer categoryStatus) {
		this.categoryStatus = categoryStatus;
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

	// Category 모델 복사
	public void CopyData(CategoryVO param) {
		this.no = param.getNo();
		this.categoryNo = param.getCategoryNo();
		this.parentCategoryNo = param.getParentCategoryNo();
		this.categoryName = param.getCategoryName();
		this.categoryContents = param.getCategoryContents();
		this.categoryDiscount = param.getCategoryDiscount();
		this.categoryStatus = param.getCategoryStatus();
		this.createddate = param.getCreateddate();
		this.updateddate = param.getUpdateddate();
	}

	@Override
	public String toString() {
		return "CategoryVO [no=" + no + ", categoryNo=" + categoryNo + ", parentCategoryNo=" + parentCategoryNo
				+ ", categoryName=" + categoryName + ", categoryContents=" + categoryContents + ", categoryDiscount="
				+ categoryDiscount + ", categoryStatus=" + categoryStatus + ", createddate=" + createddate
				+ ", updateddate=" + updateddate + "]";
	}

}
