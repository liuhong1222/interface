package main.java.cn.enums;

/***
 * 发票
 * 
 * @author ytj
 *
 */
public enum PayStatusEnums {
	PAY_SUCCESS(2,"支付成功","2"),
	PAY_WAIT(1,"待支付","1"),
	PAY_FAILED(3,"支付失败","3"),
	;
	private int index;
	private String name;
	private String code;	
	private PayStatusEnums(int index,String name,String code){
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