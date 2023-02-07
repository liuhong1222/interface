package main.java.cn.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import main.java.cn.common.BackResult;
import main.java.cn.domain.PackageDomain;
import main.java.cn.domain.TrdOrderDomain;

/**
 * 订单接口
 *
 */
public interface TrdOrderBusService {

	/**
	 * 充值申请
	 * @param TrdOrderDomain
	 * @return
	 */
	BackResult<String> recharge(Integer creUserId,Integer productsId,Integer number,BigDecimal money,String payType,String type,String userType);
	
	/**
	 * 根据订单号查询订单详情
	 * @param orderNo
	 * @return
	 */
	BackResult<TrdOrderDomain> findOrderInfoByOrderNo(String orderNo);
	
	/**
	 * 获取充值套餐
	 * @param orderNo
	 * @return
	 */
	BackResult<List<PackageDomain>> getPayPackage(Integer creUserId,String productId);
	
	/**
	 * 获取时间段内每天的充值总计
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	BackResult<List<Map<String,Object>>> getSummyOrderList(String startDate,String endDate);
}
