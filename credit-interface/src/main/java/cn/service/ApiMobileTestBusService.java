package main.java.cn.service;

import java.util.List;


import main.java.cn.common.BackResult;
import main.java.cn.domain.ApiLogPageDomain;
import main.java.cn.domain.BankPageDomain;
import main.java.cn.domain.CarriersPageDomain;
import main.java.cn.domain.LivenessPageDomain;
import main.java.cn.domain.MobileInfoDomain;
import main.java.cn.domain.MobileTestLogDomain;
import main.java.cn.domain.OcrPageDomain;
import main.java.cn.domain.SelfIdenVPageDomain;
import main.java.cn.domain.carriers.MobileStateDomain;
import main.java.cn.domain.page.PageDomain;

/**
 * api 账号2次清洗接口
 *
 */
public interface ApiMobileTestBusService {

	/**
	 * 根据手机号码串查询
	 * @param mobileNumbers
	 * @return
	 */
//	BackResult<List<MobileInfoDomain>> findByMobileNumbers(String mobileNumbers,String userId);
	
	/**
	 * 对外api账户2次清洗接口
	 * @param apiName
	 * @param password
	 * @param ip
	 * @param mobileNumbers
	 * @return
	 */
//	BackResult<List<MobileInfoDomain>> findByMobileNumbers(String apiName,String password,String ip,String mobileNumbers);
	
	/**
	 * 分页获取检测结果列表
	 * @return
	 */
	BackResult<PageDomain<MobileTestLogDomain>> getPageByUserId(int pageNo,int pageSize,String userId,String type);
	
	/**
	 * 分页获取飓金荣通接口检测结果列表
	 * @return
	 */
	BackResult<PageDomain<ApiLogPageDomain>> getPageByCustomerId(int pageNo, int pageSize, String customerId, String method);
	
	BackResult<PageDomain<BankPageDomain>> getBankPageByCustomerId(int pageNo, int pageSize, String customerId, String method);
	
	BackResult<PageDomain<CarriersPageDomain>> getCarriersPageByCustomerId(int pageNo, int pageSize, String customerId, String method);
	
	BackResult<PageDomain<OcrPageDomain>> getOcrPageByCustomerId(int pageNo, int pageSize, String customerId, String method);

	BackResult<PageDomain<LivenessPageDomain>> getLivenessPageByCustomerId(int pageNo, int pageSize, String customerId, String method);
	
	BackResult<PageDomain<SelfIdenVPageDomain>> getSelfPageByCustomerId(int pageNo, int pageSize, String customerId, String method);
	
	BackResult<PageDomain<MobileTestLogDomain>> getMobileStatePageByCustomerId(int pageNo, int pageSize, String customerId, String method);
	
//	BackResult<MobileInfoDomain> findByMobile(String mobile,String userId);
//		
//	BackResult<List<MobileInfoDomain>> findByMobiles(String mobiles,String userId);
//
//	BackResult<List<MobileInfoDomain>> findByMobilesNew(String mobiles,String userId);
//	
//	BackResult<List<MobileInfoDomain>> findByMobilesBig(String mobiles,String userId);
	
	BackResult<Integer> idCardAuthBalance(String userId,String orderNo);
	
	BackResult<Integer> bankAuthBalance(String userId,String orderNo); 
	
	BackResult<Integer> mobileThreeAuthBalance(String userId,String orderNo);
	
	BackResult<Integer> mobileStatusQueryBalance(String userId,String orderNo);
	
	BackResult<Integer> faceIdentyCompareBalance(String userId,String orderNo);
	
	BackResult<Integer> businessLicenseOcrBalance(String userId,String orderNo);
	
	BackResult<Integer> idCardOcrBalance(String userId,String orderNo);
	
	BackResult<Integer> bankOcrBalance(String userId,String orderNo);
	
	BackResult<Integer> driverOcrBalance(String userId,String orderNo);
	
	BackResult<Integer> faceToFaceCompareBalance(String userId,String orderNo);
	
	BackResult<Integer> checkLivenessBalance(String userId,String orderNo);
}
