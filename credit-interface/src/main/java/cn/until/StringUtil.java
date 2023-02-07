package main.java.cn.until;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.alibaba.fastjson.JSONObject;

import main.java.cn.domain.carriers.ApiResultDomain;

/**
 * 字符串处理
 * 
 * @author lh
 *
 */
public class StringUtil {
	
//	public static void main(String[] args) {
//		System.out.println(isTelephone("1861a764785"));;
//	}
	
	/**
	 * 获取字符串的hash值
	 * 
	 * @return
	 * @throws Exception 
	 */
	public static int stringToHash(String key){  
	    int arraySize = 11113;          //数组大小一般取质数  
	    int hashCode = 0;  
	    for(int i=0;i<key.length();i++){        //从字符串的左边开始计算  
	        int letterValue = key.charAt(i) - 96;//将获取到的字符串转换成数字，比如a的码值是97，则97-96=1 就代表a的值，同理b=2；  
	        hashCode = ((hashCode << 5) + letterValue) % arraySize;//防止编码溢出，对每步结果都进行取模运算  
	    }  
	    return hashCode;  
	}  
	
	/**
	 * 获取解密后的参数
	 * 
	 * @return
	 */
	public static JSONObject getParamsJsonString(String params) {
		JSONObject resultJson = new JSONObject();
		String[] paramList = params.split("&");
		if(paramList != null && paramList.length >0){
			for(String param: paramList){
				String paramname = param.substring(0, param.indexOf("="));
				String paramvalue = param.substring(param.indexOf("=")+1,param.length());
				resultJson.put(paramname, paramvalue);
			}
		}
		return resultJson;
	}
	
	/**
	 * 校验字符串是否为正常的电话号码
	 * 
	 * @return
	 */
	public static boolean isTelephone(String str){ 
		   Pattern pattern = Pattern.compile("[0-9]*"); 
		   Matcher isNum = pattern.matcher(str);
		   if( !isNum.matches() || str.length() != 11){
		       return false; 
		   } 
		   return true; 
	}
	
	public static ApiResultDomain getApiResultDomain(String name,String value,String desc){
		ApiResultDomain temp = new ApiResultDomain();
		temp.setValue(value);
		temp.setName(name);
		temp.setDesc(desc);
		return temp;		
	}
}
