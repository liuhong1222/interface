package main.java.cn.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 运营商三要素接口调用日志记录
 *
 */
public class CarriersPageDomain implements Serializable{

	private static final long serialVersionUID = 1470707403029197876L;

	private String id;
	
	private String customerId;//用户id
	
	private String orderNo; // 订单号
	
	private Date createDate; // 创建日期
	
	private String result; // 结果状态
	
	private String resultCode; // 结果
	
	private String type; //运营商类型
	
	private String gender; //性别
	
	private String age;//年龄
	
	private String remark; // 备注
		
	private Date createTime; // 创建时间

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	
	
	
}
