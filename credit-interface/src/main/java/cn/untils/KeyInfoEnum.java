package main.java.cn.untils;

/**
 * 接口调用所需密钥以及其它数据
 * 
 * @author ytj
 *
 */
public enum KeyInfoEnum {
	
	APPID_TEST(1,"800100", "测试环境"),
	APPID(1,"800100", "正式环境"),
	SIGN_KEY(1,"1fnm892qk3xvpf7axke9zb9mf2ehgv5f", "签名密钥"),
	PARAMS_KEY(1,"gssio959reyl9s2xkgnnptkvgeesih2m0dly493fpi5dhv6r", "参数密钥")
	;
	public int index;
	public String value;
	public String memo;

	private KeyInfoEnum(int index, String value, String memo) {
		this.index = index;
		this.value = value;
		this.memo = memo;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	
	
	
}
