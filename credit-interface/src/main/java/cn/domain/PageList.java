package main.java.cn.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @param <T>
 */
public class PageList<T> implements Serializable {

	private static final long serialVersionUID = -2949497622293336316L;

	/**
	 * 当前页第一条数据在List中的位置,从0开始
	 */
	private long start = 0;
	/**
	 * 页大小
	 */
	private int pageSize = 20;
	/**
	 * 当前页 默认1
	 */
	private long totalPage = 1;
	/**
	 * 总记录数
	 */
	private long totalCount;
	
	/**
	 * 当前页中存放的数据
	 */
	private List<T> records = new ArrayList<T>();

	public long getStart() {
		return start;
	}

	public void setStart(long start) {
		this.start = start;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public long getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(long totalPage) {
		this.totalPage = totalPage;
	}

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}

	public List<T> getRecords() {
		return records;
	}

	public void setRecords(List<T> records) {
		this.records = records;
	}


	
}
