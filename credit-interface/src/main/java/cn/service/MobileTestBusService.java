package main.java.cn.service;

import java.util.List;

import main.java.cn.common.BackResult;
import main.java.cn.domain.SpacePhoneDomain;

public interface MobileTestBusService {

	/**
	 * 根据手机号码 手机号码详情
	 * @param ids
	 * @return
	 */
	BackResult<List<SpacePhoneDomain>> findSpacePhoneByMobile(String mobiles);
}
