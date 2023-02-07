package main.java.cn.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 个人认证信息
 *
 */
public class IdCardInfoDomain implements Serializable{
 
	private static final long serialVersionUID = -6284796067024539361L;

	private String creUserId;//用户id
	
	private String username;//姓名
	
	private String address; //详细地址
	
	private String idno; //身份证号码
  	
	private Date effectDate; //生效日期
	
	private Date expireDate; //失效日期

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIdno() {
		return idno;
	}

	public void setIdno(String idno) {
		this.idno = idno;
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

	public String getCreUserId() {
		return creUserId;
	}

	public void setCreUserId(String creUserId) {
		this.creUserId = creUserId;
	}
}
