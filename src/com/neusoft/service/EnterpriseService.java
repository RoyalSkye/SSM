package com.neusoft.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.neusoft.po.Enterprise;
import com.neusoft.po.Freelisten;

public interface EnterpriseService {

	public Boolean updateEnterprise(int qid,String name,
		String introduction,String text,MultipartFile file,HttpServletRequest request) throws Exception;
	public Boolean updateEnterprise(Enterprise e) throws Exception;
}
