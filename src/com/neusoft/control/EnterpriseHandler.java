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
import com.neusoft.tools.FileTools;
import com.neusoft.service.EnterpriseService;



@Controller
public class EnterpriseHandler {
	@Autowired
	private EnterpriseService enterpriseService;

	@RequestMapping(value="/test/EnterpriseHandler_findEnterpriseById")
	@ResponseBody
	public Enterprise findEnterpriseById(int qid) throws Exception{
		System.out.println("qid="+qid);
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
	@RequestMapping(value="/test/EnterpriseHandler_saveimg")
	@ResponseBody
	public String saveimg(MultipartFile file,HttpServletRequest request) throws Exception{
		if(file==null){
			System.out.println("ÎÄ¼þÎª¿Õ");
			return "{\"result\":false}";
		}
		String url=FileTools.saveimg(file,request);
		//System.out.println("---------------------url:"+url);
		if(url==null||url==""){
			return "{\"result\":false}";
		}else{
			//result="../upload/15307951697841.jpg";
			//System.out.println("{\"result\":true,\"imgurl\":\""+url+"\"}");
			return "{\"result\":true,\"imgurl\":\""+url+"\"}";
		}
	}
	
}
