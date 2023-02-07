package main.java.cn.domain;

import java.io.Serializable;

public class SpacePhoneDomain implements Serializable{

	private static final long serialVersionUID = 8604070986915828142L;
	
	private String mobile; // 手机号码
	
	private String status; // 状态

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
