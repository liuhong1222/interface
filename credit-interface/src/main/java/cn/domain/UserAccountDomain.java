package main.java.cn.domain;

import java.io.Serializable;

public class UserAccountDomain implements Serializable{

	private static final long serialVersionUID = -4538440785705903870L;

	private Integer creUserId;
	
	private Integer account;
	
	private Integer apiAccount;

	private Integer rqAccount;
	
	private Integer tcAccount;

	private Integer fcAccount;
	
	private Integer msAccount;
	
	private Integer ctAccount;
	
	private Integer fiAccount;// 人证比对接口条数
	
	private Integer ffAccount;// 一比一人脸比对接口条数
	
	private Integer clAccount;// 活体检测接口条数
	
	private Integer idocrAccount;// 身份证OCR接口条数
	
	private Integer blocrAccount;// 营业执照OCR接口条数
	
	private Integer bocrAccount;// 银行卡OCR接口条数
	
	private Integer docrAccount;// 驾驶证OCR接口条数
	
	private Integer isFrozen;//冻结状态  0-未冻结   1-冻结
	
	public Integer getFiAccount() {
		return fiAccount;
	}

	public void setFiAccount(Integer fiAccount) {
		this.fiAccount = fiAccount;
	}

	public Integer getFfAccount() {
		return ffAccount;
	}

	public void setFfAccount(Integer ffAccount) {
		this.ffAccount = ffAccount;
	}

	public Integer getClAccount() {
		return clAccount;
	}

	public void setClAccount(Integer clAccount) {
		this.clAccount = clAccount;
	}

	public Integer getIdocrAccount() {
		return idocrAccount;
	}

	public void setIdocrAccount(Integer idocrAccount) {
		this.idocrAccount = idocrAccount;
	}

	public Integer getBlocrAccount() {
		return blocrAccount;
	}

	public void setBlocrAccount(Integer blocrAccount) {
		this.blocrAccount = blocrAccount;
	}

	public Integer getBocrAccount() {
		return bocrAccount;
	}

	public void setBocrAccount(Integer bocrAccount) {
		this.bocrAccount = bocrAccount;
	}

	public Integer getDocrAccount() {
		return docrAccount;
	}

	public void setDocrAccount(Integer docrAccount) {
		this.docrAccount = docrAccount;
	}

	public Integer getCreUserId() {
		return creUserId;
	}

	public void setCreUserId(Integer creUserId) {
		this.creUserId = creUserId;
	}

	public Integer getAccount() {
		return account;
	}

	public void setAccount(Integer account) {
		this.account = account;
	}

	public Integer getApiAccount() {
		return apiAccount;
	}

	public void setApiAccount(Integer apiAccount) {
		this.apiAccount = apiAccount;
	}

	public Integer getRqAccount() {
		return rqAccount;
	}

	public void setRqAccount(Integer rqAccount) {
		this.rqAccount = rqAccount;
	}

	public Integer getTcAccount() {
		return tcAccount;
	}

	public void setTcAccount(Integer tcAccount) {
		this.tcAccount = tcAccount;
	}

	public Integer getFcAccount() {
		return fcAccount;
	}

	public void setFcAccount(Integer fcAccount) {
		this.fcAccount = fcAccount;
	}

	public Integer getMsAccount() {
		return msAccount;
	}

	public void setMsAccount(Integer msAccount) {
		this.msAccount = msAccount;
	}

	public Integer getCtAccount() {
		return ctAccount;
	}

	public void setCtAccount(Integer ctAccount) {
		this.ctAccount = ctAccount;
	}

	public Integer getIsFrozen() {
		return isFrozen;
	}

	public void setIsFrozen(Integer isFrozen) {
		this.isFrozen = isFrozen;
	}
}
