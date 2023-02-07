package main.java.cn.domain.carriers;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;

/**
 * ��Ӫ����Ҫ�ط��ؽ��
 *
 */  
public class CarriersResultDomain implements Serializable{

	private static final long serialVersionUID = -4179911712605357151L;

	private String orderNo; //���׶�����
	private String handleTime; //����ʱ��
	private String type; //��Ӫ������
	private String result;//��֤���
	private String gender;//�Ա�
	private String age;//����
	private String remark;//��ע
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
		json.put("gender", gender);
		json.put("age", age);
		json.put("remark", remark);
		return json.toJSONString();
	}
	
}
