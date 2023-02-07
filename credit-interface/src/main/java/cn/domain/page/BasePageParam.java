package main.java.cn.domain.page;


/**
 * 后台查询参数类
 *
 */
public class BasePageParam  {

	private Integer currentPage = 1; // 当前页

	private Integer numPerPage = 10; // 每页显示多行

	private String statTime; // 开始时间
	
	private String endTime; // 结束时间
	
	private  Integer pageNumber=0; //sql页
	
	private  Integer selected=0; //选项查询
	
	private  String likeName;  //模糊查询
	
	private String parentUserId;  //父级用户
	
	
	public String getParentUserId() {
		return parentUserId;
	}
	
	public void setParentUserId(String parentUserId) {
		this.parentUserId = parentUserId;
	}
	
	
	// 订单开始时间
	private String startOrderTime;
	// 订单结束时间
	private String endOrderTime;

	// 到账开始时间
	private String startArrivTime;

	// 到账结束
	private String endArrivTime;
	

	
	public String getStartOrderTime() {
		return startOrderTime;
	}

	public void setStartOrderTime(String startOrderTime) {
		this.startOrderTime = startOrderTime;
	}

	public String getEndOrderTime() {
		return endOrderTime;
	}

	public void setEndOrderTime(String endOrderTime) {
		this.endOrderTime = endOrderTime;
	}

	public String getStartArrivTime() {
		return startArrivTime;
	}

	public void setStartArrivTime(String startArrivTime) {
		this.startArrivTime = startArrivTime;
	}

	public String getEndArrivTime() {
		return endArrivTime;
	}

	public void setEndArrivTime(String endArrivTime) {
		this.endArrivTime = endArrivTime;
	}

	public Integer getSelected() {
		return selected;
	}
	
	public void setSelected(Integer selected) {
		this.selected = selected;
	}
	
	public void setLikeName(String likeName) {
		this.likeName = likeName;
	}
	
	public String getLikeName() {
		return likeName;
	}
	
	public Integer getPageNumber() {
		return pageNumber;
	}
	
	
	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}
	
	/**
	 * @return the startTime
	 */
	public String getStatTime() {
		return statTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStatTime(String statTime) {
		this.statTime = statTime;
	}

	/**
	 * @return the endTime
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 * @return the currentPage
	 */
	public Integer getCurrentPage() {
		return currentPage;
	}

	/**
	 * @param currentPage
	 *            the currentPage to set
	 */
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	/**
	 * @return the numPerPage
	 */
	public Integer getNumPerPage() {
		return numPerPage;
	}

	/**
	 * @param numPerPage
	 *            the numPerPage to set
	 */
	public void setNumPerPage(Integer numPerPage) {
		this.numPerPage = numPerPage;
	}

}
