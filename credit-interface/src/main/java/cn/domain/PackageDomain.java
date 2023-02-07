package main.java.cn.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 订单 实体对象
 *
 */
public class PackageDomain implements Serializable{

	private static final long serialVersionUID = -623457979737424171L;

	private Integer packageId;//套餐id
	
	private String packageName; //套餐名称
	
	private Integer number; //条数
	
	private BigDecimal money; //金额
	
	private String orderCode; //流水号前缀
	
	private BigDecimal discout; //打折
	
	private BigDecimal originalCost; //原价

	public Integer getPackageId() {
		return packageId;
	}

	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public BigDecimal getDiscout() {
		return discout;
	}

	public void setDiscout(BigDecimal discout) {
		this.discout = discout;
	}

	public BigDecimal getOriginalCost() {
		return originalCost;
	}

	public void setOriginalCost(BigDecimal originalCost) {
		this.originalCost = originalCost;
	}
	
}
