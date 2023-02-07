package main.java.cn.domain.carriers;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;

/**
 * 运营商三要素精细版
 *
 */  
public class CarriersDetailResultDomain implements Serializable{

	private static final long serialVersionUID = -793721545136335186L;
	private String orderNo; //订单号
	private String handleTime; //查询时间
	private String type; //运营商类型
	private String result;//返回结果
	private String chargesStatus;//收费标识
	private String gender;//性别
	private String age;//年龄
	private String remark;//备注
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getHandleTime() {
		return handleTime;
	}
	public void setHandleTime(String handleTime) {
		this.handleTime = handleTime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public String toString() {
		JSONObject json = new JSONObject();
		json.put("orderNo", orderNo);
		json.put("handleTime", handleTime);
		json.put("type", type);
		json.put("result", result);
		json.put("chargesStatus", chargesStatus);
		json.put("gender", gender);
		json.put("age", age);
		json.put("remark", remark);
		return json.toJSONString();
	}
	public String getChargesStatus() {
		return chargesStatus;
	}
	public void setChargesStatus(String chargesStatus) {
		this.chargesStatus = chargesStatus;
	}
	
}
