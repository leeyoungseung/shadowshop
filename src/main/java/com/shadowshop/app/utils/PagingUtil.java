package com.shadowshop.app.utils;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.shadowshop.app.dto.PagingDTO;

public class PagingUtil {
	
    private int totalCount;  //전체 데이터의 개수
    private int startPage;  //시작 페이지 번호
    private int endPage;  //끝 페이지 번호
    private boolean prev;  //이전 페이지 표시여부
    private boolean next;  //다음 페이지 표시여부
    private int displayPageNum = 2;//View페이지에서 보여지는 번호 버튼의 숫자 
    private PagingDTO dto;  //현재페이지와 , 한페이지의 최대 게시글 수를 저장한 클래스
	 
    private void calcData(){//계산데이터 4개를 만드는 메소드
        //끝 페이지 번호
        endPage = (int)(Math.ceil(dto.getCurrentPage() / (double)displayPageNum) * displayPageNum);
        //시작 페이지 번호
        startPage = (endPage - displayPageNum) + 1;
        
        int tempEndPage = (int)(Math.ceil(totalCount / (double) dto.getPerPageCount()));
        if(endPage>tempEndPage){
            endPage = tempEndPage;
        }
		//이전 페이지 표시여부
		prev = startPage == 1? false : true;
		//다음 페이지 표시여부
		next = endPage * dto.getPerPageCount() >= totalCount ? false : true;
	}
    
    public String makeQuery(int page){
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
        		.queryParam("page", page)
        		.queryParam("perPageNum", dto.getPerPageCount())
        		.build();
    	  return uriComponents.toUriString();
    }

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		calcData();
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getDisplayPageNum() {
		return displayPageNum;
	}

	public void setDisplayPageNum(int displayPageNum) {
		this.displayPageNum = displayPageNum;
	}

	public PagingDTO getDto() {
		return dto;
	}

	public void setDto(PagingDTO dto) {
		this.dto = dto;
	}

	@Override
	public String toString() {
		return "PagingUtil [totalCount=" + totalCount + ", startPage=" + startPage + ", endPage=" + endPage + ", prev="
				+ prev + ", next=" + next + ", displayPageNum=" + displayPageNum + ", dto=" + dto + "]";
	}
	
	

}
