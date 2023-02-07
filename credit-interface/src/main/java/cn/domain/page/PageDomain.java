package main.java.cn.domain.page;

import java.util.List;

public class PageDomain<T> {

	private List<T> tlist;
	
	private int currentPage=1; // 当前页

	private int numPerPage=10; // 每页显示多行
	
	private int totalPages=0; // 总页数
	
	private int totalNumber=0; // 总条数

	/**
	 * @return the tlist
	 */
	public List<T> getTlist() {
		return tlist;
	}

	/**
	 * @param tlist the tlist to set
	 */
	public void setTlist(List<T> tlist) {
		this.tlist = tlist;
	}

	/**
	 * @return the numPerPage
	 */
	public int getNumPerPage() {
		return numPerPage;
	}

	/**
	 * @param numPerPage the numPerPage to set
	 */
	public void setNumPerPage(int numPerPage) {
		this.numPerPage = numPerPage;
	}

	/**
	 * @return the totalPages
	 */
	public int getTotalPages() {
		return totalPages;
	}

	/**
	 * @param totalPages the totalPages to set
	 */
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	/**
	 * @return the currentPage
	 */
	public int getCurrentPage() {
		return currentPage;
	}

	/**
	 * @param currentPage the currentPage to set
	 */
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	/**
	 * @return the totalNumber
	 */
	public int getTotalNumber() {
		return totalNumber;
	}

	/**
	 * @param totalNumber the totalNumber to set
	 */
	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}

	
	 public PageDomain(Integer currentPage,Integer pageSize,Integer count){
		 if(null==currentPage || currentPage<=0)currentPage=1;
		 if(null==pageSize || pageSize<=0)pageSize=10;
		 this.currentPage=currentPage;
		 this.numPerPage=pageSize;
		 this.totalNumber=count;
		 int counttotal=(totalNumber/pageSize);
		 if ((totalNumber%pageSize)!=0) {
			 counttotal++;
		  }
	    this.totalPages=counttotal;
	 }
   
	 public PageDomain(){
		 
	 }
	
	
	

}
