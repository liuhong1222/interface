package main.java.cn.domain.carriers;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;

/**
 * 人证比对
 *
 */  
public class SelfIdenVDomain implements Serializable{

	private static final long serialVersionUID = -3824795393302172208L;
	private String orderNo; //订单号
	private String handleTime; //查询时间
	private String result;//识别结果	
	private String message;//识别结果说明
	private String confidence;//置信度
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

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getConfidence() {
		return confidence;
	}

	public void setConfidence(String confidence) {
		this.confidence = confidence;
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
		json.put("confidence", confidence);
		json.put("result", result);
		json.put("remark", remark);
		json.put("message", message);
		return json.toJSONString();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
