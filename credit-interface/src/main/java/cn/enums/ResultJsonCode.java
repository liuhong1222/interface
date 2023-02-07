package main.java.cn.enums;

/**
 * 返回值结果
 * 
 */
public enum ResultJsonCode {

	SUCCESS("000000", "成功","正常"), 
	APPID_ERROR("10001", "appId不正确",""),
	APPID_NULL("10002", "appId为空",""),
	TIMESTAMP_NULL("10003", "时间参数为空",""),
	METHOD_NULL("10004", "方法参数为空",""),
	METHOD_ERROR("10005", "没有该项数据服务",""),
	APPID_LIMIT("10006", "APP为受限状态",""),
	SIGN_ERROR("10008", "签名不正确",""),
	PARAM_NULL("10009", "params参数为空",""),
	TIMESTAMP_ERROR("10010", "时间参数不对，请对时",""),
	CARRIEROPERATOR_ERROR("30000", "不支持的运营商",""),
	MDN_NULL("40000", "mdn号码为空",""),
	MDN_ERROR("40010", "mdn号码格式错误",""),
	MONTH_NULL("40001", "month为空",""),
	DAY_NULL("40002", "day为空",""),
	USERNAME_NULL("40003", "姓名为空",""),
	ID_NULL("40004", "ID为空",""),
	TARGETMDN_NULL("40005", "目标mdn为空",""),
	IMSI_NULL("40006", "imsi为空",""),
	MEID_NULL("40007", "meid为空",""),
	SYSTEM_ERROR("90000", "系统错误",""),
	OPERATION_FAID("-30000", "接口暂未开放","接口暂未开放"),
	MDNCARRIEROPERATOR_ERROR("-30016", "非本网手机号码","手机号码格式错误"),
	TARGETPARAMTER_NULL("-30013", "目标数据字段为空，无法完成计算",""),
	MDNDATA_NULL("-30014", "没有该手机号数据",""),
	MDNMONTHDATA_NULL("-30015", "没有该手机号指定月份数据",""),
	MDNMONTHDATA_NEXT("-30019", "没有该手机号指定月份的数据，建议下月再试",""),
	LACK_BALANCE("60001", "api接口余额不足","用户余额不足，请充值"),
	ENCODING_ERROR("50001", "字符转码异常","字符转码异常"),
	INVOKING_FAILED("50002", "接口调用失败","接口调用失败"),
	PARAM_NOT_ALL_NULL("50003", "参数列表中某个参数为空","参数列表中某个参数为空"),
	NO_LOGIN("50005", "appId为空","获取appKey失败，用户未登录"),
	CHECK_FAIED("50006" , "验证失败",""),
	IDCARD_ERROR("50007" , "身份证号码格式不正确",""),
	IDCARD_NULL("50008" , "身份证号码为空",""),
	CARDNO_NULL("50009" , "银行卡号为空",""),
	Mobile_NULL("50011" , "手机号码为空",""),
	IMG_ERROR("50012" , "输入图片不符合该服务",""),
	IMG_NULL("50013" , "输入图片为空",""),
	PARAM_MORE_NULL("50010" , "姓名、身份证号码、手机号码至少需要一个不能为空",""),
	IDNUM_NULL("50004", "身份证号码为空","身份证号码参数为空");
	
	public String value;
	public String name;
	public String desc;

	private ResultJsonCode(String value, String name,String desc) {
		this.value = value;
		this.name = name;
		this.desc = desc;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	

}
