package main.java.cn.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 历史检测导出
 *
 */
public class CvsFilePathExport implements Serializable{
	
	private String zipName;
	
	private String zipSize;
	
	private String createTime;
		
	private String thereCount;
	
	private String unknownSize;
		
	private String sixCount;
			
	private String shutCount;
			
	private String totalCount;

	public String getZipName() {
		return zipName;
	}

	public void setZipName(String zipName) {
		this.zipName = zipName;
	}

	public String getZipSize() {
		return zipSize;
	}

	public void setZipSize(String zipSize) {
		this.zipSize = zipSize;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getThereCount() {
		return thereCount;
	}

	public void setThereCount(String thereCount) {
		this.thereCount = thereCount;
	}

	public String getUnknownSize() {
		return unknownSize;
	}

	public void setUnknownSize(String unknownSize) {
		this.unknownSize = unknownSize;
	}

	public String getSixCount() {
		return sixCount;
	}

	public void setSixCount(String sixCount) {
		this.sixCount = sixCount;
	}

	public String getShutCount() {
		return shutCount;
	}

	public void setShutCount(String shutCount) {
		this.shutCount = shutCount;
	}

	public String getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
}
