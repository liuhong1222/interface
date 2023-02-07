package main.java.cn.sms.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import main.java.cn.domain.AgentWebSiteDomain;
import main.java.cn.sms.request.SmsSendRequest;
import main.java.cn.sms.response.SmsSendResponse;
import main.java.cn.until.MD5Util;
import main.java.cn.untils.DateUtils;

public class SmallSmsUtil {
	
	private static SmallSmsUtil smallSmsUtil;
	
	public static SmallSmsUtil getInstance() {  
        if (smallSmsUtil == null) {    
            synchronized (SmallSmsUtil.class) {    
               if (smallSmsUtil == null) {    
            	   smallSmsUtil = new SmallSmsUtil();   
               }    
            }    
        }    
        return smallSmsUtil;   
    }  
	
	// 用户平台API账号(非登录账号,示例:N1234567)
	public static String APPKEY = "172MPu";
		// 用户平台API密码(非登录密码)
	public static String APPSECRET = "124G25";
	private static String APPCODE = "1000";
	
	public static String ACCOUNT = "N9229578";
	public static String PSWD = "74kGi3wgeGi3";
	

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
	 * 注册验证码发送短信
	 * @param mobile
	 * @param code
	 * @return
	 */
//	public Boolean sendSmsByMobile(String mobile,String code,AgentWebSiteDomain agentWebSiteDomain) {
//		
//		String smsSingleRequestServerUrl = "http://39.97.4.102:9090/sms/batch/v1";
//		// 短信内容
//		String msg = "【" + agentWebSiteDomain.getSmsSign() + "】您的验证码是：" + code;
//		// 手机号码
//		String phone = mobile;
//		// 状态报告
//		String report = "true";
//
//		String requestJson = getParamJsonObject(phone, msg).toJSONString();
//
//		String response = sendSmsByPost(smsSingleRequestServerUrl, requestJson);
//
//		JSONObject smsSingleResponse = JSONObject.parseObject(response);
//		System.out.println(requestJson);
//		System.out.println(response);
//		return smsSingleResponse.getString("code").equals("00000") ? true : false;
//	}
	
	public Boolean sendSmsByMobile(String mobile,String code,AgentWebSiteDomain agentWebSiteDomain) {
		
		String smsSingleRequestServerUrl = "http://smssh1.253.com/msg/send/json";
		// 短信内容
		String msg = "【" + agentWebSiteDomain.getSmsSign() + "】您的验证码是：" + code;
		// 手机号码
		String phone = mobile;
		// 状态报告
		String report = "true";

		SmsSendRequest smsSingleRequest = new SmsSendRequest(ACCOUNT, PSWD, msg, phone, report);
//		smsSingleRequest.setExtend("DL");

		String requestJson = JSON.toJSONString(smsSingleRequest);

		String response = sendSmsByPost(smsSingleRequestServerUrl, requestJson);

		SmsSendResponse smsSingleResponse = JSON.parseObject(response, SmsSendResponse.class);
		
		return smsSingleResponse.getCode().equals("0") ? true : false;
	}
	
	/**
	 * 充值成功发送短信
	 * @param mobile
	 * @param number
	 * @return
	 */
	public Boolean sendSmsByMobileForRecharge(String mobile,Integer number,AgentWebSiteDomain agentInfo) {
		
		// 请求地址请登录253云通讯自助通平台查看或者询问您的商务负责人获取
		String smsSingleRequestServerUrl = "http://smssh1.253.com/msg/send/json";
		// 短信内容
		String msg = "【" + agentInfo.getSmsSign() + "】尊敬的客户您好：您本次成功冲值" + number + "条己到账，请登陆" + agentInfo.getDomain() + "查看";
		// 手机号码
		String phone = mobile;
		// 状态报告
		String report = "true";

		SmsSendRequest smsSingleRequest = new SmsSendRequest(ACCOUNT, PSWD, msg, phone, report);

		String requestJson = JSON.toJSONString(smsSingleRequest);

		String response = sendSmsByPost(smsSingleRequestServerUrl, requestJson);

		SmsSendResponse smsSingleResponse = JSON.parseObject(response, SmsSendResponse.class);
		
		return smsSingleResponse.getCode().equals("0") ? true : false;
	}
	
