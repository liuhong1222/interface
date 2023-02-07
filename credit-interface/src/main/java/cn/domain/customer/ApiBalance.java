package main.java.cn.domain.customer;

/**
 * api余额
 *
 */
public class ApiBalance extends BaseObject{

	private static final long serialVersionUID = 8760690486232744111L;
	private String id;	
	private String customer_id; //用户id	
	private String api_id; //api产品id
	private Double totalnum; //总条数
	private Double usednum; //使用条数
	private Double remainnum; //剩余条数
	private Double warningnum; //剩余条数
	private Double version; //版本号
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getApi_id() {
		return api_id;
	}
	public void setApi_id(String api_id) {
		this.api_id = api_id;
	}
	public Double getTotalnum() {
		return totalnum;
	}
	public void setTotalnum(Double totalnum) {
		this.totalnum = totalnum;
	}
	public Double getUsednum() {
		return usednum;
	}
	public void setUsednum(Double usednum) {
		this.usednum = usednum;
	}
	public Double getRemainnum() {
		return remainnum;
	}
	public void setRemainnum(Double remainnum) {
		this.remainnum = remainnum;
	}
	public Double getVersion() {
		return version;
	}
	public void setVersion(Double version) {
		this.version = version;
	}
	public Double getWarningnum() {
		return warningnum;
	}
	public void setWarningnum(Double warningnum) {
		this.warningnum = warningnum;
	}
	
	
}
