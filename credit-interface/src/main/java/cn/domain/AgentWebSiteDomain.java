package main.java.cn.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 代理商域名、短信签名
 *
 */
public class AgentWebSiteDomain implements Serializable{

	private static final long serialVersionUID = 7175101880176649135L;

	private String agentId; //代理商id
	
	private String domain; //域名
	
	private String smsSign; //短信签名

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getSmsSign() {
		return smsSign;
	}

	public void setSmsSign(String smsSign) {
		this.smsSign = smsSign;
	}
	
	
}
