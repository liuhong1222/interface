package main.java.cn.until;

/**
 * redis apiKey
 * 
 * @author lh
 *
 */
public class RedisKeyUtil {
		
	public static String CLDC = "CLDC";//系统名称,创蓝数据中心
	
	public static String UPDATEFREQ = "DATA-UPDATE-FREQ";//接口数据更新频率
	
	public static String APISHOP = "API_SHOP_LOGIN_";
	
	public static String APIBALANCEDEMON = "API_BALANCE_APIID_DATA";
	
	public static String USERSESSION = "USER_SESSION_KEY_";
	
	public static String USERSINFO = "USER_INFO_KEY_";
	
	public static String IDENTIFYCODE = "API_SHOP_IDENTIFYCODE_KEY_";
	
	public static String JJ_API_APPID_KEY = "cldc:JJ_API_APPID_KEY:";
	
	public static String CHECK_API_ORDER_KEY = "cldc:CHECK_API_ORDER_KEY:";
			
	public static String getApiKey(String apiname){
		return CLDC + "." + UPDATEFREQ + "." + apiname;
	}
	
	public static String getMobileStatusKey(String apiname){
		return "cldc:CHECK_MOBILE_STATUS_KEY:" + apiname;
	}
	
	public static String getMobileThreeKey(String apiname){
		return "cldc:CHECK_MOBILE_THREE_KEY:" + apiname;
	}
	
	public static String getBankKey(String apiname){
		return "cldc:CHECK_BANK_KEY:" + apiname;
	}
	
	public static String getIdCardKey(String apiname){
		return "cldc:CHECK_IDCARD_KEY:" + apiname;
	}
	
	public static String getContrasctDataKey(String userId){
		return "cldc:CONTRACT_DATA_KEY:" + userId;
	}
	
	public static String getApiShopKey(){
		return APISHOP;
	}
	
	public static String getApiIdToBalance(){
		return APIBALANCEDEMON;
	}
	
	public static String getUserSessionKey(){
		return USERSESSION;
	}
	
	public static String getIdentifyCodeKey(){
		return IDENTIFYCODE;
	}
	
	public static String getUserInfoKey(){
		return USERSINFO;
	}
	
	public static String getApiAccountKey(Integer creUserId){
		return "ds:apiAccount:" + creUserId;
	}
	
	public static String getApiSettlementKey(Integer creUserId){
		return "ds:apiSettlement:" + creUserId;
	}
	
	public static String getApiSettlementPatternKey(){
		return "ds:apiSettlement:";
	}
}
