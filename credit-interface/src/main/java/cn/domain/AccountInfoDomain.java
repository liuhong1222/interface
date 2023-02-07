package main.java.cn.domain;

import java.io.Serializable;

/**
 * api 账户信息表
 *
 */
public class AccountInfoDomain implements Serializable{

	private static final long serialVersionUID = 1439296801454195554L;

	private Integer id;
	
	private Integer creUserId; // 关联用户id
	
	private Integer numReminding; // 剩余多少条数提醒
  	
	private String bdIp; // 绑定ip
	
	private String pushMobiles; // 提醒的手机号码串
	
	private Integer tcAccount; // 身份信息核验接口条数
	
	private Integer fcAccount; // 银行卡四要素接口条数
	
	private Integer msAccount;// 运营商号码状态查询接口条数
	
	private Integer ctAccount;// 运营商三要素接口条数
	
	private Integer fiAccount;// 人证比对接口条数
	
	private Integer ffAccount;// 一比一人脸比对接口条数
	
	private Integer clAccount;// 活体检测接口条数
	
	private Integer idocrAccount;// 身份证OCR接口条数
	
	private Integer blocrAccount;// 营业执照OCR接口条数
	
	private Integer bocrAccount;// 银行卡OCR接口条数
	
	private Integer docrAccount;// 驾驶证OCR接口条数
	
	private Integer version; //版本号
	
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCreUserId() {
		return creUserId;
	}

	public void setCreUserId(Integer creUserId) {
		this.creUserId = creUserId;
	}

	public Integer getNumReminding() {
		return numReminding;
	}

	public void setNumReminding(Integer numReminding) {
		this.numReminding = numReminding;
	}

	public String getBdIp() {
		return bdIp;
	}

	public void setBdIp(String bdIp) {
		this.bdIp = bdIp;
	}

	public String getPushMobiles() {
		return pushMobiles;
	}

	public void setPushMobiles(String pushMobiles) {
		this.pushMobiles = pushMobiles;
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

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
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
	
	
	
}
