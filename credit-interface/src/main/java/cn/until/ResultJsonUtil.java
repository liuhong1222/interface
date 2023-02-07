package main.java.cn.until;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.java.cn.common.BackResult;
import main.java.cn.domain.carriers.ApiResultDomain;
import main.java.cn.enums.ResultJsonCode;
import main.java.cn.enums.ServiceCode;

/**
 * author lh
 * 
 */
public class ResultJsonUtil {
	
	/**
	 * 
	 * @param resultJsonCode  状态码
	 * @return
	 */
	public static String getResultJson(ResultJsonCode resultJsonCode) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("value", resultJsonCode.value);
		result.put("name", resultJsonCode.name);
		result.put("desc", resultJsonCode.desc);
		return JsonUtil.toJSONString(result);
	}
	
	public static String getFailResultJson(Object msg) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("ret_code", ServiceCode.ERROR.index);
		result.put("ret_msg", msg);
		return JsonUtil.toJSONString(result);
	}
	
	public static String getFailResultJson(int code,Object msg) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("ret_code", code);
		result.put("ret_msg", msg);
		return JsonUtil.toJSONString(result);
	}
	
	public static String getSuccessResultJson(Object msg) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("ret_code", ServiceCode.SUCCESS.index);
		result.put("ret_msg", msg);
		return JsonUtil.toJSONString(result);
	}

	public static String getSuccessResultJson() {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("ret_code", ServiceCode.SUCCESS.index);
		result.put("ret_msg", "success");
		return JsonUtil.toJSONString(result);
	}
	
	/**
	 * 
	 * @param <E>
	 * @param
	 * @return
	 */
	public static BackResult<List<ApiResultDomain>> getFailedResult(ResultJsonCode resultJsonCode) {
		BackResult<List<ApiResultDomain>> results = new BackResult<List<ApiResultDomain>>();
		results.setResultCode(resultJsonCode.value);
		results.setResultMsg(resultJsonCode.name);
		results.setResultObj(null);
		return results;
	}
	
	/**
	 *  接口调用失败的返回结果
	 * @param resultJsonCode
	 * @param ardmList
	 * @return
	 */
	public static BackResult<List<ApiResultDomain>> getFailedResult(ResultJsonCode resultJsonCode,List<ApiResultDomain> ardmList) {
		BackResult<List<ApiResultDomain>> results = new BackResult<List<ApiResultDomain>>();
		results.setResultCode(resultJsonCode.value);
		results.setResultMsg(resultJsonCode.name);
		results.setResultObj(ardmList);
		return results;
	}
	
	
	
	/**
	 * 
	 * @param
	 * @return
	 */
	public static BackResult<List<ApiResultDomain>> getFailedResultList(ResultJsonCode resultJsonCode) {
		BackResult<List<ApiResultDomain>> results = new BackResult<List<ApiResultDomain>>();
		results.setResultCode(resultJsonCode.value);
		results.setResultMsg(resultJsonCode.name);
		results.setResultObj(null);
		return results;
	}
	
}
