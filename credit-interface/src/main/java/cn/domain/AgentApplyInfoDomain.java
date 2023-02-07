package main.java.cn.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 代理商申请信息
 *
 */
public class AgentApplyInfoDomain implements Serializable{
	
	private static final long serialVersionUID = -94046497260823073L;

	private Integer id;
	
	private String companyName; //公司名称
	
	private String person; //联系人
	
	private String phone; //电话
	
	private String mail; //邮箱
	
	private String position; //职务
	
	private Integer status; //处理状态 1-已处理 0-未处理
	
	private Date createTime; //创建时间
	
	private Date updateTime; //修改时间

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
