package main.java.cn.enums;

/***
 * 认证api名称
 * 
 *
 */
public enum AuthApiNameEnums {
	CARRIERSAUTH("carriersAuth","运营商三要素"),
	MOOBILESTATUS("mobileStatus","号码实时在线检测"),
	IDCARDAUTH("idCardAuth","身份认证二要素"),
	BANKAUTH("bankAuth","银行卡鉴权")
	;
	private String name;
	private String code;	
	private AuthApiNameEnums(String code,String name){
		this.name=name;
		this.code=code;
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