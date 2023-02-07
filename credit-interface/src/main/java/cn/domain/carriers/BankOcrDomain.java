package main.java.cn.domain.carriers;

import java.io.Serializable;

import com.alibaba.fastjson.JSONObject;

/**
 * 银行卡Ocr
 *
 */  
public class BankOcrDomain implements Serializable{

	private static final long serialVersionUID = -1927647515386995136L;
	private String orderNo; //订单号
	private String handleTime; //查询时间
	private String cardNum; //银行卡号
	private String bankName; //银行名称
	private String cardType; //卡类型
	private String result;//识别结果	
	private String remark;//识别结果	
	public String getOrderNo() {
		return orderNo;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
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


	public String getCardNum() {
		return cardNum;
	}


	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}


	public String getResult() {
		return result;
	}


	public void setResult(String result) {
		this.result = result;
	}


	public String toString() {
		JSONObject json = new JSONObject();
		json.put("orderNo", orderNo);
		json.put("handleTime", handleTime);
		json.put("cardNum", cardNum);
		json.put("bankName", bankName);
		json.put("cardType", cardType);
		json.put("result", result);
		json.put("remark", remark);
		return json.toJSONString();
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
	
}
