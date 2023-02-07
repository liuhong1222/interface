package main.java.cn.domain.customer;

import java.util.Date;

/**
 * 用户实体对象 
 *
 */
public class CustomerDomain extends BaseObject{
	
	private static final long serialVersionUID = 8749079892633512615L;

	private String id;
	
	private Date createdate; //创建日期
	
	private String mobile; //手机号码
	
	private String username; //用户姓名
	
	private String password; //密码
	
	private String mail; //邮箱
	
	private String salt; //掩码
	
	private String isauth; //是否认证
	
	private String headpicurl;//头像图片链接

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getIsauth() {
		return isauth;
	}

	public void setIsauth(String isauth) {
		this.isauth = isauth;
	}

	public String getHeadpicurl() {
		return headpicurl;
	}

	public void setHeadpicurl(String headpicurl) {
		this.headpicurl = headpicurl;
	}
	
	
	
}
