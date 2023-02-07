package main.java.cn.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 文件检测记录信息-代理商
 *
 */
public class CvsFilePathDlsDomain implements Serializable{

	private static final long serialVersionUID = -4942102867233558266L;

	private String id;
	
	private String thereCount;
	
	private String sixCount;
	
	private String shutCount;
	
	private String unknownSize;
	
	private String zipName;
	
	private Date createTime;
	
	private String isDeleted = "0";
	
	private String fileCode; // 对应的文件id

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getThereCount() {
		return thereCount;
	}

	public void setThereCount(String thereCount) {
		this.thereCount = thereCount;
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

	public String getUnknownSize() {
		return unknownSize;
	}

	public void setUnknownSize(String unknownSize) {
		this.unknownSize = unknownSize;
	}

	public String getZipName() {
		return zipName;
	}

	public void setZipName(String zipName) {
		this.zipName = zipName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getFileCode() {
		return fileCode;
	}

	public void setFileCode(String fileCode) {
		this.fileCode = fileCode;
	}

	
}
