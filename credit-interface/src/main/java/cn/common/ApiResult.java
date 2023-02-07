package main.java.cn.common;

public class ApiResult {

	private String message;
	private String code;
	private Object data;
	private Integer chargeCount;
	private Integer chargeStatus;
	
	/**
	 * 返回成功带默认的数据
	 * @param object data
	 * @return Result
	 */
    public static ApiResult success(Object object,Integer chargeCount){
    	ApiResult result = new ApiResult();
        result.setCode(ResultCode.RESULT_SUCCEED);
        result.setData(object);
        result.setMessage("成功");
        result.setChargeCount(chargeCount);
        result.setChargeStatus(chargeCount > 0 ? 1 : 0);
        return result;
    }
    
    /**
	 * 返回失败带默认的数据
	 * @param object data
	 * @return Result
	 */
    public static ApiResult failed(String code,String mseeage){
    	ApiResult result = new ApiResult();
        result.setCode(code);
        result.setData(null);
        result.setMessage(mseeage);
        result.setChargeCount(0);
        result.setChargeStatus(0);
        return result;
    }
    
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Integer getChargeCount() {
		return chargeCount;
	}
	public void setChargeCount(Integer chargeCount) {
		this.chargeCount = chargeCount;
	}
	public Integer getChargeStatus() {
		return chargeStatus;
	}
	public void setChargeStatus(Integer chargeStatus) {
		this.chargeStatus = chargeStatus;
	}
}
