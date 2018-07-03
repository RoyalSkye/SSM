package com.neusoft.control;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neusoft.po.Freelistenbook;
import com.neusoft.service.FreelistenbookService;
import com.neusoft.service.impl.FreelistenbookServiceBean;

@Controller
public class FreelistenbookHandler {
	
	@Autowired
	private FreelistenbookService freelistenbookService;
	
	@RequestMapping(value="/test/FreelistenbookHandler_findAllFreelistenbook")
	@ResponseBody
	public List<Freelistenbook> findAllFreelistenbook() throws Exception{
		return freelistenbookService.findAllFreelistenbook();
	}
	
	@RequestMapping(value="/test/FreelistenbookHandler_findFreelistenbook")
	@ResponseBody
	public List<Freelistenbook> findFreelistenbook(HttpServletRequest request) throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		String fid=request.getParameter("fid");
		String cname=request.getParameter("cname");
		String starttime=request.getParameter("starttime");
		String endtime=request.getParameter("endtime");
		map.put("fid", fid);
		map.put("cname", cname);
		map.put("starttime", starttime);
		map.put("endtime", endtime);
		return freelistenbookService.findFreelistenbook(map);
	}
	
	@RequestMapping(value="/test/FreelistenbookHandler_updateFreelistenbook")
	@ResponseBody
	public String updateFreelistenbook(int id) throws Exception{
		if(freelistenbookService.updateFreelistenbook(id)){
			return "{\"result\":true}";
		}else{
			return "{\"result\":false}";
		}
	}
	
	

}
