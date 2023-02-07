package main.java.cn.domain;

import java.io.Serializable;
import java.util.Date;

public class CreUserWarningDomain implements Serializable{
	
	private static final long serialVersionUID = 4604484011079471183L;
	
	private Integer creUserId;
	
	private String productName;
	
	private Integer warningCount;

	private String informMobiles;
	
	private Integer informNums;

	private String createBy;
	
	private Date createTime;
	
	private String lastRepair;
	
	private Date lastTime;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getWarningCount() {
		return warningCount;
	}

	public void setWarningCount(Integer warningCount) {
		this.warningCount = warningCount;
	}

	public String getInformMobiles() {
		return informMobiles;
	}

	public void setInformMobiles(String informMobiles) {
		this.informMobiles = informMobiles;
	}

	public Integer getInformNums() {
		return informNums;
	}

	public void setInformNums(Integer informNums) {
		this.informNums = informNums;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getLastRepair() {
		return lastRepair;
	}

	public void setLastRepair(String lastRepair) {
		this.lastRepair = lastRepair;
	}

	public Date getLastTime() {
		return lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	public Integer getCreUserId() {
		return creUserId;
	}

	public void setCreUserId(Integer creUserId) {
		this.creUserId = creUserId;
	}
	
	
	
}
