package main.java.cn.domain.carriers;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;

/**
 * 活体检测
 *
 */  
public class LivenessDomain implements Serializable{

	private static final long serialVersionUID = 1681074979915889233L;
	private String orderNo; //订单号
	private String handleTime; //查询时间
	private String result;//识别结果	
	private String motions;//动作判定的结果
	private String imageId;//视频中提取的照片id
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

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
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
		json.put("result", result);
		json.put("motions", motions);
		json.put("imageId", imageId);
		json.put("remark", remark);
		return json.toJSONString();
	}

	public String getMotions() {
		return motions;
	}

	public void setMotions(String motions) {
		this.motions = motions;
	}
}
