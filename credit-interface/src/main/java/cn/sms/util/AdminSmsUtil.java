package main.java.cn.sms.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.alibaba.fastjson.JSON;

import main.java.cn.sms.request.SmsSendRequest;
import main.java.cn.sms.response.SmsSendResponse;


public class AdminSmsUtil {
	
    private static class SmsUtilHolder {

        private static final AdminSmsUtil INSTANCE = new AdminSmsUtil();

    }
    
    public static AdminSmsUtil getInstance() {
        return SmsUtilHolder.INSTANCE;
    }
    
    public final static String smsSingleRequestServerUrl = "http://smssh1.253.com/msg/send/json";
    
    public final static String ACCOUNT = "N9229578";
    
    public final static String PSWD = "74kGi3wge";
    
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
     *发送短信
     */
    public Boolean sendAdminSmsByMobile(String mobile,String code) {

        String smsSingleRequestServerUrl = "http://smssh1.253.com/msg/send/json";
        // 短信内容
        String msg = "你的验证码:"+code;
        
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
     *发送短信
     */
    public Boolean sendAdminSmsByCustomer(String mobile,boolean fag) {

        String smsSingleRequestServerUrl = "http://smssh1.253.com/msg/send/json";
        // 短信内容
        String msg ="";
        
        if(fag){
        	msg="审核通过，账号为手机号码，初始密码:a123456";
        }else{
        	msg="审核被驳回，请重新申请";
        }
        
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
	 * 5位数简单验证码生成
	 * @return
	 */
	public static String generateCode(int length) {
		StringBuffer sbf = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int randNum = (int) (Math.random() * 10);
			sbf.append(randNum);
		}
		return sbf.toString();
	}
	


	public static void main(String[] args) {
		Boolean fag = AdminSmsUtil.getInstance().sendAdminSmsByMobile("15821368395",AdminSmsUtil.generateCode(5));
		System.out.println(fag);
	}


}