	/**
	 * 检测成功发送短信
	 */
	public Boolean sendSmsByMobileForTest(String mobile,AgentWebSiteDomain agentInfo) {
		
		// 请求地址请登录253云通讯自助通平台查看或者询问您的商务负责人获取
		String smsSingleRequestServerUrl = "http://39.97.4.102:9090/sms/batch/v1";
		// 短信内容
		String msg = "【" + agentInfo.getSmsSign() + "】尊敬的客户您好：您的实号检测报告己完成，请登陆" + agentInfo.getDomain() + "查收";
		System.out.println("发送的短信内容为：" + msg);
		// 手机号码
		String phone = mobile;
		// 状态报告
		String report = "true";

		String requestJson = getParamJsonObject(phone, msg).toJSONString();

		String response = sendSmsByPost(smsSingleRequestServerUrl, requestJson);

		JSONObject smsSingleResponse = JSONObject.parseObject(response);
		
		return smsSingleResponse.getString("code").equals("00000") ? true : false;
	}
	
	/**
	 * 检测异常发送短信
	 */
	public Boolean sendSmsByMobileForTestEx(String mobile,AgentWebSiteDomain agentInfo) {
		
		// 请求地址请登录253云通讯自助通平台查看或者询问您的商务负责人获取
		String smsSingleRequestServerUrl = "http://39.97.4.102:9090/sms/batch/v1";
		// 短信内容
		String msg = "【" + agentInfo.getSmsSign() + "】尊敬的用户您好，非常抱歉的通知您，由于系统原因，您本次实号检测业务未能正常进行，请登陆" + agentInfo.getDomain() + "重新检测，本次检测不扣费，如有疑问请咨询页面客服";
		// 手机号码
		String phone = mobile;
		// 状态报告
		String report = "true";

		String requestJson = getParamJsonObject(phone, msg).toJSONString();

		String response = sendSmsByPost(smsSingleRequestServerUrl, requestJson);

		JSONObject smsSingleResponse = JSONObject.parseObject(response);
		
		return smsSingleResponse.getString("code").equals("00000") ? true : false;
	}
	
	
	private JSONObject getParamJsonObject(String phone,String msg) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("appkey", APPKEY);
		jsonObject.put("appcode", APPCODE);
		jsonObject.put("uid", UUID.randomUUID().toString().replace("-", ""));
		jsonObject.put("phone", phone);
		jsonObject.put("msg", msg);
		jsonObject.put("timestamp", System.currentTimeMillis()+"");
		jsonObject.put("extend", "008");
		jsonObject.put("sign", md5(APPKEY+APPSECRET+jsonObject.getString("timestamp")).toLowerCase());
		return jsonObject;
	}
	
	private static String md5(String param) {
		MessageDigest md5;
		try {
			md5 = MessageDigest.getInstance("MD5");
			byte[] md5Byte = md5.digest(param.getBytes("utf8"));
			String result = byteToHex(md5Byte);
			return result;
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	

	private static String byteToHex(byte[] md5Byte) {
		String result = "";
		StringBuilder sb = new StringBuilder();
		for(byte each : md5Byte){
			int value = each&0xff;
			String hex = Integer.toHexString(value);
			if(value<16){
				sb.append("0");
			}
			sb.append(hex);
		}
		result = sb.toString();
		return result;
	}
	
	
	 public static int byte4ToInteger(byte[] b, int offset) {
	        return (0xff & b[offset]) << 24 | (0xff & b[offset+1]) << 16 |
	        	(0xff & b[offset+2]) << 8 | (0xff & b[offset+3]);
	    }
	
	
	public static void main(String[] args) {
		AgentWebSiteDomain agentWebSiteDomain = new AgentWebSiteDomain();
		agentWebSiteDomain.setSmsSign("臻晟数据");
		SmallSmsUtil.getInstance().sendSmsByMobile("17706173857", "123456", agentWebSiteDomain);
	}

}
