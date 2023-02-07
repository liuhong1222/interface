package main.java.cn.enums;

/***
 * 发票
 * 
 * @author ytj
 *
 */
public enum InvoiceEnums {
	GENERAL(1,"增值税普通发票","ghjf4535c05e11e7822a000c29fb7c87"),
	SPECIAL(2,"增值税专用发票","qweer34c05e11e7822a000c29fb7c87"),
	PERSION_TITLE(3,"个人","hjhhgtr3455e11e7822a000c29fb7c87"),
	FIRM_TITLE(4,"单位","uiuytrty565e11e7822a000c29fb7c45"),
	WAITING_CHECK(5,"待审核","dfgr345605e11e7822a000c29fb7c87"),
	SUCCESS_CHECK(6,"已审核","23dfghrt605e11e7822a000c29fb7c87"),
	OPEN_INVOICE(7,"已开票","ghjtdf605e11e7822a000c29fb7c87"),
	SEND_INVOICE(8,"已寄出","kus3465d205e11e7822a000c29fb7c87"),
	FAILED_CHECK(9,"不予开票","erzsda5d205e11e7822a000c29fb7c87"),
	;
	private int index;
	private String name;
	private String code;	
	private InvoiceEnums(int index,String name,String code){
		this.index=index;
		this.name=name;
		this.code=code;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	
}