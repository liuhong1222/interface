package main.java.cn.until;

import java.io.UnsupportedEncodingException;
import java.util.Random;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

import com.alibaba.fastjson.JSONObject;

import main.java.cn.encryth.HmacSHA1;
import main.java.cn.encryth.Xxtea;
import main.java.cn.enums.KeyInfoEnum;
import main.java.cn.hhtp.util.DateUtils;

/**
 * 加密算法
 * 
 * @author ytj
 *
 */
public class KeyUtil {
	
	private static String charset = "utf-8";
	
	public static void main(String[] args) throws Exception {
		JSONObject s  = new JSONObject();
		s.put("mdn", "18611764785");//mdn=13320000000&idType=0&idNum=360428199205295115&userName=刘鸿
		String temp = getXXTeaEncryptString("mdn=18611764785&date=20170801");
//		System.out.println(encrypt(s.toString()));
//		System.out.println(StringUtil.stringToHash("刘鸿"));
		System.out.println(temp);
//		JSONObject ss = JSONObject.parseObject(getXXTeaDecryptString("3F96090843E92578FE77ECAB868DD5640C401F8A2A8685F3A1A87B3F440141589877AC4C311DDE35E1D79B31"));
//		System.out.println(getXXTeaDecryptString("76DE19A2D8024087B623561F3293A52388A67AF7"));
		System.out.println(getHmacSHA1String("ca643d80466f4d50963c8b93f7504429","unic_offnetIdentify",temp,"2017-10-12 14:42:25:123","1.0"));
	}
	
