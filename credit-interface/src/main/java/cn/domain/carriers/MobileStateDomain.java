package main.java.cn.domain.carriers;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.JSONObject;

/**
 * 号码实时状态
 *
 */
public class MobileStateDomain implements Serializable{

	private static final long serialVersionUID = -7652011212027943935L;

	private String orderNo;	//订单号
	private String handleTime; //查询时间
	private String mobile; // 手机号码	
	private String area; // 地区	
	private String numberType; // 号码类型	
	private String status; // 1：实号  0：空号 
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getNumberType() {
		return numberType;
	}
	public void setNumberType(String numberType) {
		this.numberType = numberType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
		json.put("mobile", mobile);
		json.put("area", area);
		json.put("numberType", numberType);
		json.put("status", status);
		json.put("remark", remark);
		return json.toJSONString();
	}
}
