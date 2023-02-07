package main.java.cn.service;

import main.java.cn.common.BackResult;
import main.java.cn.domain.FileUploadDomain;

public interface FileUploadBusService {
	
	BackResult<FileUploadDomain> save(FileUploadDomain domain);
	
	BackResult<FileUploadDomain> findById(String id);
}
