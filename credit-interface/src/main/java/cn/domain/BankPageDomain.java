package main.java.cn.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 银行卡鉴权接口调用日志记录
 *
 */
public class BankPageDomain implements Serializable{

	private static final long serialVersionUID = 7435691346930395206L;

	private String id;
	
	private String customerId;//用户id
	
	private String orderNo; // 订单号
	
	private Date createDate; // 创建日期
	
	private String result; // 结果状态
	
	private String resultCode; // 结果
	
	private String bankName; //银行名称
	
	private String cardType; // 银行卡类型
	
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	
	
	
	
}
