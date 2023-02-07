
package main.java.cn.domain.carriers;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;

/**
 * 二要素认证
 *  
 */
public class IdCardResultDomain implements Serializable{

	private static final long serialVersionUID = 6303780188862155418L;
	private String orderNo; //业务唯一流水号
	private String handleTime; //查询时间
	private String result;//结果码
	private String province;//省份
	private String city;//市区
	private String country;//城区
	private String birthday;//生日
	private String age;//年龄
	private String gender;//性别
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

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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
		json.put("province", province);
		json.put("city", city);
		json.put("country", country);
		json.put("birthday", birthday);
		json.put("age", age);
		json.put("result", result);
		json.put("gender", gender);
		json.put("remark", remark);
		return json.toJSONString();
	}
	
}
