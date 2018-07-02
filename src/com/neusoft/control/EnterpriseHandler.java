package com.neusoft.control;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.neusoft.po.Enterprise;

import com.neusoft.service.impl.EnterpriseServiceBean;

import com.neusoft.service.EnterpriseService;



@Controller
public class EnterpriseHandler {
	@Autowired
	private EnterpriseService enterpriseService;

	@RequestMapping(value="/test/EnterpriseHandler_findEnterpriseById")
	@ResponseBody
	public Enterprise findEnterpriseById(int qid) throws Exception{
		return enterpriseService.findEnterpriseById(qid);
	}
	
	@RequestMapping(value="/test/EnterpriseHandler_updateEnterprise")
	@ResponseBody
	public String updateEnterprise(Enterprise e) throws Exception{
		if(enterpriseService.updateEnterprise(e)){
			return "{\"result\":true}";
		}else{
			return "{\"result\":false}";
		}
	}
}
