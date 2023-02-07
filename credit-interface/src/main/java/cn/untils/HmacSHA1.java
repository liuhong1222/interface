package main.java.cn.untils;
import javax.crypto.Mac;  
import javax.crypto.SecretKey;  
import javax.crypto.spec.SecretKeySpec;  
  
public class HmacSHA1 {  
  
    private static final String MAC_NAME = "HmacSHA1";    
    private static final String ENCODING = "UTF-8";    
      
    public static byte[] HmacSHA1Encrypt(String encryptText, String encryptKey) throws Exception     
    {           
        byte[] data=encryptKey.getBytes(ENCODING);  
        SecretKey secretKey = new SecretKeySpec(data, MAC_NAME);   
        Mac mac = Mac.getInstance(MAC_NAME);   
        mac.init(secretKey);    
          
        byte[] text = encryptText.getBytes(ENCODING);    
        return mac.doFinal(text);    
    }    
    
    public static void main(String[] args) throws Exception {
    	System.out.println(HmacSHA1Encrypt("800100"+"cucc_verifyRealNameUser"+"1A3016567DEF682F58E0ACF130395F980B932DD9B3E50AEEB7058DB75A5D7C9ED8B4170CE426C373"+""+"20171012144225123"+"1.0","1fnm892qk3xvpf7axke9zb9mf2ehgv5f"));;
	}
}  