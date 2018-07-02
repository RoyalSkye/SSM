package com.neusoft.service.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.neusoft.mapper.EnterpriseMapper;
import com.neusoft.po.Enterprise;
import com.neusoft.tools.Tools;

public class EnterpriseServiceBean implements com.neusoft.service.EnterpriseService {

	EnterpriseMapper mapper;
	@Override
	public Boolean updateEnterprise(int qid, String name, String introduction, String text, MultipartFile file,
			HttpServletRequest request) throws Exception {
		Boolean flag = mapper.updateEnterprise(new Enterprise(qid,name,Tools.upload(file, request),introduction,text))>0?true:false;
		
		return flag;	
	}
	
	public Boolean updateEnterprise(Enterprise e) throws Exception{
		Boolean flag = mapper.updateEnterprise(e)>0?true:false;
		return flag;
	}

}
