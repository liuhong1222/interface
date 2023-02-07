package main.java.cn.enums;

/**
 * @author i-zhanggt
 *
 */
public enum ServiceCode {
	
	SUCCESS(0, "成功数据"), ERROR(-1, "失败描述"), WARN(-2, "告警信息"), NOSUCHSERVICE(-1001, "没有找到服务"), NOSUCHMETHOD(-1002, "没有找到服务方法"), NOACCESS(-1003, "服务未公开"), WRONGPARAM(
			-1004, "Deploy注解和请求参数不一致"), NOSUPPORTMETHOD(-1005, "请求方法不支持 '%s'"), UNKNOWN(-9999, "未知错误");
	public int index;
	public String name;

	private ServiceCode(int index, String name) {
		this.index = index;
		this.name = name;
	}
}
