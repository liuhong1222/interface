package main.java.cn.service;

import java.util.Map;

import main.java.cn.common.BackResult;
import main.java.cn.domain.AccountInfoDomain;
import main.java.cn.domain.ApiAccountInfoDomain;


public interface ApiAccountInfoBusService {
	
	/**
	 * 根据用户id查询api账户信息
	 * @param creUserId
	 * @return
	 */
	BackResult<ApiAccountInfoDomain> findByCreUserId(String creUserId);
	
	/**
	 * 修改账户信息
	 * @param domain
	 * @return
	 */
	BackResult<ApiAccountInfoDomain> updateApiAccountInfo(ApiAccountInfoDomain domain);
	
	/**
	 * 根据账户名和密码或者对象
	 * @param name
	 * @param password
	 * @return
	 */
	BackResult<ApiAccountInfoDomain> findByNameAndPwd(String name, String password);
	
	BackResult<ApiAccountInfoDomain> findByAppId(String appId);
	
	/**
	 * api账户信息检测
	 * @param apiName
	 * @param password
	 * @param ip
	 * @param checkCount
	 * @return
	 */
	BackResult<Integer> checkApiAccount(String apiName,String password,String ip,int checkCount);

	/**
	 * 账户二次清洗接口账户信息检测
	 * @param apiName
	 * @param password
	 * @param ip
	 * @param checkCount
	 * @return
	 */
	BackResult<Integer> checkRqApiAccount(String apiName,String password,String ip,int checkCount);
	
	/**
	 * 飓金荣通接口调用
	 * @param apiName
	 * @param password
	 * @param ip
	 * @param checkCount
	 * @return
	 */
	BackResult<AccountInfoDomain> checkTcAccount(String apiName, String password, String method,String ip);
	
	/**
	 * 飓金荣通接口调用
	 * @param apiName
	 * @param password
	 * @param ip
	 * @param checkCount
	 * @return
	 */
	BackResult<Integer> updateTcAccount(Map<String,Object> params);
	
	/**
	 * 号码状态实时检测
	 * @param apiName
	 * @param password
	 * @param ip
	 * @param checkCount
	 * @return
	 */
	BackResult<Integer> checkMsAccount(String apiName,String password,String ip,int checkCount);

	
	/**
	 * 银行卡鉴权
	 * @param apiName
	 * @param password
	 * @param ip
	 * @param checkCount
	 * @return
	 */
	BackResult<Integer> checkFcAccountN(String apiName,String password,String ip,int checkCount);
	
	/**
	 * 运营商三要素接口
	 * @param apiName
	 * @param password
	 * @param ip
	 * @param checkCount 
	 * @return
	 */
	BackResult<Integer> checkCtAccountN(String apiName,String password,String ip,int checkCount);
	
	/**
	 * 身份认证接口新
	 * @param apiName
	 * @param password
	 * @param ip
	 * @param checkCount
	 * @return
	 */
	BackResult<Integer> checkTcAccountN(String apiName,String password,String ip,int checkCount);
	
	/**
	 * 人证比对
	 * @param apiName
	 * @param password
	 * @param ip
	 * @param checkCount
	 * @return
	 */
	BackResult<Integer> checkFiAccount(String apiName,String password,String ip,int checkCount);
	
	/**
	 * 人脸一比一比对
	 * @param apiName
	 * @param password
	 * @param ip
	 * @param checkCount
	 * @return
	 */
	BackResult<Integer> checkFfAccount(String apiName,String password,String ip,int checkCount);
	
	/**
	 * 活体检测
	 * @param apiName
	 * @param password
	 * @param ip
	 * @param checkCount
	 * @return
	 */
	BackResult<Integer> checkClAccount(String apiName,String password,String ip,int checkCount);
	
	/**
	 * 身份证OCR
	 * @param apiName
	 * @param password
	 * @param ip
	 * @param checkCount
	 * @return
	 */
	BackResult<Integer> checkIdocrAccount(String apiName,String password,String ip,int checkCount);
	
	/**
	 * 营业执照OCR
	 * @param apiName
	 * @param password
	 * @param ip
	 * @param checkCount
	 * @return
	 */
	BackResult<Integer> checkBlocrAccount(String apiName,String password,String ip,int checkCount);
	
	/**
	 * 银行卡OCR
	 * @param apiName
	 * @param password
	 * @param ip
	 * @param checkCount
	 * @return
	 */
	BackResult<Integer> checkBocrAccount(String apiName,String password,String ip,int checkCount);
	
	/**
	 * 驾驶证OCR
	 * @param apiName
	 * @param password
	 * @param ip
	 * @param checkCount
	 * @return
	 */
	BackResult<Integer> checkDocrAccount(String apiName,String password,String ip,int checkCount);
}
