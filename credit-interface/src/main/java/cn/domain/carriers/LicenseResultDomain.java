
package main.java.cn.domain.carriers;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;

/**
 * 营业执照识别
 *  
 */
public class LicenseResultDomain implements Serializable{

	private static final long serialVersionUID = 7873657439024044885L;
	private String orderNo; //业务唯一流水号
	private String handleTime; //查询时间
	private String configStr;//配置字符串信息
	private String angle;//图片的角度
	private String regNum;//注册号
	private String name;//公司名称
	private String person;//公司法人
	private String establishDate;//公司注册日期
	private String validPeriod;//公司营业期限终止日期
	private String address;//公司地址
	private String captial;//注册资本
	private String business;//经营范围
	private String elbem;//国微位置
	private String title;//标题位置
	private String stamp;//印章位置
	private String qrcode;//二维码位置
	private String success;//识别成功与否
	
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

	public String getConfigStr() {
		return configStr;
	}

	public void setConfigStr(String configStr) {
		this.configStr = configStr;
	}

	public String getAngle() {
		return angle;
	}

	public void setAngle(String angle) {
		this.angle = angle;
	}

	public String getRegNum() {
		return regNum;
	}

	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String getEstablishDate() {
		return establishDate;
	}

	public void setEstablishDate(String establishDate) {
		this.establishDate = establishDate;
	}

	public String getValidPeriod() {
		return validPeriod;
	}

	public void setValidPeriod(String validPeriod) {
		this.validPeriod = validPeriod;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCaptial() {
		return captial;
	}

	public void setCaptial(String captial) {
		this.captial = captial;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	public String getElbem() {
		return elbem;
	}

	public void setElbem(String elbem) {
		this.elbem = elbem;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStamp() {
		return stamp;
	}

	public void setStamp(String stamp) {
		this.stamp = stamp;
	}

	public String getQrcode() {
		return qrcode;
	}

	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String toString() {
		JSONObject json = new JSONObject();
		json.put("orderNo", orderNo);
		json.put("handleTime", handleTime);
		json.put("configStr", configStr);
		json.put("angle", angle);
		json.put("regNum", regNum);
		json.put("name", name);
		json.put("person", person);
		json.put("establishDate", establishDate);
		json.put("validPeriod", validPeriod);
		json.put("address", address);
		json.put("captial", captial);
		json.put("business", business);
		json.put("elbem", elbem);
		json.put("title", title);
		json.put("stamp", stamp);
		json.put("qrcode", qrcode);
		json.put("success", success);
		return json.toJSONString();
	}
	
}
