package main.java.cn.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 飓金荣通接口调用日志
 *
 */
public class ApiLogPageDomain implements Serializable{

	private static final long serialVersionUID = 7435691346930395206L;

	private String id;
	
	private String customerId;//用户id
	
	private String method; // 接口名称
	
	private String orderNo; // 订单号
	
	private String name; // 姓名
	
	private String idtype; // 证件类型
	
	private String idnum; // 证件号码
	
	private String cardno; // 银行卡号
	
	private String mobile; // 手机号码 
	
	private String result; // 返回结果
	
	private String resultDesc; // 返回结果描述
	
	private Date createTime; // 创建时间

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdtype() {
		return idtype;
	}

	public void setIdtype(String idtype) {
		this.idtype = idtype;
	}

	public String getIdnum() {
		return idnum;
	}

	public void setIdnum(String idnum) {
		this.idnum = idnum;
	}

	public String getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getResultDesc() {
		return resultDesc;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	
	
	
	
}
