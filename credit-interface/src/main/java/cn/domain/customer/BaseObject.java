package main.java.cn.domain.customer;

import java.io.Serializable;
import java.util.Date;

public class BaseObject implements Serializable{

	private static final long serialVersionUID = -1197804798055841561L;
	
	private Integer flag;
	private String createby;
	private Date createtime;
	private String lastrepair;
	private Date lasttime;
	public Integer getFlag() {
		return flag;
	}
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
	public String getCreateby() {
		return createby;
	}
	public void setCreateby(String createby) {
		this.createby = createby;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getLastrepair() {
		return lastrepair;
	}
	public void setLastrepair(String lastrepair) {
		this.lastrepair = lastrepair;
	}
	public Date getLasttime() {
		return lasttime;
	}
	public void setLasttime(Date lasttime) {
		this.lasttime = lasttime;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
