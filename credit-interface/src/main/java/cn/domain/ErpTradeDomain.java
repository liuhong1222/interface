package main.java.cn.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * erp 充值或者退款返回订单信息
 *
 */
public class ErpTradeDomain implements Serializable{

	private static final long serialVersionUID = 8278328344750594750L;
	
	private BigDecimal money;
	
	private Integer count;

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

}
