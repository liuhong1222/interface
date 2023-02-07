package main.java.cn.common;

public class StatusType {

	/**
	 * 角色状态 0:默认角色
	 */
	public static final String DEFAULT_ROLE = "0";
	
	/**
	 * 1：自定义角色
	 */
	public static final String CUSTOM_ROLES = "1";
	
	
    //注册来源
	public static final String ADD_REGISTER = "SYS";
	public static final String ADD_ADMIN = "Admin";
	


	//=============审核状态=================
	/**
	 * 审核类型 1进账审核 2出账审核 3退款审核 : approval_type
	 */
	public static final String APPROVAL_TYPE_GO="1";
    
    /**
	 * 审核类型 1进账审核 2出账审核 3退款审核 : approval_type
	 */
	public static final String APPROVAL_TYPE_OUT="2";
    
    /**
	 * 审核类型 1进账审核 2出账审核 3退款审核 : approval_type
	 */
	public static final String APPROVAL_TYPE_BACK="3";
	
	/**
	 * 0待审核 
	 */
	public static final String APPROVAL_STATUS_0="0";
	
	
	/**
	 *1已审核
	 */
	public static final String APPROVAL_STATUS_1="1";
	
	
	
	/**
	 * 2驳回 
	 */
	public static final String APPROVAL_STATUS_2="2";
	
	
	
	/**
	 * 3到账 
	 */
	public static final String APPROVAL_STATUS_3="3";
	
	
	/**
	 *4线下开票 
	 */
	public static final String APPROVAL_STATUS_4="4";
    
	
	/**
	 * 开票状态   off未开票  on已开票 : billing
	 */
	public static final String APPROVAL_BILLING_OFF="未开票";
	
	/**
	 * 开票状态   off未开票  on已开票 : billing
	 */
	public static final String APPROVAL_BILLING_ON="已开票";
    
	
	
	

	
	
}
