package main.java.cn.sms.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import com.alibaba.fastjson.JSON;
import main.java.cn.domain.AgentWebSiteDomain;
import main.java.cn.sms.request.SmsSendRequest;
import main.java.cn.sms.response.SmsSendResponse;



/**
 * 营销短信
 * @Description:HTTP 请求
 */
public class MarketingSmsUtil {
	
	private static MarketingSmsUtil chuangLanSmsUtil;
	
	public static MarketingSmsUtil getInstance() {  
        if (chuangLanSmsUtil == null) {    
            synchronized (MarketingSmsUtil.class) {    
               if (chuangLanSmsUtil == null) {    
            	   chuangLanSmsUtil = new MarketingSmsUtil();   
               }    
            }    
        }    
        return chuangLanSmsUtil;   
    }  
	
	// 用户平台API账号(非登录账号,示例:N1234567)
	public static String ACCOUNT = "M3716561";
		// 用户平台API密码(非登录密码)
	public static String PSWD = "7UV01BWdDjfc99";
	
	

	/**
	 * 
	 * @author tianyh @Description @param path @param postContent @return
	 * String @throws
	 */
	public String sendSmsByPost(String path, String postContent) {
		URL url = null;
		try {
			url = new URL(path);
			HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
			httpURLConnection.setRequestMethod("POST");// 提交模式
			httpURLConnection.setConnectTimeout(10000);// 连接超时 单位毫秒
			httpURLConnection.setReadTimeout(10000);// 读取超时 单位毫秒
			// 发送POST请求必须设置如下两行
			httpURLConnection.setDoOutput(true);
			httpURLConnection.setDoInput(true);
			httpURLConnection.setRequestProperty("Charset", "UTF-8");
			httpURLConnection.setRequestProperty("Content-Type", "application/json");

			httpURLConnection.connect();
			OutputStream os = httpURLConnection.getOutputStream();
			os.write(postContent.getBytes("UTF-8"));
			os.flush();

			StringBuilder sb = new StringBuilder();
			int httpRspCode = httpURLConnection.getResponseCode();
			if (httpRspCode == HttpURLConnection.HTTP_OK) {
				// 开始获取数据
				BufferedReader br = new BufferedReader(
						new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
				String line = null;
				while ((line = br.readLine()) != null) {
					sb.append(line);
				}
				br.close();
				return sb.toString();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 双十一活动营销短信
	 * @param mobile
	 * @param userName
	 * @param userphone
	 * @param AgentWebSiteDomain
	 * @return
	 */
	public Boolean sendSmsByMobile(String mobile,String userName,String userphone,AgentWebSiteDomain agentInfo) {
		
		// 请求地址请登录253云通讯自助通平台查看或者询问您的商务负责人获取
		String smsSingleRequestServerUrl = "http://smssh1.253.com/msg/send/json";
		// 短信内容
		String msg = "【" + agentInfo.getSmsSign() + "】尊敬的" + ((userName==null || "".equals(userName))?"客户":userName) +": 您好友：" + userphone + 
				"特邀您前来参与创蓝空号检测双十一活动，首次充值可额外赠送购买条数的10%，更多详情请登录" + agentInfo.getDomain() + "进行查看,退订回T";
		// 手机号码
		String phone = mobile;
		// 状态报告
		String report = "true";

		SmsSendRequest smsSingleRequest = new SmsSendRequest(ACCOUNT, PSWD, msg, phone, report);

		String requestJson = JSON.toJSONString(smsSingleRequest);

		String response = sendSmsByPost(smsSingleRequestServerUrl, requestJson);

		SmsSendResponse smsSingleResponse = JSON.parseObject(response, SmsSendResponse.class);
		System.out.println(smsSingleResponse.toString());
		return smsSingleResponse.getCode().equals("0") ? true : false;
	}	
}
