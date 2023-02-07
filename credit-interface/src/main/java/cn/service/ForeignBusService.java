package main.java.cn.service;

import java.util.List;

import main.java.cn.common.BackResult;
import main.java.cn.domain.CvsFilePathDomain;
import main.java.cn.domain.RunTestDomian;
import main.java.cn.domain.page.PageDomain;

public interface ForeignBusService {
	/**
	 * 根据上传的文件地址和用户ID进行空号检索
	 * @param fileUrl
	 * @param userId
	 * @return 返回文件下载地址对象
	 */
	BackResult<RunTestDomian> runTheTest(String fileUrl,String userId,String timestamp,String mobile);
	
	/**
	 * 升级版本 根据上传的文件地址和用户ID进行空号检索
	 * @param fileUrl
	 * @param userId
	 * @param mobile
	 * @param source
	 * @param startLine
	 * @param type
	 * @return
	 */
	BackResult<RunTestDomian> theTest(String fileUrl,String userId,String mobile,String source,String startLine,String type);
	
	/**
	 * 根据用户编号 查询 用户下载列表
	 * @param userId
	 * @return
	 */
	BackResult<List<CvsFilePathDomain>> findByUserId(String userId);
	
	/**
	 * 根据IDS删除下载记录
	 * @param ids
	 * @return
	 */
	BackResult<Boolean> deleteCvsByIds(String ids,String userId);
	
	/**
	 * 根据IDS批量下载检测结果文件
	 * @param ids
	 * @return
	 */
	BackResult<String> getTxtZipByIds(String ids,String userId);
	
	/**
	 * 分页获取检测结果下载列表
	 * @return
	 */
	BackResult<PageDomain<CvsFilePathDomain>> getPageByUserId(int pageNo,int pageSize,String userId);
	
	/**
	 * 分页获取检测结果下载列表带日期
	 * @return
	 */
	BackResult<PageDomain<CvsFilePathDomain>> getCVSPageByUserIdNew(int pageNo,int pageSize,String userId,String startDate,String endDate);
}