	/**
	 * 接口调用参数
	 * 
	 * @return
	 * @throws Exception 
	 */
	public static JSONObject getParamJson(String appkey,String method ,String paramString){
		JSONObject paramJson = new JSONObject();		
		try {
			String timestemp = DateUtils.getNowTimeMS();
			paramJson.put("appId", appkey);
			paramJson.put("method", method);
			paramJson.put("timeStamp",timestemp);
			paramJson.put("version","1.0");
			paramJson.put("params", KeyUtil.getXXTeaEncryptString(paramString));
			paramJson.put("sign", KeyUtil.getHmacSHA1String(appkey, method, KeyUtil.getXXTeaEncryptString(paramString), timestemp, "1.0"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return paramJson;
	}
	
	/**
	 * HmacSHA1加密
	 * 
	 * @return
	 * @throws Exception 
	 */
	public static String getHmacSHA1String(String appId,String method, String params,String timeStamp,String version) throws Exception {
		String data = appId + method + params + timeStamp + version;
		return getByteStr(HmacSHA1.HmacSHA1Encrypt(data,KeyInfoEnum.SIGN_KEY.getValue()));
	}
	
	/**
	 * 参数加密_内部调用
	 * 
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	public static String getXXTeaEncryptString(String data) throws UnsupportedEncodingException {
		if (data == null) {
            return null;
        }
        byte[] bytes = Xxtea.encrypt(data.getBytes(), KeyInfoEnum.PARAMS_KEY.getValue().getBytes());
        return bytesToHexString(bytes);
	}

	
	/**
	 * 参数解密_内部调用
	 * 
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	public static String getXXTeaDecryptString(String data) throws UnsupportedEncodingException {
		if (data == null) {
            return null;
        }
        byte[] bytes = Xxtea.decrypt(hexToBytes(data), KeyInfoEnum.PARAMS_KEY.getValue().getBytes());
        return new String(bytes,charset);
	}
	
	 /**
     * 字节数组转换为hex字符串
     * 
     * @param bArray
     * @return
     */
    private static final String bytesToHexString(byte[] bArray) {
        StringBuffer sb = new StringBuffer(bArray.length);

        for (int i = 0; i < bArray.length; ++i) {
            String sTemp = Integer.toHexString(0xFF & bArray[i]);
            if (sTemp.length() < 2)
                sb.append(0);
            sb.append(sTemp.toUpperCase());
        }
        return sb.toString();
    }

    /**
     * hex字符串转换为字节数组
     * 
     * @param str
     * @return
     */
    private static byte[] hexToBytes(String str) {
        if (str == null) {
            return null;
        }

        char[] hex = str.toCharArray();

        int length = hex.length / 2;
        byte[] raw = new byte[length];
        for (int i = 0; i < length; ++i) {
            int high = Character.digit(hex[(i * 2)], 16);
            int low = Character.digit(hex[(i * 2 + 1)], 16);
            int value = high << 4 | low;
            if (value > 127)
                value -= 256;
            raw[i] = (byte) value;
        }
        return raw;
    }
    
    /**
     * 参数加密_调用运营商接口
     * 
     * @param str
     * @return
     */
    public static String encrypt(String str){
		try{
			return getByteStr(encrypt(str.getBytes(), KeyInfoEnum.PARAMS_KEY.getValue()));
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private static byte[] encrypt(byte[] bytP, String key)
				throws Exception {
			byte[] res = null;
			if (key.length() == 48) {
				byte[] bytK1 = getKeyByStr(key.substring(0, 16));
				byte[] bytK2 = getKeyByStr(key.substring(16, 32));
				byte[] bytK3 = getKeyByStr(key.substring(32, 48));
				res = encrypt(encrypt(encrypt(bytP, bytK1), bytK2), bytK3);
			} 
			return res;
		}
	
	private static byte[] getKeyByStr(String str) {
			byte[] bRet = new byte[str.length() / 2];
			for (int i = 0; i < str.length() / 2; i++) {
				Integer itg = new Integer(16 * getChrInt(str.charAt(2 * i))
						+ getChrInt(str.charAt(2 * i + 1)));
				bRet[i] = itg.byteValue();
			}
			return bRet;
		}
	
	private static int getChrInt(char chr) {
			int iRet = 0;
			if (chr == "0".charAt(0))
				iRet = 0;
			if (chr == "1".charAt(0))
				iRet = 1;
			if (chr == "2".charAt(0))
				iRet = 2;
			if (chr == "3".charAt(0))
				iRet = 3;
			if (chr == "4".charAt(0))
				iRet = 4;
			if (chr == "5".charAt(0))
				iRet = 5;
			if (chr == "6".charAt(0))
				iRet = 6;
			if (chr == "7".charAt(0))
				iRet = 7;
			if (chr == "8".charAt(0))
				iRet = 8;
			if (chr == "9".charAt(0))
				iRet = 9;
			if (chr == "A".charAt(0))
				iRet = 10;
			if (chr == "B".charAt(0))
				iRet = 11;
			if (chr == "C".charAt(0))
				iRet = 12;
			if (chr == "D".charAt(0))
				iRet = 13;
			if (chr == "E".charAt(0))
				iRet = 14;
			if (chr == "F".charAt(0))
				iRet = 15;
			return iRet;
		}
	
	private static String getHexValue(int s) {
			String sRet = null;
			switch (s) {
			case 0:
				sRet = "0";
				break;
			case 1:
				sRet = "1";
				break;
			case 2:
				sRet = "2";
				break;
			case 3:
				sRet = "3";
				break;
			case 4:
				sRet = "4";
				break;
			case 5:
				sRet = "5";
				break;
			case 6:
				sRet = "6";
				break;
			case 7:
				sRet = "7";
				break;
			case 8:
				sRet = "8";
				break;
			case 9:
				sRet = "9";
				break;
			case 10:
				sRet = "A";
				break;
			case 11:
				sRet = "B";
				break;
			case 12:
				sRet = "C";
				break;
			case 13:
				sRet = "D";
				break;
			case 14:
				sRet = "E";
				break;
			case 15:
				sRet = "F";
			}
			return sRet;
		}
	
	private static String getByteStr(byte[] byt) {
		String strRet = "";
		for (int i = 0; i < byt.length; i++) {
			strRet += getHexValue((byt[i] & 240) / 16);
			strRet += getHexValue(byt[i] & 15);
		}
		return strRet;
	} 
	private static byte[] encrypt(byte[] bytP, byte[] key) throws Exception {
			Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
			DESKeySpec desKeySpec = new DESKeySpec(key);
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
			SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
			IvParameterSpec iv = new IvParameterSpec(key);
			cipher.init(Cipher.ENCRYPT_MODE, secretKey, iv);
			return cipher.doFinal(bytP);
		}

}
