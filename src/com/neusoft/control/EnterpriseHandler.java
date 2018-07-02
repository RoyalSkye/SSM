package com.neusoft.control;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.neusoft.po.Enterprise;
import com.neusoft.service.impl.EnterpriseServiceBean;

public class EnterpriseHandler {
	@Autowired
	EnterpriseServiceBean service;

	@RequestMapping(value="/test/EnterpriseHandler_updateEnterprise")
	@ResponseBody
	public String updateEnterprise(Enterprise en){
		String flag ;
		try {
			flag = service.updateEnterprise(en)==true?"{\"result\":true}":"{\"result\":false}";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			flag = "{\"result\":false}" ; 
			e.printStackTrace();
		}
		return flag;
	}
}
