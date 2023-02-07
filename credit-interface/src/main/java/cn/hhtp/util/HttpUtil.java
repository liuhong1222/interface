package main.java.cn.hhtp.util;


import com.alibaba.fastjson.JSONObject;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.protocol.Protocol;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 请求工具类
 *
 */
public class HttpUtil {

	private final static Logger logger = LoggerFactory.getLogger(HttpUtil.class);
	
	public static String createHttpPost(String url, JSONObject jsonObject) {

		return main.java.cn.hhtp.util.HttpUtils.postJsonObjectWithFormData(url,jsonObject);
//		Protocol myhttps = new Protocol("https", new main.java.cn.hhtp.util.HttpClientSSLSocketFactory(), 443);
//        Protocol.registerProtocol("https", myhttps);
//
//		PostMethod post = new PostMethod(url);
//		try {
//			Set<String>  iterator = jsonObject.keySet();
//			Iterator<String> it = iterator.iterator();
//			// 设置参数
//			while(it.hasNext()){
//				String key = (String) it.next();
//				String value = jsonObject.getString(key);
//				post.addParameter(new NameValuePair(key,value));
//			}
//
//			HttpClient client = new HttpClient();
//			client.getParams().setContentCharset("UTF-8");
//			client.getHttpConnectionManager().getParams().setConnectionTimeout(60000);
//			client.getHttpConnectionManager().getParams().setSoTimeout(60000);
//
//			int result = client.executeMethod(post);
//			logger.debug("createHttpPost, url:" + url);
//			logger.info("Response status code: " + result);
//			byte[] responseBody = post.getResponseBody();
//			// 得到返回数据
//			String resultStr = new String(responseBody, "UTF-8");
//			logger.info("createHttpPost, result:"+resultStr);
//			return resultStr;
//		} catch (Exception e) {
//			e.printStackTrace();
//			logger.error("createHttpPost, 后台数据流请求异常, url:" + url);
//			logger.error("createHttpPost, 后台数据流请求异常, exception:", e.getCause());
//		} finally {
//			post.releaseConnection();
//		}
//
//		return "";
	}
}
