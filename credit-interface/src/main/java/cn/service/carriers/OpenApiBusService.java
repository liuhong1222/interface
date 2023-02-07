package main.java.cn.service.carriers;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

import main.java.cn.common.BackResult;
import main.java.cn.domain.carriers.ApiResultDomain;

public interface OpenApiBusService {
	/**
	 * 根据参数json串进行运营商api调用
	 * @param paramJsonString
	 * @return 返回运营商api调用结果
	 */
	BackResult<List<ApiResultDomain>> OpenApi(JSONObject paramJsonString);
}
