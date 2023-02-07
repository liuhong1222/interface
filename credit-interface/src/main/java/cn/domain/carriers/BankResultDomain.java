
package main.java.cn.domain.carriers;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;

/**
 * 银行卡鉴权-精细
 *  
 */
public class BankResultDomain implements Serializable{

	private static final long serialVersionUID = 4133516793584712127L;
	private String orderNo; //业务唯一流水号
	private String handleTime; //查询时间
	private String result;//结果码
	private String bankName;//开户行
	private String cardType;//卡类型
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


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public String getCardType() {
		return cardType;
	}


	public void setCardType(String cardType) {
		this.cardType = cardType;
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
		json.put("bankName", bankName);
		json.put("result", result);
		json.put("cardType", cardType);
		json.put("remark", remark);
		return json.toJSONString();
	}
	
}
