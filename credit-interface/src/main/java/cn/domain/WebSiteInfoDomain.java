package main.java.cn.domain;

import java.io.Serializable;

/**
 * 代理商logo等域名信息
 *
 */
public class WebSiteInfoDomain implements Serializable{

	private static final long serialVersionUID = 1322278299404576311L;

	private String companyName;//代理商公司名称
	
	private String logoUrl;//代理商logo图片
	
	private String iconUrl; //代理商icon图片
	
	private String address; //代理商公司地址
	
	private String licence; //电信许可
	
	private String copyright; //版权信息
	
	private String icpRecord;//icp备案
	
	private String policeRecord;//公安备案
	
	private String hotline;//客服热线
	
	private String qq;//
	
	private String bizNo;//商务合作号
	
	private String customerID;//客服系统美恰id
	
	private String customerStatus;//客服系统是否启用
	
	private String contactInfo;//联系方式
	
	private String isAboutMe;//是否有关于我们

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLicence() {
		return licence;
	}

	public void setLicence(String licence) {
		this.licence = licence;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getIcpRecord() {
		return icpRecord;
	}

	public void setIcpRecord(String icpRecord) {
		this.icpRecord = icpRecord;
	}

	public String getPoliceRecord() {
		return policeRecord;
	}

	public void setPoliceRecord(String policeRecord) {
		this.policeRecord = policeRecord;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getHotline() {
		return hotline;
	}

	public void setHotline(String hotline) {
		this.hotline = hotline;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getBizNo() {
		return bizNo;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerStatus() {
		return customerStatus;
	}

	public void setCustomerStatus(String customerStatus) {
		this.customerStatus = customerStatus;
	}

	public String getIsAboutMe() {
		return isAboutMe;
	}

	public void setIsAboutMe(String isAboutMe) {
		this.isAboutMe = isAboutMe;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
}
