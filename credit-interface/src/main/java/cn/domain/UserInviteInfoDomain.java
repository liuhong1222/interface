package main.java.cn.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 双十一活动用户邀请信息
 *
 */
public class UserInviteInfoDomain implements Serializable{

	private static final long serialVersionUID = -5055817579920489337L;

	private Integer id;
	
	private Integer creUserId; //用户id
	
	private Integer inviteCount; //邀请数量
	
	private Integer discount; //折扣
	
	private Integer flag; //启用标识  1-正常 0-禁用
	
	private Date createtime; //创建时间
	
	private Date updatetime; //修改时间

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

	public Integer getInviteCount() {
		return inviteCount;
	}

	public void setInviteCount(Integer inviteCount) {
		this.inviteCount = inviteCount;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
}
