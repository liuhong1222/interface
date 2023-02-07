package main.java.cn.until;

import java.util.UUID;

/**
 * 
 * @author zhanggt
 * 
 */
public class GenerateUtil {

	/**
	 * 产生UUIDD
	 * 
	 * @return
	 */
	public static String generatePrimaryKey() {
		return UUID.randomUUID().toString().replace("-", "");
	}

}
