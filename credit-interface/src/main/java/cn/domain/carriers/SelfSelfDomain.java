package main.java.cn.domain.carriers;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;

/**
 * 人脸一比-比对
 *
 */  
public class SelfSelfDomain implements Serializable{

	private static final long serialVersionUID = -6740423961780620821L;
	private String orderNo; //订单号
	private String handleTime; //查询时间
	private String result;//识别结果	
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
		return json.toJSONString();
	}
}
