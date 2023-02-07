package main.java.cn.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 企业认证信息
 *
 */
public class BusinessInfoDomain implements Serializable{

	private static final long serialVersionUID = 7065625042936355749L;

	private String creUserId;//用户id
	
	private String name;//企业名称
	
	private String regnum; //营业执照号
	
	private String address; //公司住址
	
	private String person;//法人姓名
  	
	private Date effectDate; //生效日期
	
	private Date expireDate; //失效日期
	
	private String business;//营业范围

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegnum() {
		return regnum;
	}

	public void setRegnum(String regnum) {
		this.regnum = regnum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public Date getEffectDate() {
		return effectDate;
	}

	public void setEffectDate(Date effectDate) {
		this.effectDate = effectDate;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	public String getCreUserId() {
		return creUserId;
	}

	public void setCreUserId(String creUserId) {
		this.creUserId = creUserId;
	}
	
}
