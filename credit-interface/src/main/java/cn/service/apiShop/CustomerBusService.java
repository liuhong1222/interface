package main.java.cn.service.apiShop;

import com.alibaba.fastjson.JSONObject;

public interface CustomerBusService {
	/**
	 * 根据参数json串进行运营商api调用
	 * @param paramJsonString
	 * @return 返回运营商api调用结果
	 */
	String saveCustomer(JSONObject paramJsonString);
}
