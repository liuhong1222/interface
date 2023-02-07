package main.java.cn.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 双十一活动邀请明细
 *
 */
public class InviteDetailDomain implements Serializable{

	private static final long serialVersionUID = 5541727816335608578L;

	private Integer id;
	
	private Integer creUserId; //用户id
	
	private String mobile; //手机号码
	
	private Integer inviteType; //邀请类型
	
	private String userName; //邀请人姓名
	
	private String orderNo; //订单号
	
	private Integer freeCount; //邀请人赠送条数
	
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getInviteType() {
		return inviteType;
	}

	public void setInviteType(Integer inviteType) {
		this.inviteType = inviteType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
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

	public Integer getFreeCount() {
		return freeCount;
	}

	public void setFreeCount(Integer freeCount) {
		this.freeCount = freeCount;
	}
}
