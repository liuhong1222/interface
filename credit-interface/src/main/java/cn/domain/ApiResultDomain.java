package main.java.cn.domain;

import java.io.Serializable;

/**
 * 运营商api返回结果
 *
 */
public class ApiResultDomain implements Serializable{

	private static final long serialVersionUID = 2594079817317031152L;
	
	private String value; // code
	
	private String name; // 错误名称
	
	private String desc; // 错误描述

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	

	
	
}
