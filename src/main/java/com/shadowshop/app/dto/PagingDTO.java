package com.shadowshop.app.dto;

public class PagingDTO extends BaseDTO {

	private int currentPage;
	private int perPageCount;
	
	public PagingDTO() {
	    this.currentPage = 1;
	    this.perPageCount = 5;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		if(currentPage <= 0) {
			this.currentPage = 1;
			return;
		}
		this.currentPage = currentPage;
	}

	public int getPerPageCount() {
		return perPageCount;
	}

	public void setPerPageCount(int perPageCount) {
		if(perPageCount <= 0 | perPageCount > 100) {
			this.perPageCount = 5;
			return;
		}
		this.perPageCount = perPageCount;
	}
	
	public int getPageStart() {
		int start = (this.currentPage -1 ) * perPageCount;
		if(perPageCount <= start) {
			start++;
		}
		return start;
	}
	
	public int getLimitCount() {
		return ((this.currentPage -1 ) * perPageCount) + perPageCount;
	}

	@Override
	public String toString() {
		return "PagingDTO [currentPage=" + currentPage + ", perPageCount=" + perPageCount + "]";
	}

	
	
}
