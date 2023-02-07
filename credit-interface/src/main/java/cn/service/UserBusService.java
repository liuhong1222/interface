package main.java.cn.service;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

import main.java.cn.common.BackResult;
import main.java.cn.domain.BusinessInfoDomain;
import main.java.cn.domain.CreUserAccountDomain;
import main.java.cn.domain.CreUserDomain;
import main.java.cn.domain.CreUserWarningDomain;
import main.java.cn.domain.IdCardInfoDomain;

public interface UserBusService {

	/**
	 * 根据手机号码获用户对象
	 * @param mobile
	 * @return
	 */
	BackResult<CreUserDomain> findbyMobile(String mobile,String ip);
	
	/**
	 * 根据用户id获取用户对象
	 * @param id
	 * @return
	 */
	BackResult<CreUserDomain> findById(Integer id);
	
	/**
	 * 新增用户对象
	 * @param param
	 * @return
	 */
	BackResult<CreUserDomain> findOrsaveUser(Map<String,Object> param);
	
	/**
	 * 新用户注册
	 * @param param
	 * @return
	 */
	BackResult<CreUserDomain> userRegister(Map<String,Object> param);
	
	/**
	 * 根据openid获取用户信息
	 * @param openId
	 * @return
	 */
	BackResult<CreUserDomain> findUserByOpenId(String openId);
	
	/**
	 * admin 新增用户对象
	 * @param creUserDomain
	 * @return
	 */
	BackResult<CreUserDomain> findOrsaveTdsUser(CreUserDomain creUserDomain);
	
	/**
	 * 激活账户
	 * @param creUserDomain
	 * @return
	 */
	BackResult<CreUserDomain> activateUser(CreUserDomain creUserDomain);
	
	/**
	 * 修改用户信息
	 * @param creUserDomain
	 * @return
	 */
	BackResult<CreUserDomain> updateCreUser(CreUserDomain creUserDomain);
	
	/**
	 * 修改账户邮箱
	 * @param userPhone
	 * @param email
	 * @return
	 */
	BackResult<CreUserDomain> updateCreUser(String userPhone,String email);
	
	/**
	 * 激活账户
	 * @param creUserDomain
	 * @return
	 */
	BackResult<CreUserDomain> activateUserZzt(CreUserDomain creUserDomain);
	
	/**
	 * 激活账户
	 * @param apiName
	 * @param password
	 * @return
	 */
	BackResult<CreUserAccountDomain> getUserBalance(String apiName,String password);
	
	/**
	 * 获取用户预警值
	 * @param userId
	 * @param productName
	 * @return
	 */
	BackResult<CreUserWarningDomain> getUserWarning(String userId,String productName);
	
	/**
	 * 修改用户预警值
	 * @param warningCount
	 * @param informMobiles
	 * @param userId
	 * @param productName
	 * @return
	 */
	BackResult<String> updateUserWarning(String warningCount,String informMobiles,String userId,String productName);
	
	/**
	 * 获取用户api接口消耗量
	 * @param userId
	 * @param productName
	 * @param month
	 * @return
	 */
	BackResult<List<Map<String,Object>>> getCreUserApiConsumeCounts(String userId,String productName,String month);
	
	/**
	 * 个人用户提交认证
	 * @param idCardInfoDomain
	 * @return
	 */
	BackResult<String> subUserAuthByIdCard(IdCardInfoDomain idCardInfoDomain);
	
	/**
	 * 企业用户提交认证
	 * @param businessInfoDomain
	 * @return
	 */
	BackResult<String> subUserAuthByBusiness(BusinessInfoDomain businessInfoDomain);
	
	/**
	 * 修改用户手机号码
	 * @param userId
	 * @param phone
	 * @return
	 */
	int updateUserPhone(String userId,String phone);
	
	/**
	 * 用户提交认证
	 * @param userId
	 * @param userType
	 * @return
	 */
	BackResult<Map<String,Object>> getUserAuthInfo(String userId,String userType);
	
	/**
	 * 获取所有用户信息
	 * @param userId
	 * @param userType
	 * @return
	 */
	BackResult<List<CreUserDomain>> getAllUserData(String mobile);
}
