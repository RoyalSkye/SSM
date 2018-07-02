package com.neusoft.service.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.neusoft.mapper.EnterpriseMapper;
import com.neusoft.po.Enterprise;

@Service
public class EnterpriseServiceBean implements com.neusoft.service.EnterpriseService {

	@Autowired
	private EnterpriseMapper mapper;

	public Boolean updateEnterprise(Enterprise e) throws Exception{
		boolean isok=false;
		int result=mapper.updateEnterprise(e);
		if(result>0){
			isok=true;
		}else{
			isok=false;
		}
		return isok;
	}

	@Override
	public Enterprise findEnterpriseById(int qid) throws Exception {
		return mapper.findEnterpriseById(qid);
	}

}
