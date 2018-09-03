package com.wind.web.dto;

public class Pagination {

    /** 한 페이지당 게시글 수 **/
    private int pageSize = 10;
    
    /** 한 블럭(range)당 페이지 수 **/
    private int rangeSize = 10;
    
    /** 현재 페이지 **/
    private int curPage = 1;
    
    /** 현재 블럭(range) **/
    private int curRange = 1;
    
    /** 총 게시글 수 **/
    private int listCnt;
    
    /** 총 페이지 수 **/
    private int pageCnt;
    
    /** 총 블럭(range) 수 **/
    private int rangeCnt;
    
    /** 시작 페이지 **/
    private int startPage = 1;
    
    /** 끝 페이지 **/
    private int endPage = 1;
    
    /** 시작 index **/
    private int startIndex = 0;
    
    /** 이전 페이지 **/
    private int prevPage;
    
    /** 다음 페이지 **/
    private int nextPage;

	public Pagination(int pageSize, int rangeSize, int curPage, int curRange, int listCnt, int pageCnt, int rangeCnt,
			int startPage, int endPage, int startIndex, int prevPage, int nextPage) {
		super();
		this.pageSize = pageSize;
		this.rangeSize = rangeSize;
		this.curPage = curPage;
		this.curRange = curRange;
		this.listCnt = listCnt;
		this.pageCnt = pageCnt;
		this.rangeCnt = rangeCnt;
		this.startPage = startPage;
		this.endPage = endPage;
		this.startIndex = startIndex;
		this.prevPage = prevPage;
		this.nextPage = nextPage;
	}

	public Pagination(int listCnt, int curPage) {
		super();
		this.curPage = curPage;
		this.listCnt = listCnt;
	}

	public Pagination() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPageSize() {
		return pageSize;
	}

	public int getRangeSize() {
		return rangeSize;
	}

	public int getCurPage() {
		return curPage;
	}

	public int getCurRange() {
		return curRange;
	}

	public int getListCnt() {
		return listCnt;
	}

	public int getPageCnt() {
		return pageCnt;
	}

	public int getRangeCnt() {
		return rangeCnt;
	}

	public int getStartPage() {
		return startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public int getPrevPage() {
		return prevPage;
	}

	public int getNextPage() {
		return nextPage;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public void setRangeSize(int rangeSize) {
		this.rangeSize = rangeSize;
	}

	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}

	public void setCurRange(int curRange) {
		this.curRange = curRange;
	}

	public void setListCnt(int listCnt) {
		this.listCnt = listCnt;
	}

	public void setPageCnt(int pageCnt) {
		this.pageCnt = pageCnt;
	}

	public void setRangeCnt(int rangeCnt) {
		this.rangeCnt = rangeCnt;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public void setPrevPage(int prevPage) {
		this.prevPage = prevPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}
    
    
    
}
