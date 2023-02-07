package main.java.cn.enums;

import java.math.BigDecimal;

/**
 * 产品充值类型
 * 
 */
public enum ProductPayTypeEnum {

	PI0001(1,	500000,new BigDecimal(950),"CLSH_", "创蓝实号检测产品"),
	PI0002(2,	5000000,new BigDecimal(9000),"CLSH_", "创蓝实号检测产品"),
	PI0003(3,	10000000,new BigDecimal(16000),"CLSH_", "创蓝实号检测产品"),
	PI0004(4,	1,new BigDecimal(0.002),"CLSH_", "创蓝实号检测产品"),
	PI0005(5,	100000,new BigDecimal(1900),"CLRQ_", "创蓝账号二次清洗"),
	PI0006(6,	500000,new BigDecimal(9000),"CLRQ_", "创蓝账号二次清洗"),
	PI0007(7,	1000000,new BigDecimal(16000),"CLRQ_", "创蓝账号二次清洗"),
	PI0008(8,	1,new BigDecimal(0.02),"CLRQ_", "创蓝账号二次清洗"),
	PI0009(9,	4000000,new BigDecimal(19000),"CLKH_", "创蓝空号API产品"),
	PI0010(10,	10000000,new BigDecimal(45000),"CLKH_", "创蓝空号API产品"),
	PI0011(11,	20000000,new BigDecimal(80000),"CLKH_", "创蓝空号API产品"),
	PI0012(12,	1,new BigDecimal(0.3),"CLTC_", "创蓝身份认证二要素产品"),
	PI0013(13,	100000,new BigDecimal(28500),"CLTC_", "创蓝身份认证二要素产品"),
	PI0014(14,	500000,new BigDecimal(135000),"CLTC_", "创蓝身份认证二要素产品"),
	PI0015(15,	1000000,new BigDecimal(240000),"CLTC_", "创蓝身份认证二要素产品"),
	PI0016(16,	1,new BigDecimal(0.3),"CLFC_", "创蓝银行卡鉴权产品"),
	PI0017(17,	100000,new BigDecimal(28500),"CLFC_", "创蓝银行卡鉴权产品"),
	PI0018(18,	500000,new BigDecimal(135000),"CLFC_", "创蓝银行卡鉴权产品"),
	PI0019(19,	1000000,new BigDecimal(240000),"CLFC_", "创蓝银行卡鉴权产品"),
	PI0020(20,	1,new BigDecimal(0.5),"CLMS_", "创蓝运营商在网状态查询产品"),
	PI0021(21,	100000,new BigDecimal(47500),"CLMS_", "创蓝运营商在网状态查询产品"),
	PI0022(22,	500000,new BigDecimal(225000),"CLMS_", "创蓝运营商在网状态查询产品"),
	PI0023(23,	1000000,new BigDecimal(400000),"CLMS_", "创蓝运营商在网状态查询产品"),
	PI0024(24,	1,new BigDecimal(0.5),"CLCT_", "创蓝运营商三要素查询产品"),
	PI0025(25,	100000,new BigDecimal(47500),"CLCT_", "创蓝运营商三要素查询产品"),
	PI0026(26,	500000,new BigDecimal(225000),"CLCT_", "创蓝运营商三要素查询产品"),
	PI0027(27,	1000000,new BigDecimal(400000),"CLCT_", "创蓝运营商三要素查询产品"),
	PI0028(28,	1,new BigDecimal(0.74),"CLFI_", "创蓝人证比对产品"),
	PI0029(29,	50000,new BigDecimal(35150),"CLFI_", "创蓝人证比对产品"),
	PI0030(30,	200000,new BigDecimal(133200),"CLFI_", "创蓝人证比对产品"),
	PI0031(31,	1000000,new BigDecimal(592000),"CLFI_", "创蓝人证比对产品"),
	PI0032(32,	1,new BigDecimal(0.12),"CLFF_", "创蓝人脸比对产品"),
	PI0033(33,	100000,new BigDecimal(11400),"CLFF_", "创蓝人脸比对产品"),
	PI0034(34,	500000,new BigDecimal(54000),"CLFF_", "创蓝人脸比对产品"),
	PI0035(35,	1000000,new BigDecimal(96000),"CLFF_", "创蓝人脸比对产品"),
	PI0036(36,	1,new BigDecimal(0.12),"CLCL_", "创蓝活体检测产品"),
	PI0037(37,	100000,new BigDecimal(11400),"CLCL_", "创蓝活体检测产品"),
	PI0038(38,	500000,new BigDecimal(54000),"CLCL_", "创蓝活体检测产品"),
	PI0039(39,	1000000,new BigDecimal(96000),"CLCL_", "创蓝活体检测产品"),
	PI0040(40,	1,new BigDecimal(0.07),"CLIO_", "创蓝身份证OCR产品"),
	PI0041(41,	100000,new BigDecimal(6650),"CLIO_", "创蓝身份证OCR产品"),
	PI0042(42,	500000,new BigDecimal(31500),"CLIO_", "创蓝身份证OCR产品"),
	PI0043(43,	1000000,new BigDecimal(56000),"CLIO_", "创蓝身份证OCR产品"),
	PI0044(44,	1,new BigDecimal(0.07),"CLLO_", "创蓝营业执照OCR产品"),
	PI0045(45,	100000,new BigDecimal(6650),"CLLO_", "创蓝营业执照OCR产品"),
	PI0046(46,	500000,new BigDecimal(31500),"CLLO_", "创蓝营业执照OCR产品"),
	PI0047(47,	1000000,new BigDecimal(56000),"CLLO_", "创蓝营业执照OCR产品"),
	PI0048(48,	1,new BigDecimal(0.07),"CLBO_", "创蓝银行卡OCR产品"),
	PI0049(49,	100000,new BigDecimal(6650),"CLBO_", "创蓝银行卡OCR产品"),
	PI0050(50,	500000,new BigDecimal(31500),"CLBO_", "创蓝银行卡OCR产品"),
	PI0051(51,	1000000,new BigDecimal(56000),"CLBO_", "创蓝银行卡OCR产品"),
	PI0052(52,	1,new BigDecimal(0.07),"CLDO_", "创蓝驾驶证OCR产品"),
	PI0053(53,	100000,new BigDecimal(6650),"CLDO_", "创蓝驾驶证OCR产品"),
	PI0054(54,	500000,new BigDecimal(31500),"CLDO_", "创蓝驾驶证OCR产品"),
	PI0055(55,	1000000,new BigDecimal(56000),"CLDO_", "创蓝驾驶证OCR产品"),
	PI0056(56,	1,new BigDecimal(0.35),"FCJX_", "创蓝银行卡鉴权精细产品"),
	PI0057(57,	100000,new BigDecimal(33250),"FCJX_", "创蓝银行卡鉴权精细产品"),
	PI0058(58,	500000,new BigDecimal(157500),"FCJX_", "创蓝银行卡鉴权精细产品"),
	PI0059(59,	1000000,new BigDecimal(280000),"FCJX_", "创蓝银行卡鉴权精细产品");
	
	public Integer id;
	public Integer number;
	public BigDecimal money;
	public String orderCode;
	public String subjectName;
	
	private ProductPayTypeEnum(Integer id,Integer number, BigDecimal money,String orderCode,String subjectName) {
		this.id = id;
		this.number = number;
		this.money = money;
		this.orderCode = orderCode;
		this.subjectName = subjectName;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public static ProductPayTypeEnum getProductPayTypeEnum(Integer id){
		ProductPayTypeEnum result = null;
		ProductPayTypeEnum[] pptes = ProductPayTypeEnum.values();
		for (ProductPayTypeEnum ppte : pptes) {
			if (ppte.getId()==id) {
				result = ppte;
				break;
			}
		}
		return result;
	}
	

}
