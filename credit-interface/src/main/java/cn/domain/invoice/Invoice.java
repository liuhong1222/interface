package main.java.cn.domain.invoice;

import java.util.Date;

import main.java.cn.domain.customer.BaseObject;

/**
 * 发票
 *
 */
public class Invoice extends BaseObject{

	private static final long serialVersionUID = 7086514539211323919L;
	private String id;	
	private String customer_id; //用户id	
	private String teamno; //团单号
	private Date createdate; //创建日期	
	private String invoiceno; //发票订单号
	private String invoicetype; //发票类型
	private String invoicetitle_type; //发票抬头类型
	private String invoicetitle_name; //发票抬头
	private String invoicetitle_iden; //企业标识号
	private String recipient; //收件人
	private String recipient_phone; //收件人电话
	private String recipenet_address; //收件人地址	
	private String status; //开票状态
	private String devilery_firm; //快递公司
	private String devilery_no; //快递单号
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
	public String getTeamno() {
		return teamno;
	}
	public void setTeamno(String teamno) {
		this.teamno = teamno;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public String getInvoiceno() {
		return invoiceno;
	}
	public void setInvoiceno(String invoiceno) {
		this.invoiceno = invoiceno;
	}
	public String getInvoicetype() {
		return invoicetype;
	}
	public void setInvoicetype(String invoicetype) {
		this.invoicetype = invoicetype;
	}
	public String getInvoicetitle_type() {
		return invoicetitle_type;
	}
	public void setInvoicetitle_type(String invoicetitle_type) {
		this.invoicetitle_type = invoicetitle_type;
	}
	public String getInvoicetitle_name() {
		return invoicetitle_name;
	}
	public void setInvoicetitle_name(String invoicetitle_name) {
		this.invoicetitle_name = invoicetitle_name;
	}
	public String getInvoicetitle_iden() {
		return invoicetitle_iden;
	}
	public void setInvoicetitle_iden(String invoicetitle_iden) {
		this.invoicetitle_iden = invoicetitle_iden;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public String getRecipient_phone() {
		return recipient_phone;
	}
	public void setRecipient_phone(String recipient_phone) {
		this.recipient_phone = recipient_phone;
	}
	public String getRecipenet_address() {
		return recipenet_address;
	}
	public void setRecipenet_address(String recipenet_address) {
		this.recipenet_address = recipenet_address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDevilery_firm() {
		return devilery_firm;
	}
	public void setDevilery_firm(String devilery_firm) {
		this.devilery_firm = devilery_firm;
	}
	public String getDevilery_no() {
		return devilery_no;
	}
	public void setDevilery_no(String devilery_no) {
		this.devilery_no = devilery_no;
	}
	
	
	
}
