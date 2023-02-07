package main.java.cn.common;


@SuppressWarnings("all")
public class BackResultWanShu<T> {

	private String resultMsg;
	private String resultCode;
	private int chargeCounts;
	private T resultObj;

	public String getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public T getResultObj() {
		return resultObj;
	}

	public void setResultObj(T resultObj) {
		this.resultObj = resultObj;
	}
	

	public int getChargeCounts() {
		return chargeCounts;
	}

	public void setChargeCounts(int chargeCounts) {
		this.chargeCounts = chargeCounts;
	}

	public BackResultWanShu() {
		this.resultCode = "000000";
		this.resultMsg = "成功";
	}

	public BackResultWanShu(String resultCode, String resultMsg) {
		this.resultCode = resultCode;
		this.resultMsg = resultMsg;
		this.setResultObj(null);
	}

	public BackResultWanShu(String resultCode, String resultMsg, T t) {
		this.resultCode = resultCode;
		this.resultMsg = resultMsg;
		this.setResultObj(t);
	}

	public static BackResultWanShu succeed() {
		return new BackResultWanShu(ResultCode.RESULT_SUCCEED, "成功");
	}

	public static BackResultWanShu succeed(Object obj) {
		return new BackResultWanShu(ResultCode.RESULT_SUCCEED, "成功", obj);
	}

	
	public static BackResultWanShu error(String msg) {
		return error(ResultCode.RESULT_FAILED, msg);
	}

	public static BackResultWanShu error() {
		return error(ResultCode.RESULT_FAILED, "失败");
	}

	public static BackResultWanShu error(String code, String msg) {
		return new BackResultWanShu(code, msg);
	}
}
